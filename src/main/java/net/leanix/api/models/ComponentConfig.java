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
 * ComponentConfig
 */

public class ComponentConfig {
  @JsonProperty("relation")
  private String relation = null;

  @JsonProperty("field")
  private String field = null;

  @JsonProperty("fixed")
  private String fixed = null;

  @JsonProperty("separator")
  private String separator = null;

  @JsonProperty("prefix")
  private String prefix = null;

  @JsonProperty("postfix")
  private String postfix = null;

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    APPEND("APPEND"),
    
    PREPEND("PREPEND");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("operation")
  private OperationEnum operation = null;

  public ComponentConfig relation(String relation) {
    this.relation = relation;
    return this;
  }

   /**
   * Get relation
   * @return relation
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRelation() {
    return relation;
  }

  public void setRelation(String relation) {
    this.relation = relation;
  }

  public ComponentConfig field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ComponentConfig fixed(String fixed) {
    this.fixed = fixed;
    return this;
  }

   /**
   * Get fixed
   * @return fixed
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFixed() {
    return fixed;
  }

  public void setFixed(String fixed) {
    this.fixed = fixed;
  }

  public ComponentConfig separator(String separator) {
    this.separator = separator;
    return this;
  }

   /**
   * Get separator
   * @return separator
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSeparator() {
    return separator;
  }

  public void setSeparator(String separator) {
    this.separator = separator;
  }

  public ComponentConfig prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public ComponentConfig postfix(String postfix) {
    this.postfix = postfix;
    return this;
  }

   /**
   * Get postfix
   * @return postfix
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPostfix() {
    return postfix;
  }

  public void setPostfix(String postfix) {
    this.postfix = postfix;
  }

  public ComponentConfig operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(example = "null", value = "")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentConfig componentConfig = (ComponentConfig) o;
    return Objects.equals(this.relation, componentConfig.relation) &&
        Objects.equals(this.field, componentConfig.field) &&
        Objects.equals(this.fixed, componentConfig.fixed) &&
        Objects.equals(this.separator, componentConfig.separator) &&
        Objects.equals(this.prefix, componentConfig.prefix) &&
        Objects.equals(this.postfix, componentConfig.postfix) &&
        Objects.equals(this.operation, componentConfig.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relation, field, fixed, separator, prefix, postfix, operation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentConfig {\n");
    
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    fixed: ").append(toIndentedString(fixed)).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    postfix: ").append(toIndentedString(postfix)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

