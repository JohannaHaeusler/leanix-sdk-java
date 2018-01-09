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
import net.leanix.api.models.TemplateOptions;

/**
 * Subsection
 */

public class Subsection {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("helpText")
  private String helpText = null;

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("templateOptions")
  private TemplateOptions templateOptions = null;

  @JsonProperty("weight")
  private Double weight = null;

  @JsonProperty("disabled")
  private Boolean disabled = false;

  public Subsection label(String label) {
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

  public Subsection helpText(String helpText) {
    this.helpText = helpText;
    return this;
  }

   /**
   * Get helpText
   * @return helpText
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHelpText() {
    return helpText;
  }

  public void setHelpText(String helpText) {
    this.helpText = helpText;
  }

  public Subsection template(String template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public Subsection templateOptions(TemplateOptions templateOptions) {
    this.templateOptions = templateOptions;
    return this;
  }

   /**
   * Get templateOptions
   * @return templateOptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public TemplateOptions getTemplateOptions() {
    return templateOptions;
  }

  public void setTemplateOptions(TemplateOptions templateOptions) {
    this.templateOptions = templateOptions;
  }

  public Subsection weight(Double weight) {
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

  public Subsection disabled(Boolean disabled) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subsection subsection = (Subsection) o;
    return Objects.equals(this.label, subsection.label) &&
        Objects.equals(this.helpText, subsection.helpText) &&
        Objects.equals(this.template, subsection.template) &&
        Objects.equals(this.templateOptions, subsection.templateOptions) &&
        Objects.equals(this.weight, subsection.weight) &&
        Objects.equals(this.disabled, subsection.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, helpText, template, templateOptions, weight, disabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subsection {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    helpText: ").append(toIndentedString(helpText)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateOptions: ").append(toIndentedString(templateOptions)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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

