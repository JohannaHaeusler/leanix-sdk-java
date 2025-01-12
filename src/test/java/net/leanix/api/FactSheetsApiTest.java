/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 4.0.217
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.models.FactSheet;
import net.leanix.api.models.FactSheetArchiveParameter;
import net.leanix.api.models.FactSheetListResponse;
import net.leanix.api.models.FactSheetRelation;
import net.leanix.api.models.FactSheetResponse;
import net.leanix.api.models.RelationListResponse;
import net.leanix.api.models.RelationResponse;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FactSheetsApi
 */
@Ignore
public class FactSheetsApiTest {

    private final FactSheetsApi api = new FactSheetsApi();

    
    /**
     * deleteFactSheet
     *
     * Deletes a Fact Sheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void archiveFactSheetTest() throws ApiException {
        String id = null;
        FactSheetArchiveParameter body = null;
        api.archiveFactSheet(id, body);

        // TODO: test validations
    }
    
    /**
     * createFactSheet
     *
     * Creates a Fact Sheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFactSheetTest() throws ApiException {
        FactSheet body = null;
        FactSheetResponse response = api.createFactSheet(body);

        // TODO: test validations
    }
    
    /**
     * createFactSheetRelation
     *
     * Creates the given relation with the Fact Sheet as one side of the relation. When adding constraining relations only the ID of these relations will be used.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFactSheetRelationTest() throws ApiException {
        FactSheetRelation relation = null;
        UUID id = null;
        RelationResponse response = api.createFactSheetRelation(relation, id);

        // TODO: test validations
    }
    
    /**
     * deleteFactSheetRelation
     *
     * Deletes the given relation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFactSheetRelationTest() throws ApiException {
        UUID id = null;
        UUID relationId = null;
        api.deleteFactSheetRelation(id, relationId);

        // TODO: test validations
    }
    
    /**
     * getFactSheet
     *
     * Retrieves a Fact Sheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFactSheetTest() throws ApiException {
        String id = null;
        String relationTypes = null;
        Boolean permissions = null;
        FactSheetResponse response = api.getFactSheet(id, relationTypes, permissions);

        // TODO: test validations
    }
    
    /**
     * getFactSheetRelations
     *
     * Retrieves all relations of a Fact Sheet, with the given type
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFactSheetRelationsTest() throws ApiException {
        String id = null;
        String type = null;
        Boolean withFactSheets = null;
        RelationListResponse response = api.getFactSheetRelations(id, type, withFactSheets);

        // TODO: test validations
    }
    
    /**
     * getFactSheets
     *
     * Retrieves all Fact Sheets
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFactSheetsTest() throws ApiException {
        String type = null;
        String relationTypes = null;
        Integer pageSize = null;
        String cursor = null;
        Boolean permissions = null;
        FactSheetListResponse response = api.getFactSheets(type, relationTypes, pageSize, cursor, permissions);

        // TODO: test validations
    }
    
    /**
     * updateFactSheet
     *
     * Updates a Fact Sheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFactSheetTest() throws ApiException {
        UUID id = null;
        FactSheet body = null;
        String relationTypes = null;
        FactSheetResponse response = api.updateFactSheet(id, body, relationTypes);

        // TODO: test validations
    }
    
    /**
     * updateFactSheetRelation
     *
     * Updates the given relation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFactSheetRelationTest() throws ApiException {
        UUID id = null;
        UUID relationId = null;
        FactSheetRelation relation = null;
        RelationResponse response = api.updateFactSheetRelation(id, relationId, relation);

        // TODO: test validations
    }
    
}
