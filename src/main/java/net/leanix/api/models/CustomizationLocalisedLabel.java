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

/**
 * CustomizationLocalisedLabel
 */

public class CustomizationLocalisedLabel {
  @JsonProperty("singular")
  private String singular = null;

  @JsonProperty("plural")
  private String plural = null;

  public CustomizationLocalisedLabel singular(String singular) {
    this.singular = singular;
    return this;
  }

   /**
   * Get singular
   * @return singular
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSingular() {
    return singular;
  }

  public void setSingular(String singular) {
    this.singular = singular;
  }

  public CustomizationLocalisedLabel plural(String plural) {
    this.plural = plural;
    return this;
  }

   /**
   * Get plural
   * @return plural
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPlural() {
    return plural;
  }

  public void setPlural(String plural) {
    this.plural = plural;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomizationLocalisedLabel customizationLocalisedLabel = (CustomizationLocalisedLabel) o;
    return Objects.equals(this.singular, customizationLocalisedLabel.singular) &&
        Objects.equals(this.plural, customizationLocalisedLabel.plural);
  }

  @Override
  public int hashCode() {
    return Objects.hash(singular, plural);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomizationLocalisedLabel {\n");
    
    sb.append("    singular: ").append(toIndentedString(singular)).append("\n");
    sb.append("    plural: ").append(toIndentedString(plural)).append("\n");
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

