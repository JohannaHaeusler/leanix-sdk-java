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
import net.leanix.api.models.IntercomSettings;
import net.leanix.api.models.SignavioSettings;
import net.leanix.api.models.UserNameAndPasswordIntegrationSettings;

/**
 * IntegrationsSettings
 */

public class IntegrationsSettings {
  @JsonProperty("technopedia")
  private UserNameAndPasswordIntegrationSettings technopedia = null;

  @JsonProperty("signavio")
  private SignavioSettings signavio = null;

  @JsonProperty("intercom")
  private IntercomSettings intercom = null;

  public IntegrationsSettings technopedia(UserNameAndPasswordIntegrationSettings technopedia) {
    this.technopedia = technopedia;
    return this;
  }

   /**
   * Get technopedia
   * @return technopedia
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserNameAndPasswordIntegrationSettings getTechnopedia() {
    return technopedia;
  }

  public void setTechnopedia(UserNameAndPasswordIntegrationSettings technopedia) {
    this.technopedia = technopedia;
  }

  public IntegrationsSettings signavio(SignavioSettings signavio) {
    this.signavio = signavio;
    return this;
  }

   /**
   * Get signavio
   * @return signavio
  **/
  @ApiModelProperty(example = "null", value = "")
  public SignavioSettings getSignavio() {
    return signavio;
  }

  public void setSignavio(SignavioSettings signavio) {
    this.signavio = signavio;
  }

  public IntegrationsSettings intercom(IntercomSettings intercom) {
    this.intercom = intercom;
    return this;
  }

   /**
   * Get intercom
   * @return intercom
  **/
  @ApiModelProperty(example = "null", value = "")
  public IntercomSettings getIntercom() {
    return intercom;
  }

  public void setIntercom(IntercomSettings intercom) {
    this.intercom = intercom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationsSettings integrationsSettings = (IntegrationsSettings) o;
    return Objects.equals(this.technopedia, integrationsSettings.technopedia) &&
        Objects.equals(this.signavio, integrationsSettings.signavio) &&
        Objects.equals(this.intercom, integrationsSettings.intercom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(technopedia, signavio, intercom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationsSettings {\n");
    
    sb.append("    technopedia: ").append(toIndentedString(technopedia)).append("\n");
    sb.append("    signavio: ").append(toIndentedString(signavio)).append("\n");
    sb.append("    intercom: ").append(toIndentedString(intercom)).append("\n");
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

