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

/**
 * FactSheetArchiveParameter
 */

public class FactSheetArchiveParameter {
  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("rev")
  private Long rev = null;

  public FactSheetArchiveParameter comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public FactSheetArchiveParameter rev(Long rev) {
    this.rev = rev;
    return this;
  }

   /**
   * Get rev
   * @return rev
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getRev() {
    return rev;
  }

  public void setRev(Long rev) {
    this.rev = rev;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSheetArchiveParameter factSheetArchiveParameter = (FactSheetArchiveParameter) o;
    return Objects.equals(this.comment, factSheetArchiveParameter.comment) &&
        Objects.equals(this.rev, factSheetArchiveParameter.rev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, rev);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetArchiveParameter {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
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

