package net.leanix.api;

import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiException;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;
import net.leanix.api.models.GraphQLRequest;
import net.leanix.api.models.GraphQLResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GraphqlApi {
    private ApiClient apiClient;

    public GraphqlApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GraphqlApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * processGraphQL
     * Processes GraphQL requests
     *
     * @param request (required)
     * @return GraphQLResult
     * @throws ApiException if fails to make API call
     */
    public GraphQLResult processGraphQL(GraphQLRequest request) throws ApiException {
        Object localVarPostBody = request;

        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling processGraphQL");
        }

        // create path and map variables
        String localVarPath = "/graphql".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarAccept, localVarContentType, localVarAuthNames, GraphQLResult.class);
    }

}
