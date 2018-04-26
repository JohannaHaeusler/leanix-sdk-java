/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 4.0.48-SNAPSHOT
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
import java.util.ArrayList;
import java.util.List;

/**
 * ExternalIdFieldDefinition
 */

public class ExternalIdFieldDefinition {
  @JsonProperty("quickSearch")
  private Boolean quickSearch = false;

  @JsonProperty("fullTextSearch")
  private Boolean fullTextSearch = false;

  @JsonProperty("urlTemplate")
  private String urlTemplate = null;

  @JsonProperty("uniqueFactSheet")
  private Boolean uniqueFactSheet = false;

  @JsonProperty("autoIncrement")
  private Boolean autoIncrement = false;

  @JsonProperty("readOnly")
  private Boolean readOnly = false;

  @JsonProperty("forFactSheets")
  private List<String> forFactSheets = new ArrayList<String>();

  @JsonProperty("validators")
  private List<String> validators = new ArrayList<String>();

   /**
   * Get quickSearch
   * @return quickSearch
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getQuickSearch() {
    return quickSearch;
  }

   /**
   * Get fullTextSearch
   * @return fullTextSearch
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getFullTextSearch() {
    return fullTextSearch;
  }

   /**
   * Get urlTemplate
   * @return urlTemplate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUrlTemplate() {
    return urlTemplate;
  }

   /**
   * Get uniqueFactSheet
   * @return uniqueFactSheet
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getUniqueFactSheet() {
    return uniqueFactSheet;
  }

   /**
   * Get autoIncrement
   * @return autoIncrement
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAutoIncrement() {
    return autoIncrement;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public ExternalIdFieldDefinition forFactSheets(List<String> forFactSheets) {
    this.forFactSheets = forFactSheets;
    return this;
  }

  public ExternalIdFieldDefinition addForFactSheetsItem(String forFactSheetsItem) {
    this.forFactSheets.add(forFactSheetsItem);
    return this;
  }

   /**
   * Get forFactSheets
   * @return forFactSheets
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getForFactSheets() {
    return forFactSheets;
  }

  public void setForFactSheets(List<String> forFactSheets) {
    this.forFactSheets = forFactSheets;
  }

  public ExternalIdFieldDefinition validators(List<String> validators) {
    this.validators = validators;
    return this;
  }

  public ExternalIdFieldDefinition addValidatorsItem(String validatorsItem) {
    this.validators.add(validatorsItem);
    return this;
  }

   /**
   * Get validators
   * @return validators
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getValidators() {
    return validators;
  }

  public void setValidators(List<String> validators) {
    this.validators = validators;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalIdFieldDefinition externalIdFieldDefinition = (ExternalIdFieldDefinition) o;
    return Objects.equals(this.quickSearch, externalIdFieldDefinition.quickSearch) &&
        Objects.equals(this.fullTextSearch, externalIdFieldDefinition.fullTextSearch) &&
        Objects.equals(this.urlTemplate, externalIdFieldDefinition.urlTemplate) &&
        Objects.equals(this.uniqueFactSheet, externalIdFieldDefinition.uniqueFactSheet) &&
        Objects.equals(this.autoIncrement, externalIdFieldDefinition.autoIncrement) &&
        Objects.equals(this.readOnly, externalIdFieldDefinition.readOnly) &&
        Objects.equals(this.forFactSheets, externalIdFieldDefinition.forFactSheets) &&
        Objects.equals(this.validators, externalIdFieldDefinition.validators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quickSearch, fullTextSearch, urlTemplate, uniqueFactSheet, autoIncrement, readOnly, forFactSheets, validators);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalIdFieldDefinition {\n");
    
    sb.append("    quickSearch: ").append(toIndentedString(quickSearch)).append("\n");
    sb.append("    fullTextSearch: ").append(toIndentedString(fullTextSearch)).append("\n");
    sb.append("    urlTemplate: ").append(toIndentedString(urlTemplate)).append("\n");
    sb.append("    uniqueFactSheet: ").append(toIndentedString(uniqueFactSheet)).append("\n");
    sb.append("    autoIncrement: ").append(toIndentedString(autoIncrement)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    forFactSheets: ").append(toIndentedString(forFactSheets)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
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

