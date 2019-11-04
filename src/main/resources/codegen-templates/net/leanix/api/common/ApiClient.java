package net.leanix.api.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.leanix.api.common.auth.*;
import okhttp3.*;
import okhttp3.HttpUrl.Builder;

import java.io.*;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class was originally created with swagger-codegen-maven-plugin's file version 2.1.6 and is slightly modified with features:
 * <ul>
 * <li>Added <code>ClientCredentialRefreshingOAuth</code> class used to fetch an JWT token with cliendID / clientSecret credetials.</li>
 * </ul>
 */
public class ApiClient {
  private Map<String, String> defaultHeaderMap = new HashMap<String, String>();
  private String basePath = "https://local-eam.leanix.net/demo/api/v1";
  private int connectionTimeout = 0;

  private OkHttpClient httpClient;
  private JSON json;
  private String tempFolderPath = null;

  private Map<String, Authentication> authentications;

  private int statusCode;
  private Map<String, List<String>> responseHeaders;

  private DateFormat dateFormat;

  public ApiClient() {
    json = new JSON();
    httpClient = buildHttpClient();

    /** rwe: Disable this feature, that was introduced in swagger-codegen. We want to use the ISO 8601.

     // Use RFC3339 format for date and datetime.
     // See http://xml2rfc.ietf.org/public/rfc/html/rfc3339.html#anchor14
     this.dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

     // Use UTC as the default time zone.
     this.dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

     this.json.setDateFormat((DateFormat) dateFormat.clone());
     */
    // Set default User-Agent.
    setUserAgent("Swagger-Codegen/1.0.0/java");

    // Setup authentications (key: authentication name, value: authentication).
    authentications = new HashMap<String, Authentication>();
    authentications.put("token", new ClientCredentialRefreshingOAuth());
    authentications.put("apiKey", new ApiKeyAuth("header", "Api-Key"));
    // Prevent the authentications from being modified.
    authentications = Collections.unmodifiableMap(authentications);
  }

  /**
   * Gets the JSON instance to do JSON serialization and deserialization.
   */
  public JSON getJSON() {
    return json;
  }

  public String getBasePath() {
    return basePath;
  }

  public ApiClient setBasePath(String basePath) {
    this.basePath = basePath;
    return this;
  }

  /**
   * Gets the status code of the previous request
   */
  public int getStatusCode() {
    return statusCode;
  }

  /**
   * Gets the response headers of the previous request
   */
  public Map<String, List<String>> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Get authentications (key: authentication name, value: authentication).
   */
  public Map<String, Authentication> getAuthentications() {
    return authentications;
  }

  /**
   * Get authentication for the given name.
   *
   * @param authName The authentication name
   * @return The authentication, null if not found
   */
  public Authentication getAuthentication(String authName) {
    return authentications.get(authName);
  }

