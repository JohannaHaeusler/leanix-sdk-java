package net.leanix.api;

import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiException;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;
import net.leanix.api.models.TodoData;
import net.leanix.api.models.TodoListResponse;
import net.leanix.api.models.TodoResponse;

import java.util.*;


public class TodosApi {
    private ApiClient apiClient;

    public TodosApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TodosApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * createTodo
     * Saves a todo in the database
     *
     * @param body        Creates a new Todo item (optional)
     * @param workspaceId ID of the Workspace that the Todo shall be created in. (optional)
     * @return TodoResponse
     * @throws ApiException if fails to make API call
     */
    public TodoResponse createTodo(TodoData body, UUID workspaceId) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/todos".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarAccept, localVarContentType, localVarAuthNames, TodoResponse.class);
    }

    /**
     * deleteTodo
     * deletes a todo item based on provided id.
     *
     * @param id          the id of the todo item (required)
     * @param workspaceId the workspaceId in case that the SYSTEM deletes the todo (optional)
     * @throws ApiException if fails to make API call
     */
    public void deleteTodo(UUID id, UUID workspaceId) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTodo");
        }

        // create path and map variables
        String localVarPath = "/todos/{id}".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    }

    /**
     * getTodo
     * Retrieves a todo by ID
     *
     * @param id (required)
     * @return TodoResponse
     * @throws ApiException if fails to make API call
     */
    public TodoResponse getTodo(UUID id) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getTodo");
        }

        // create path and map variables
        String localVarPath = "/todos/{id}".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarAccept, localVarContentType, localVarAuthNames, TodoResponse.class);
    }

    /**
     * getTodos
     * Retrieves all todos a user can read.
     *
     * @param type        Specifies the todo type (optional)
     * @param status      Specifies the todo status (optional)
     * @param factSheetId Specifies the ID of the Fact Sheet the todo is connected to - only works with manual Todos (optional)
     * @param userId      Specify the user Id for the user to look for (optional)
     * @param workspaceId Id of the workspace to get the TodoItems from. (optional)
     * @param getArchived If set to true, then todos associated with archived factsheets are retrieved as well (optional, default to false)
     * @param size        Specifies the number of Todos to get, (optional, default to 10)
     * @param page        Specifies the page of Todos to get, (optional, default to 1)
     * @return TodoListResponse
     * @throws ApiException if fails to make API call
     */
    public TodoListResponse getTodos(String type, String status, UUID factSheetId, UUID userId, UUID workspaceId, Boolean getArchived, Integer size, Integer page) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/todos".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "factSheetId", factSheetId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "getArchived", getArchived));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarAccept, localVarContentType, localVarAuthNames, TodoListResponse.class);
    }

    /**
     * updateTodo
     * Updates a todo stored in the database.
     *
     * @param id          (required)
     * @param workspaceId ID of the Workspace that the Todo shall be updated in in case that the user is not assigned to one workspace (optional)
     * @param body        todo (optional)
     * @return TodoResponse
     * @throws ApiException if fails to make API call
     */
    public TodoResponse updateTodo(UUID id, UUID workspaceId, TodoData body) throws ApiException {
        Object localVarPostBody = body;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateTodo");
        }

        // create path and map variables
        String localVarPath = "/todos/{id}".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarAccept, localVarContentType, localVarAuthNames, TodoResponse.class);
    }
}
