/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 3.9.5-SNAPSHOT
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
import net.leanix.api.models.LxField;

/**
 * FieldnameAndData
 */

public class FieldnameAndData {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("data")
  private LxField data = null;

  public FieldnameAndData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FieldnameAndData data(LxField data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public LxField getData() {
    return data;
  }

  public void setData(LxField data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldnameAndData fieldnameAndData = (FieldnameAndData) o;
    return Objects.equals(this.name, fieldnameAndData.name) &&
        Objects.equals(this.data, fieldnameAndData.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldnameAndData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

