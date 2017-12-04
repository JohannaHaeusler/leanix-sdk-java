/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 3.9.144-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.leanix.api.models.FactSheetTranslation;
import net.leanix.api.models.RelationTranslation;

/**
 * DataModelTranslation
 */

public class DataModelTranslation {
  @JsonProperty("externalIdFields")
  private Map<String, Object> externalIdFields = new HashMap<String, Object>();

  @JsonProperty("factSheets")
  private Map<String, FactSheetTranslation> factSheets = new HashMap<String, FactSheetTranslation>();

  @JsonProperty("relations")
  private Map<String, RelationTranslation> relations = new HashMap<String, RelationTranslation>();

  public DataModelTranslation externalIdFields(Map<String, Object> externalIdFields) {
    this.externalIdFields = externalIdFields;
    return this;
  }

  public DataModelTranslation putExternalIdFieldsItem(String key, Object externalIdFieldsItem) {
    this.externalIdFields.put(key, externalIdFieldsItem);
    return this;
  }

   /**
   * Get externalIdFields
   * @return externalIdFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getExternalIdFields() {
    return externalIdFields;
  }

  public void setExternalIdFields(Map<String, Object> externalIdFields) {
    this.externalIdFields = externalIdFields;
  }

  public DataModelTranslation factSheets(Map<String, FactSheetTranslation> factSheets) {
    this.factSheets = factSheets;
    return this;
  }

  public DataModelTranslation putFactSheetsItem(String key, FactSheetTranslation factSheetsItem) {
    this.factSheets.put(key, factSheetsItem);
    return this;
  }

   /**
   * Get factSheets
   * @return factSheets
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, FactSheetTranslation> getFactSheets() {
    return factSheets;
  }

  public void setFactSheets(Map<String, FactSheetTranslation> factSheets) {
    this.factSheets = factSheets;
  }

  public DataModelTranslation relations(Map<String, RelationTranslation> relations) {
    this.relations = relations;
    return this;
  }

  public DataModelTranslation putRelationsItem(String key, RelationTranslation relationsItem) {
    this.relations.put(key, relationsItem);
    return this;
  }

   /**
   * Get relations
   * @return relations
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, RelationTranslation> getRelations() {
    return relations;
  }

  public void setRelations(Map<String, RelationTranslation> relations) {
    this.relations = relations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataModelTranslation dataModelTranslation = (DataModelTranslation) o;
    return Objects.equals(this.externalIdFields, dataModelTranslation.externalIdFields) &&
        Objects.equals(this.factSheets, dataModelTranslation.factSheets) &&
        Objects.equals(this.relations, dataModelTranslation.relations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalIdFields, factSheets, relations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataModelTranslation {\n");
    
    sb.append("    externalIdFields: ").append(toIndentedString(externalIdFields)).append("\n");
    sb.append("    factSheets: ").append(toIndentedString(factSheets)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

