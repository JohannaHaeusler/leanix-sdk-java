/**
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 0.1.8-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.models.AuthorizationRolesResponse;
import net.leanix.api.models.DatamodelDefinitionResponse;
import net.leanix.api.models.ViewModelResponse;
import net.leanix.api.models.AuthorizationRole;
import net.leanix.api.models.BasicResponse;
import net.leanix.api.models.DatamodelUpdateResponse;
import net.leanix.api.models.DatamodelDefinition;
import org.junit.Test;


/**
 * API tests for ModelsApi
 */
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
        // AuthorizationRolesResponse response = api.getAuthorization();

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
        // DatamodelDefinitionResponse response = api.getDataModel();

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
        // DatamodelDefinitionResponse response = api.getEnrichedDataModel();

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
        // ViewModelResponse response = api.getViewModel();

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
        java.util.List<AuthorizationRole> body = null;
        // BasicResponse response = api.updateAuthorization(body);

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
        DatamodelDefinition body = null;
        Boolean force = null;
        // DatamodelUpdateResponse response = api.updateDataModel(body, force);

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
        String body = null;
        // BasicResponse response = api.updateViewModel(body);

        // TODO: test validations
    }
    
}