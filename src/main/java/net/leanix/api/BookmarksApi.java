package net.leanix.api;

import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiException;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;
import net.leanix.api.models.Bookmark;
import net.leanix.api.models.BookmarkListResponse;
import net.leanix.api.models.BookmarkResponse;
import net.leanix.api.models.BookmarkWorkingCopy;

import java.util.*;


public class BookmarksApi {
    private ApiClient apiClient;

    public BookmarksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BookmarksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * createBookmark
     * Saves a bookmark in the database
     *
     * @param body bookmark (optional)
     * @return BookmarkResponse
     * @throws ApiException if fails to make API call
     */
    public BookmarkResponse createBookmark(Bookmark body) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/bookmarks".replaceAll("\\{format\\}", "json");

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

        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarAccept, localVarContentType, localVarAuthNames, BookmarkResponse.class);
    }

    /**
     * deleteBookmark
     * Deletes a bookmark identified by the given ID
     *
     * @param id (required)
     * @throws ApiException if fails to make API call
     */
    public void deleteBookmark(UUID id) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteBookmark");
        }

        // create path and map variables
        String localVarPath = "/bookmarks/{id}".replaceAll("\\{format\\}", "json")
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


        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    }

    /**
     * deleteWorkingCopy
     * Deletes a working copy for a bookmark stored in the database
     *
     * @param id (required)
     * @return BookmarkResponse
     * @throws ApiException if fails to make API call
     */
    public BookmarkResponse deleteWorkingCopy(UUID id) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling deleteWorkingCopy");
        }

        // create path and map variables
        String localVarPath = "/bookmarks/{id}/workingCopy".replaceAll("\\{format\\}", "json")
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

        return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarAccept, localVarContentType, localVarAuthNames, BookmarkResponse.class);
    }

    /**
     * getBookmark
     * Retrieves a bookmark by ID
     *
     * @param id (required)
     * @return BookmarkResponse
     * @throws ApiException if fails to make API call
     */
    public BookmarkResponse getBookmark(UUID id) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getBookmark");
        }

        // create path and map variables
        String localVarPath = "/bookmarks/{id}".replaceAll("\\{format\\}", "json")
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

        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarAccept, localVarContentType, localVarAuthNames, BookmarkResponse.class);
    }

    /**
     * getBookmarks
     * Retrieves all stored bookmarks a user can read.
     *
     * @param bookmarkType Specifies the bookmark type (required)
     * @param groupKey     A key used to separate bookmarks within the same query type (optional)
     * @param sharingType  Specifies the sharing type which the returned bookmarks need to have (optional)
     * @return BookmarkListResponse
     * @throws ApiException if fails to make API call
     */
    public BookmarkListResponse getBookmarks(String bookmarkType, String groupKey, String sharingType) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'bookmarkType' is set
        if (bookmarkType == null) {
            throw new ApiException(400, "Missing the required parameter 'bookmarkType' when calling getBookmarks");
        }

        // create path and map variables
        String localVarPath = "/bookmarks".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bookmarkType", bookmarkType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "groupKey", groupKey));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sharingType", sharingType));

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarAccept, localVarContentType, localVarAuthNames, BookmarkListResponse.class);
    }

    /**
     * updateBookmark
     * Updates a bookmark stored in the database
     *
     * @param id   (required)
     * @param body bookmark (optional)
     * @return BookmarkResponse
     * @throws ApiException if fails to make API call
     */
    public BookmarkResponse updateBookmark(UUID id, Bookmark body) throws ApiException {
        Object localVarPostBody = body;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateBookmark");
        }

        // create path and map variables
        String localVarPath = "/bookmarks/{id}".replaceAll("\\{format\\}", "json")
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

        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarAccept, localVarContentType, localVarAuthNames, BookmarkResponse.class);
    }

    /**
     * updateWorkingCopy
     * Updates a working copy for a bookmark stored in the database
     *
     * @param id   (required)
     * @param body workingCopy (optional)
     * @return BookmarkResponse
     * @throws ApiException if fails to make API call
     */
    public BookmarkResponse updateWorkingCopy(UUID id, BookmarkWorkingCopy body) throws ApiException {
        Object localVarPostBody = body;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateWorkingCopy");
        }

        // create path and map variables
        String localVarPath = "/bookmarks/{id}/workingCopy".replaceAll("\\{format\\}", "json")
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

        return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarAccept, localVarContentType, localVarAuthNames, BookmarkResponse.class);
    }
}
