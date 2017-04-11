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
import net.leanix.api.models.ModelConfiguration;

/**
 * RulesDefinition
 */

public class RulesDefinition {
  @JsonProperty("displayNameRule")
  private ModelConfiguration displayNameRule = null;

  public RulesDefinition displayNameRule(ModelConfiguration displayNameRule) {
    this.displayNameRule = displayNameRule;
    return this;
  }

   /**
   * Get displayNameRule
   * @return displayNameRule
  **/
  @ApiModelProperty(example = "null", value = "")
  public ModelConfiguration getDisplayNameRule() {
    return displayNameRule;
  }

  public void setDisplayNameRule(ModelConfiguration displayNameRule) {
    this.displayNameRule = displayNameRule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RulesDefinition rulesDefinition = (RulesDefinition) o;
    return Objects.equals(this.displayNameRule, rulesDefinition.displayNameRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayNameRule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RulesDefinition {\n");
    
    sb.append("    displayNameRule: ").append(toIndentedString(displayNameRule)).append("\n");
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
