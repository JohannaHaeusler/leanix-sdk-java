/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 0.1.13-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.models.JobStatusResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobsApi
 */
@Ignore
public class JobsApiTest {

    private final JobsApi api = new JobsApi();

    
    /**
     * cancelJob
     *
     * Stop a running job or avoid to start a queued job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelJobTest() throws ApiException {
        String jobId = null;
        JobStatusResponse response = api.cancelJob(jobId);

        // TODO: test validations
    }
    
    /**
     * getJobStatus
     *
     * Provides information about running or finished jobs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobStatusTest() throws ApiException {
        String jobId = null;
        JobStatusResponse response = api.getJobStatus(jobId);

        // TODO: test validations
    }
    
}
