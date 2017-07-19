/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 3.9.72-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.models.AuthorizationRole;
import net.leanix.api.models.AuthorizationRolesResponse;
import net.leanix.api.models.DataModel;
import net.leanix.api.models.DataModelDefinitionResponse;
import net.leanix.api.models.DataModelUpdateResponse;
import net.leanix.api.models.LanguageResponse;
import net.leanix.api.models.Response;
import net.leanix.api.models.ViewModelDefinition;
import net.leanix.api.models.ViewModelResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModelsApi
 */
@Ignore
public class ModelsApiTest {

    private final ModelsApi api = new ModelsApi();

    
    /**
     * getAuthorization
     *
     * Provides all authorization roles were for each role a set of permission is defined.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuthorizationTest() throws ApiException {
        String workspaceId = null;
        AuthorizationRolesResponse response = api.getAuthorization(workspaceId);

        // TODO: test validations
    }
    
    /**
     * getDataModel
     *
     * Retrieves the model for a workspace
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDataModelTest() throws ApiException {
        String workspaceId = null;
        DataModelDefinitionResponse response = api.getDataModel(workspaceId);

        // TODO: test validations
    }
    
    /**
     * getEnrichedDataModel
     *
     * Retrieves the model for a workspace, including redundant data that makes life easy for the web front end
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEnrichedDataModelTest() throws ApiException {
        String workspaceId = null;
        DataModelDefinitionResponse response = api.getEnrichedDataModel(workspaceId);

        // TODO: test validations
    }
    
    /**
     * getLanguage
     *
     * Get the given language
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLanguageTest() throws ApiException {
        String id = null;
        String workspaceId = null;
        LanguageResponse response = api.getLanguage(id, workspaceId);

        // TODO: test validations
    }
    
    /**
     * getViewModel
     *
     * Retrieves the view model for a workspace
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getViewModelTest() throws ApiException {
        String workspaceId = null;
        ViewModelResponse response = api.getViewModel(workspaceId);

        // TODO: test validations
    }
    
    /**
     * updateAuthorization
     *
     * Updates all authorization roles for a given workspace. This means all existing roles and its permissions will be overriden
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAuthorizationTest() throws ApiException {
        List<AuthorizationRole> body = null;
        String workspaceId = null;
        Response response = api.updateAuthorization(body, workspaceId);

        // TODO: test validations
    }
    
    /**
     * updateDataModel
     *
     * Updates the data model for a workspace
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDataModelTest() throws ApiException {
        DataModel body = null;
        Boolean force = null;
        String workspaceId = null;
        DataModelUpdateResponse response = api.updateDataModel(body, force, workspaceId);

        // TODO: test validations
    }
    
    /**
     * updateLanguage
     *
     * Updates the given language
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLanguageTest() throws ApiException {
        String id = null;
        Object definition = null;
        String workspaceId = null;
        Response response = api.updateLanguage(id, definition, workspaceId);

        // TODO: test validations
    }
    
    /**
     * updateViewModel
     *
     * Updates the view model for a workspace
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateViewModelTest() throws ApiException {
        ViewModelDefinition body = null;
        String workspaceId = null;
        api.updateViewModel(body, workspaceId);

        // TODO: test validations
    }
    
}
