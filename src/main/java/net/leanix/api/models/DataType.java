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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DataType
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = IntNumberDataType.class, name = "IntNumberDataType"),
  @JsonSubTypes.Type(value = SingleSelectType.class, name = "SingleSelectType"),
  @JsonSubTypes.Type(value = LifecycleType.class, name = "LifecycleType"),
  @JsonSubTypes.Type(value = ExternalIdType.class, name = "ExternalIdType"),
  @JsonSubTypes.Type(value = ProjectStatusType.class, name = "ProjectStatusType"),
  @JsonSubTypes.Type(value = StringDataType.class, name = "StringDataType"),
  @JsonSubTypes.Type(value = MultipleSelectType.class, name = "MultipleSelectType"),
  @JsonSubTypes.Type(value = AggregatedDataType.class, name = "AggregatedDataType"),
  @JsonSubTypes.Type(value = LocationType.class, name = "LocationType"),
  @JsonSubTypes.Type(value = DoubleNumberDataType.class, name = "DoubleNumberDataType"),
})

public class DataType {
  @JsonProperty("mandatory")
  private Boolean mandatory = false;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("inFacet")
  private Boolean inFacet = false;

  @JsonProperty("inView")
  private Boolean inView = false;

  @JsonProperty("quickSearch")
  private Boolean quickSearch = false;

  @JsonProperty("fullTextSearch")
  private Boolean fullTextSearch = false;

  public DataType mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

   /**
   * Get mandatory
   * @return mandatory
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

   /**
   * Get inFacet
   * @return inFacet
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getInFacet() {
    return inFacet;
  }

   /**
   * Get inView
   * @return inView
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getInView() {
    return inView;
  }

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataType dataType = (DataType) o;
    return Objects.equals(this.mandatory, dataType.mandatory) &&
        Objects.equals(this.type, dataType.type) &&
        Objects.equals(this.inFacet, dataType.inFacet) &&
        Objects.equals(this.inView, dataType.inView) &&
        Objects.equals(this.quickSearch, dataType.quickSearch) &&
        Objects.equals(this.fullTextSearch, dataType.fullTextSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandatory, type, inFacet, inView, quickSearch, fullTextSearch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataType {\n");
    
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inFacet: ").append(toIndentedString(inFacet)).append("\n");
    sb.append("    inView: ").append(toIndentedString(inView)).append("\n");
    sb.append("    quickSearch: ").append(toIndentedString(quickSearch)).append("\n");
    sb.append("    fullTextSearch: ").append(toIndentedString(fullTextSearch)).append("\n");
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

