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
import net.leanix.api.models.JobResponse;
import net.leanix.api.models.StartSyncWorkspaceRequest;
import org.junit.Test;


/**
 * API tests for EamApi
 */
public class EamApiTest {

    private final EamApi api = new EamApi();

    
    /**
     * createRandomWorkspace
     *
     * Starts generation of a random workspace. This method is useful if you want to setup a large workspace in order to get an impression of pathfinder&#39;s performance on large workspaces.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRandomWorkspaceTest() throws ApiException {
        Integer numberOfApplications = null;
        Integer levelCountItComponents = null;
        // JobResponse response = api.createRandomWorkspace(numberOfApplications, levelCountItComponents);

        // TODO: test validations
    }
    
    /**
     * startSync
     *
     * Starts the synchronization of a workspace.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startSyncTest() throws ApiException {
        StartSyncWorkspaceRequest body = null;
        // JobResponse response = api.startSync(body);

        // TODO: test validations
    }
    
}