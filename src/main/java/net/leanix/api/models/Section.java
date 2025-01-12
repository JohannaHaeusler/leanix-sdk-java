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
import java.util.ArrayList;
import java.util.List;
import net.leanix.api.models.Subsection;

/**
 * Section
 */

public class Section {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("disabled")
  private Boolean disabled = false;

  @JsonProperty("subsections")
  private List<Subsection> subsections = new ArrayList<Subsection>();

  @JsonProperty("tabs")
  private List<String> tabs = new ArrayList<String>();

  @JsonProperty("weight")
  private Double weight = null;

  public Section label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Section disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public Section subsections(List<Subsection> subsections) {
    this.subsections = subsections;
    return this;
  }

  public Section addSubsectionsItem(Subsection subsectionsItem) {
    this.subsections.add(subsectionsItem);
    return this;
  }

   /**
   * Get subsections
   * @return subsections
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Subsection> getSubsections() {
    return subsections;
  }

  public void setSubsections(List<Subsection> subsections) {
    this.subsections = subsections;
  }

  public Section tabs(List<String> tabs) {
    this.tabs = tabs;
    return this;
  }

  public Section addTabsItem(String tabsItem) {
    this.tabs.add(tabsItem);
    return this;
  }

   /**
   * Get tabs
   * @return tabs
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getTabs() {
    return tabs;
  }

  public void setTabs(List<String> tabs) {
    this.tabs = tabs;
  }

  public Section weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Section section = (Section) o;
    return Objects.equals(this.label, section.label) &&
        Objects.equals(this.disabled, section.disabled) &&
        Objects.equals(this.subsections, section.subsections) &&
        Objects.equals(this.tabs, section.tabs) &&
        Objects.equals(this.weight, section.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, disabled, subsections, tabs, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Section {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    subsections: ").append(toIndentedString(subsections)).append("\n");
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

