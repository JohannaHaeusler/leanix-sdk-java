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


package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.leanix.api.models.CustomizationSubsection;

/**
 * CustomizationSection
 */

public class CustomizationSection {
  @JsonProperty("subsections")
  private Map<String, CustomizationSubsection> subsections = new HashMap<String, CustomizationSubsection>();

  public CustomizationSection subsections(Map<String, CustomizationSubsection> subsections) {
    this.subsections = subsections;
    return this;
  }

  public CustomizationSection putSubsectionsItem(String key, CustomizationSubsection subsectionsItem) {
    this.subsections.put(key, subsectionsItem);
    return this;
  }

   /**
   * Get subsections
   * @return subsections
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, CustomizationSubsection> getSubsections() {
    return subsections;
  }

  public void setSubsections(Map<String, CustomizationSubsection> subsections) {
    this.subsections = subsections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomizationSection customizationSection = (CustomizationSection) o;
    return Objects.equals(this.subsections, customizationSection.subsections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subsections);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomizationSection {\n");
    
    sb.append("    subsections: ").append(toIndentedString(subsections)).append("\n");
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

