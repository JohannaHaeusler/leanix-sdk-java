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

/**
 * CustomTranslation
 */

public class CustomTranslation {
  @JsonProperty("welcomeMessage")
  private String welcomeMessage = null;

  @JsonProperty("help")
  private Map<String, Object> help = new HashMap<String, Object>();

  public CustomTranslation welcomeMessage(String welcomeMessage) {
    this.welcomeMessage = welcomeMessage;
    return this;
  }

   /**
   * Get welcomeMessage
   * @return welcomeMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWelcomeMessage() {
    return welcomeMessage;
  }

  public void setWelcomeMessage(String welcomeMessage) {
    this.welcomeMessage = welcomeMessage;
  }

  public CustomTranslation help(Map<String, Object> help) {
    this.help = help;
    return this;
  }

  public CustomTranslation putHelpItem(String key, Object helpItem) {
    this.help.put(key, helpItem);
    return this;
  }

   /**
   * Get help
   * @return help
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getHelp() {
    return help;
  }

  public void setHelp(Map<String, Object> help) {
    this.help = help;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTranslation customTranslation = (CustomTranslation) o;
    return Objects.equals(this.welcomeMessage, customTranslation.welcomeMessage) &&
        Objects.equals(this.help, customTranslation.help);
  }

  @Override
  public int hashCode() {
    return Objects.hash(welcomeMessage, help);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomTranslation {\n");
    
    sb.append("    welcomeMessage: ").append(toIndentedString(welcomeMessage)).append("\n");
    sb.append("    help: ").append(toIndentedString(help)).append("\n");
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

