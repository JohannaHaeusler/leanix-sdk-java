/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 4.0.12-SNAPSHOT
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
import net.leanix.api.models.LxField;
import net.leanix.api.models.Phase;

/**
 * Lifecycle
 */

public class Lifecycle extends LxField {
  @JsonProperty("phases")
  private List<Phase> phases = new ArrayList<Phase>();

  public Lifecycle phases(List<Phase> phases) {
    this.phases = phases;
    return this;
  }

  public Lifecycle addPhasesItem(Phase phasesItem) {
    this.phases.add(phasesItem);
    return this;
  }

   /**
   * Get phases
   * @return phases
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Phase> getPhases() {
    return phases;
  }

  public void setPhases(List<Phase> phases) {
    this.phases = phases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lifecycle lifecycle = (Lifecycle) o;
    return Objects.equals(this.phases, lifecycle.phases) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phases, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lifecycle {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    phases: ").append(toIndentedString(phases)).append("\n");
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