  /**
   * Helper method to set username for the first HTTP basic authentication.
   */
  public void setUsername(String username) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof HttpBasicAuth) {
        ((HttpBasicAuth) auth).setUsername(username);
        return;
      }
    }
    throw new RuntimeException("No HTTP basic authentication configured!");
  }

  /**
   * Helper method to set password for the first HTTP basic authentication.
   */
  public void setPassword(String password) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof HttpBasicAuth) {
        ((HttpBasicAuth) auth).setPassword(password);
        return;
      }
    }
    throw new RuntimeException("No HTTP basic authentication configured!");
  }

  /**
   * Helper method to set API key value for the first API key authentication.
   */
  public void setApiKey(String apiKey) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof ApiKeyAuth) {
        ((ApiKeyAuth) auth).setApiKey(apiKey);
        return;
      }
    }
    throw new RuntimeException("No API key authentication configured!");
  }

  /**
   * Helper method to set API key prefix for the first API key authentication.
   */
  public void setApiKeyPrefix(String apiKeyPrefix) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof ApiKeyAuth) {
        ((ApiKeyAuth) auth).setApiKeyPrefix(apiKeyPrefix);
        return;
      }
    }
    throw new RuntimeException("No API key authentication configured!");
  }

  public void setClientCredentials(String clientId, String clientSecret, URI tokenUrl) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof ClientCredentialRefreshingOAuth) {
        ((ClientCredentialRefreshingOAuth) auth).setClientCredentials(clientId, clientSecret, tokenUrl);
        ((ClientCredentialRefreshingOAuth) auth).setClient(httpClient);
        return;
      }
    }
    throw new RuntimeException("No OAuth2 authentication configured!");
  }

  public void setApiToken(String apiToken, URI tokenUrl) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof ClientCredentialRefreshingOAuth) {
        ((ClientCredentialRefreshingOAuth) auth).setClientCredentials("apitoken", apiToken, tokenUrl);
        ((ClientCredentialRefreshingOAuth) auth).setClient(httpClient);
        return;
      }
    }
    throw new RuntimeException("No PersonalAccessToken authentication configured!");
  }

  /**
   * only for compatibility, use setApiToken instead.
   */
  @Deprecated
  public void setPersonalAccessToken(String personalAccessToken, URI tokenUrl) {
    setApiToken(personalAccessToken, tokenUrl);
  }

  /**
   * Helper method to set access token for the first OAuth2 authentication.
   */
  public void setAccessToken(String accessToken) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof OAuth) {
        ((OAuth) auth).setAccessToken(accessToken);
        return;
      }
    }
    throw new RuntimeException("No OAuth2 authentication configured!");
  }

  /**
   * Set the User-Agent header's value (by adding to the default header map).
   */
  public ApiClient setUserAgent(String userAgent) {
    addDefaultHeader("User-Agent", userAgent);
    return this;
  }

  /**
   * Add a default header.
   *
   * @param key   The header's key
   * @param value The header's value
   */
  public ApiClient addDefaultHeader(String key, String value) {
    defaultHeaderMap.put(key, value);
    return this;
  }

  /**
   * The path of temporary folder used to store downloaded files from endpoints
   * with file response. The default value is <code>null</code>, i.e. using
   * the system's default tempopary folder.
   *
   * @see "https://docs.oracle.com/javase/7/docs/api/java/io/File.html#createTempFile(java.lang.String,%20java.lang.String,%20java.io.File)"
   */
  public String getTempFolderPath() {
    return tempFolderPath;
  }

  public ApiClient setTempFolderPath(String tempFolderPath) {
    this.tempFolderPath = tempFolderPath;
    return this;
  }

  /**
   * Connect timeout (in milliseconds).
   */
  public int getConnectTimeout() {
    return connectionTimeout;
  }

  /**
   * Set the connect timeout (in milliseconds).
   * A value of 0 means no timeout, otherwise values must be between 1 and
   * {@link Integer#MAX_VALUE}.
   */
  public ApiClient setConnectTimeout(int connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    httpClient = httpClient.newBuilder().connectTimeout(connectionTimeout, TimeUnit.MILLISECONDS).build();
    return this;
  }

  /**
   * Get the date format used to parse/format date parameters.
   */
  public DateFormat getDateFormat() {
    return dateFormat;
  }

  /**
   * Set the date format used to parse/format date parameters.
   */
  public ApiClient setDateFormat(DateFormat dateFormat) {
    this.dateFormat = dateFormat;
    // also set the date format for model (de)serialization with Date properties
    this.json.setDateFormat((DateFormat) dateFormat.clone());
    return this;
  }

  /**
   * Parse the given string into Date object.
   */
  public Date parseDate(String str) {
    try {
      return dateFormat.parse(str);
    } catch (java.text.ParseException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Format the given Date object into string.
   */
  public String formatDate(Date date) {
    return dateFormat.format(date);
  }

  /**
   * Format the given parameter object into string.
   */
  public String parameterToString(Object param) {
    if (param == null) {
      return "";
    } else if (param instanceof Date) {
      return formatDate((Date) param);
    } else if (param instanceof Collection) {
      StringBuilder b = new StringBuilder();
      for (Object o : (Collection) param) {
        if (b.length() > 0) {
          b.append(",");
        }
        b.append(String.valueOf(o));
      }
      return b.toString();
    } else {
      return String.valueOf(param);
    }
  }

  /*
    Format to {@code Pair} objects.
  */
  public List<Pair> parameterToPairs(String collectionFormatParam, String name, Object value) {
    List<Pair> params = new ArrayList<Pair>();

    // preconditions
    if (name == null || name.isEmpty() || value == null)
      return params;

    Collection valueCollection = null;
    if (value instanceof Collection) {
      valueCollection = (Collection) value;
    } else {
      params.add(new Pair(name, parameterToString(value)));
      return params;
    }

    if (valueCollection.isEmpty()) {
      return params;
    }

    // get the collection format
    String collectionFormat = (collectionFormatParam == null || collectionFormatParam.isEmpty() ? "csv" : collectionFormatParam); // default: csv

    // create the params based on the collection format
    if (collectionFormat.equals("multi")) {
      for (Object item : valueCollection) {
        params.add(new Pair(name, parameterToString(item)));
      }

      return params;
    }

    String delimiter = ",";

    if (collectionFormat.equals("csv")) {
      delimiter = ",";
    } else if (collectionFormat.equals("ssv")) {
      delimiter = " ";
    } else if (collectionFormat.equals("tsv")) {
      delimiter = "\t";
    } else if (collectionFormat.equals("pipes")) {
      delimiter = "|";
    }

    StringBuilder sb = new StringBuilder();
    for (Object item : valueCollection) {
      sb.append(delimiter);
      sb.append(parameterToString(item));
    }

    params.add(new Pair(name, sb.substring(1)));

    return params;
  }

  /**
   * Check if the given MIME is a JSON MIME.
   * JSON MIME examples:
   * application/json
   * application/json; charset=UTF8
   * APPLICATION/JSON
   */
  public boolean isJsonMime(String mime) {
    return mime != null && mime.matches("(?i)application\\/json(;.*)?");
  }

  /**
   * Select the Accept header's value from the given accepts array:
   * if JSON exists in the given array, use it;
   * otherwise use all of them (joining into a string)
   *
   * @param accepts The accepts array to select from
   * @return The Accept header to use. If the given array is empty,
   * null will be returned (not to set the Accept header explicitly).
   */
  public String selectHeaderAccept(String[] accepts) {
    if (accepts.length == 0) {
      return null;
    }
    for (String accept : accepts) {
      if (isJsonMime(accept)) {
        return accept;
      }
    }
    return StringUtil.join(accepts, ",");
  }

  /**
   * Select the Content-Type header's value from the given array:
   * if JSON exists in the given array, use it;
   * otherwise use the first one of the array.
   *
   * @param contentTypes The Content-Type array to select from
   * @return The Content-Type header to use. If the given array is empty,
   * JSON will be used.
   */
  public String selectHeaderContentType(String[] contentTypes) {
    if (contentTypes.length == 0) {
      return "application/json";
    }
    for (String contentType : contentTypes) {
      if (isJsonMime(contentType)) {
        return contentType;
      }
    }
    return contentTypes[0];
  }

  /**
   * Escape the given string to be used as URL query value.
   */
  public String escapeString(String str) {
    try {
      return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
    } catch (UnsupportedEncodingException e) {
      return str;
    }
  }

  /**
   * Serialize the given Java object into string entity according the given
   * Content-Type (only JSON is supported for now).
   */
  public RequestBody serialize(Object obj, String contentType) throws ApiException {
    try {
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      ObjectOutputStream os = new ObjectOutputStream(out);
      os.writeObject(obj);
      byte[] objAsBytes = out.toByteArray();
      out.close();
      os.close();

      return RequestBody.create(objAsBytes, okhttp3.MediaType.get(contentType));
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  /**
   * Deserialize response body to Java object according to the Content-Type.
   */
  public <T> T deserialize(okhttp3.Response response, Class<T> returnType) throws ApiException {
    // Handle file downloading.
    if (returnType.equals(File.class)) {
      @SuppressWarnings("unchecked")
      T file = (T) downloadFileFromResponse(response);
      return file;
    }
    ResponseBody body = response.body();
    if (body == null) {
      return null;
    }
    String contentType = null;
    List<String> contentTypes = response.headers().toMultimap().get("Content-Type");
    if (contentTypes != null && !contentTypes.isEmpty())
      contentType = contentTypes.get(0);
    if (contentType == null)
      throw new ApiException(500, "missing Content-Type in response");
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      return objectMapper.readValue(body.string(), returnType);
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  /**
   * Download file from the given response.
   *
   * @throws ApiException If fail to read file content from response and write to disk
   */
  public File downloadFileFromResponse(okhttp3.Response response) throws ApiException {
    try {
      File file = prepareDownloadFile(response);
      ResponseBody body = response.body();
      if (body == null) {
        throw new ApiException("Response body was null, but expected file!");
      }
      Files.copy(body.byteStream(), file.toPath());
      return file;
    } catch (IOException e) {
      throw new ApiException(e);
    }
  }

  public File prepareDownloadFile(okhttp3.Response response) throws IOException {
    String filename = null;
    String contentDisposition = response.headers().toMultimap().get("Content-Disposition").stream().findAny().orElse(null);
    if (contentDisposition != null && !"".equals(contentDisposition)) {
      // Get filename from the Content-Disposition header.
      Pattern pattern = Pattern.compile("filename=['\"]?([^'\"\\s]+)['\"]?");
      Matcher matcher = pattern.matcher(contentDisposition);
      if (matcher.find())
        filename = matcher.group(1);
    }

    String prefix = null;
    String suffix = null;
    if (filename == null) {
      prefix = "download-";
      suffix = "";
    } else {
      int pos = filename.lastIndexOf(".");
      if (pos == -1) {
        prefix = filename + "-";
      } else {
        prefix = filename.substring(0, pos) + "-";
        suffix = filename.substring(pos);
      }
      // File.createTempFile requires the prefix to be at least three characters long
      if (prefix.length() < 3)
        prefix = "download-";
    }

    if (tempFolderPath == null)
      return File.createTempFile(prefix, suffix);
    else
      return File.createTempFile(prefix, suffix, new File(tempFolderPath));
  }

  /**
   * Invoke API by sending HTTP request with the given options.
   *
   * @param path         The sub-path of the HTTP URL
   * @param method       The request method, one of "GET", "POST", "PUT", and "DELETE"
   * @param queryParams  The query parameters
   * @param body         The request body object
   * @param headerParams The header parameters
   * @param accept       The request's Accept header
   * @param contentType  The request's Content-Type header
   * @param authNames    The authentications to apply
   * @param returnType   The return type into which to deserialize the response
   * @return The response body in type of string
   */
  public <T> T invokeAPI(String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, String accept, String contentType, String[] authNames, Class<T> returnType) throws ApiException {
    updateParamsForAuth(new String[]{"token", "apiKey"}/*authNames*/, queryParams, headerParams);

    // Not using `.target(this.basePath).path(path)` below,
    // to support (constant) query string in `path`, e.g. "/posts?draft=1"
    String targetPath = this.basePath + path;
    HttpUrl parsedUrl = HttpUrl.parse(targetPath);
    if (parsedUrl == null) {
      throw new ApiException("Failed to parse url: '" + targetPath + "'!");
    }
    Builder urlBuilder = parsedUrl.newBuilder();
    urlBuilder = urlBuilder.addQueryParameter("Accept", accept);
    for (Pair queryParam : queryParams) {
      if (queryParam.getValue() != null) {
        urlBuilder = urlBuilder.addQueryParameter(queryParam.getName(), queryParam.getValue());
      }
    }
    parsedUrl = urlBuilder.build();

    Request.Builder reqBuilder = new Request.Builder();

    for (String key : headerParams.keySet()) {
      String value = headerParams.get(key);
      if (value != null) {
        reqBuilder = reqBuilder.addHeader(key, value);
      }
    }

    for (String key : defaultHeaderMap.keySet()) {
      if (!headerParams.containsKey(key)) {
        String value = defaultHeaderMap.get(key);
        if (value != null) {
          reqBuilder = reqBuilder.addHeader(key, value);
        }
      }
    }

    RequestBody reqBody = serialize(body, contentType);

    if ("GET".equals(method)) {
      reqBuilder = reqBuilder.get();
    } else if ("POST".equals(method)) {
      reqBuilder = reqBuilder.post(reqBody);
    } else if ("PUT".equals(method)) {
      reqBuilder = reqBuilder.put(reqBody);
    } else if ("DELETE".equals(method)) {
      reqBuilder = reqBuilder.delete();
    } else {
      throw new ApiException(500, "unknown method type " + method);
    }
    okhttp3.Response response;
    try {
      response = httpClient.newCall(reqBuilder.build()).execute();
    }catch(IOException e) {
      throw new ApiException("Failed to execute request: " + e.getMessage());
    }

    statusCode = response.code();
    responseHeaders = buildResponseHeaders(response);

    if (statusCode == 204) { // HTTP Status for no content
      return null;
    } else if (response.isSuccessful()) {
      if (returnType == null)
        return null;
      else
        return deserialize(response, returnType);
    } else {
      String message = "error";
      String respBody = null;
      ResponseBody responseBody = response.body();
      if (responseBody != null) {
        try {
          respBody = responseBody.string();
          message = respBody;
        } catch (IOException | RuntimeException e) {
          // e.printStackTrace();
        }
      }
      throw new ApiException(
          response.code(),
          message,
          buildResponseHeaders(response),
          respBody);
    }
  }

  /**
   * Build the Client used to make HTTP requests.
   */
  private OkHttpClient buildHttpClient() {
    return new OkHttpClient();
  }

  private Map<String, List<String>> buildResponseHeaders(okhttp3.Response response) {
    return response.headers().toMultimap();
  }

  /**
   * Update query and header parameters based on authentication settings.
   *
   * @param authNames The authentications to apply
   */
  private void updateParamsForAuth(String[] authNames, List<Pair> queryParams, Map<String, String> headerParams) throws ApiException {
    for (String authName : authNames) {
      Authentication auth = authentications.get(authName);
      if (auth == null)
        throw new RuntimeException("Authentication undefined: " + authName);
      auth.applyToParams(queryParams, headerParams);
    }
  }
}
