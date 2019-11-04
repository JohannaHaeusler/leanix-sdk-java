package net.leanix.api.common.auth;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.leanix.api.common.ApiException;
import net.leanix.api.common.Pair;
import net.leanix.api.common.responses.AccessTokenResponse;
import okhttp3.*;
import okhttp3.internal.http.HttpHeaders;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Map;

public class ClientCredentialRefreshingOAuth extends OAuth {

    private static final Charset UTF8 = StandardCharsets.UTF_8;

    private boolean accessTokenSetManually = false;

    private OkHttpClient okClient;
    private URI tokenUrl;
    private AccessTokenResponse accessTokenResponse;

    private String clientId;
    private String clientSecret;

    public void setClientCredentials(String clientId, String clientSecret, URI tokenUrl) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.tokenUrl = tokenUrl;
    }

    public void setClient(OkHttpClient okClient) {
        this.okClient = okClient;
    }

    @Override
    public void setAccessToken(String accessToken) {
        // If the access token is set manually here, don't do the token refresh via client credential flow anymore.
        accessTokenSetManually = (accessToken != null);
        accessTokenResponse = null;
        super.setAccessToken(accessToken);
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) throws ApiException {
        // If the access token is set manually, don't do the token refresh via client credential flow anymore.
        // And, if no oauth2 url is specified we can skip fetching as well.
        if (!accessTokenSetManually && tokenUrl != null) {
            if (accessTokenResponse == null || accessTokenResponse.isExpired()) {
                fetchToken();

                // call super to avoid setting the "manually set" flag
                super.setAccessToken(accessTokenResponse.getAccessToken());
            }
        }
        super.applyToParams(queryParams, headerParams);
    }

    private void fetchToken() throws ApiException {
        String basicAuthorizationHeader = buildBasicAuthorizationHeader();

        try {
            HttpUrl parsedUrl = HttpUrl.parse(tokenUrl.toString());
            if(parsedUrl == null) {
                throw new RuntimeException("Could not parse Url '" + tokenUrl + "'!");
            }
            HttpUrl url = parsedUrl.newBuilder().addQueryParameter("grant_type", "client_credentials").build();
            Request req = new Request.Builder()
                .url(url)
                .addHeader("Content-Type", "application/json; charset=utf-8")
                .addHeader("Authorization", basicAuthorizationHeader)
                .method("POST", null).build();
            ObjectMapper objectMapper = new ObjectMapper();
            ResponseBody responseBody = okClient.newCall(req).execute().body();
            if (responseBody == null) {
                throw new RuntimeException("Response body was empty!");
            }
            accessTokenResponse = objectMapper.readValue(responseBody.string(), AccessTokenResponse.class);
        } catch (RuntimeException | IOException ex) {
            throw new ApiException("Failed to retrieve a new oauth token from " + tokenUrl, ex, 0, null);
        }
    }

    private String buildBasicAuthorizationHeader() {
        StringBuilder sb = new StringBuilder(512);
        sb.append(clientId).append(':').append(clientSecret);
        String userAndPw = sb.toString();

        sb.setLength(0);
        sb.append("Basic ").append(Base64.getEncoder().encodeToString(userAndPw.getBytes(UTF8)));
        return sb.toString();
    }

}
