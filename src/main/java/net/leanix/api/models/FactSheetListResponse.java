/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 3.9.72-SNAPSHOT
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
import net.leanix.api.models.ApiError;
import net.leanix.api.models.FactSheet;

/**
 * FactSheetListResponse
 */

public class FactSheetListResponse {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("errors")
  private List<ApiError> errors = new ArrayList<ApiError>();

  @JsonProperty("total")
  private Long total = null;

  @JsonProperty("data")
  private List<FactSheet> data = new ArrayList<FactSheet>();

  @JsonProperty("cursor")
  private String cursor = null;

  public FactSheetListResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public FactSheetListResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FactSheetListResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public FactSheetListResponse errors(List<ApiError> errors) {
    this.errors = errors;
    return this;
  }

  public FactSheetListResponse addErrorsItem(ApiError errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ApiError> getErrors() {
    return errors;
  }

  public void setErrors(List<ApiError> errors) {
    this.errors = errors;
  }

  public FactSheetListResponse total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public FactSheetListResponse data(List<FactSheet> data) {
    this.data = data;
    return this;
  }

  public FactSheetListResponse addDataItem(FactSheet dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FactSheet> getData() {
    return data;
  }

  public void setData(List<FactSheet> data) {
    this.data = data;
  }

  public FactSheetListResponse cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSheetListResponse factSheetListResponse = (FactSheetListResponse) o;
    return Objects.equals(this.status, factSheetListResponse.status) &&
        Objects.equals(this.type, factSheetListResponse.type) &&
        Objects.equals(this.message, factSheetListResponse.message) &&
        Objects.equals(this.errors, factSheetListResponse.errors) &&
        Objects.equals(this.total, factSheetListResponse.total) &&
        Objects.equals(this.data, factSheetListResponse.data) &&
        Objects.equals(this.cursor, factSheetListResponse.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, type, message, errors, total, data, cursor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetListResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

