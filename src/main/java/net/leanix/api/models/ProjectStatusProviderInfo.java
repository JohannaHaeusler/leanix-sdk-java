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
import java.util.UUID;

/**
 * ProjectStatusProviderInfo
 */

public class ProjectStatusProviderInfo {
  @JsonProperty("providerId")
  private UUID providerId = null;

  @JsonProperty("actualsOpEx")
  private Integer actualsOpEx = null;

  @JsonProperty("actualsCapEx")
  private Integer actualsCapEx = null;

  @JsonProperty("etcOpEx")
  private Integer etcOpEx = null;

  @JsonProperty("etcCapEx")
  private Integer etcCapEx = null;

  public ProjectStatusProviderInfo providerId(UUID providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * Get providerId
   * @return providerId
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getProviderId() {
    return providerId;
  }

  public void setProviderId(UUID providerId) {
    this.providerId = providerId;
  }

  public ProjectStatusProviderInfo actualsOpEx(Integer actualsOpEx) {
    this.actualsOpEx = actualsOpEx;
    return this;
  }

   /**
   * Get actualsOpEx
   * @return actualsOpEx
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getActualsOpEx() {
    return actualsOpEx;
  }

  public void setActualsOpEx(Integer actualsOpEx) {
    this.actualsOpEx = actualsOpEx;
  }

  public ProjectStatusProviderInfo actualsCapEx(Integer actualsCapEx) {
    this.actualsCapEx = actualsCapEx;
    return this;
  }

   /**
   * Get actualsCapEx
   * @return actualsCapEx
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getActualsCapEx() {
    return actualsCapEx;
  }

  public void setActualsCapEx(Integer actualsCapEx) {
    this.actualsCapEx = actualsCapEx;
  }

  public ProjectStatusProviderInfo etcOpEx(Integer etcOpEx) {
    this.etcOpEx = etcOpEx;
    return this;
  }

   /**
   * Get etcOpEx
   * @return etcOpEx
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getEtcOpEx() {
    return etcOpEx;
  }

  public void setEtcOpEx(Integer etcOpEx) {
    this.etcOpEx = etcOpEx;
  }

  public ProjectStatusProviderInfo etcCapEx(Integer etcCapEx) {
    this.etcCapEx = etcCapEx;
    return this;
  }

   /**
   * Get etcCapEx
   * @return etcCapEx
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getEtcCapEx() {
    return etcCapEx;
  }

  public void setEtcCapEx(Integer etcCapEx) {
    this.etcCapEx = etcCapEx;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectStatusProviderInfo projectStatusProviderInfo = (ProjectStatusProviderInfo) o;
    return Objects.equals(this.providerId, projectStatusProviderInfo.providerId) &&
        Objects.equals(this.actualsOpEx, projectStatusProviderInfo.actualsOpEx) &&
        Objects.equals(this.actualsCapEx, projectStatusProviderInfo.actualsCapEx) &&
        Objects.equals(this.etcOpEx, projectStatusProviderInfo.etcOpEx) &&
        Objects.equals(this.etcCapEx, projectStatusProviderInfo.etcCapEx);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerId, actualsOpEx, actualsCapEx, etcOpEx, etcCapEx);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectStatusProviderInfo {\n");
    
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    actualsOpEx: ").append(toIndentedString(actualsOpEx)).append("\n");
    sb.append("    actualsCapEx: ").append(toIndentedString(actualsCapEx)).append("\n");
    sb.append("    etcOpEx: ").append(toIndentedString(etcOpEx)).append("\n");
    sb.append("    etcCapEx: ").append(toIndentedString(etcCapEx)).append("\n");
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

