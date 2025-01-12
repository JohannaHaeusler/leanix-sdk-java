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
import net.leanix.api.models.CommentReference;
import net.leanix.api.models.FactSheetReference;
import net.leanix.api.models.UserReference;

/**
 * OpenCommentTodoDataData
 */

public class OpenCommentTodoDataData {
  @JsonProperty("factSheets")
  private List<FactSheetReference> factSheets = new ArrayList<FactSheetReference>();

  @JsonProperty("comments")
  private List<CommentReference> comments = new ArrayList<CommentReference>();

  @JsonProperty("user")
  private UserReference user = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    CLOSED("CLOSED"),
    
    REOPENED("REOPENED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("subscriptionType")
  private String subscriptionType = null;

  public OpenCommentTodoDataData factSheets(List<FactSheetReference> factSheets) {
    this.factSheets = factSheets;
    return this;
  }

  public OpenCommentTodoDataData addFactSheetsItem(FactSheetReference factSheetsItem) {
    this.factSheets.add(factSheetsItem);
    return this;
  }

   /**
   * Get factSheets
   * @return factSheets
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FactSheetReference> getFactSheets() {
    return factSheets;
  }

  public void setFactSheets(List<FactSheetReference> factSheets) {
    this.factSheets = factSheets;
  }

  public OpenCommentTodoDataData comments(List<CommentReference> comments) {
    this.comments = comments;
    return this;
  }

  public OpenCommentTodoDataData addCommentsItem(CommentReference commentsItem) {
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CommentReference> getComments() {
    return comments;
  }

  public void setComments(List<CommentReference> comments) {
    this.comments = comments;
  }

  public OpenCommentTodoDataData user(UserReference user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserReference getUser() {
    return user;
  }

  public void setUser(UserReference user) {
    this.user = user;
  }

  public OpenCommentTodoDataData status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OpenCommentTodoDataData subscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

   /**
   * Get subscriptionType
   * @return subscriptionType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenCommentTodoDataData openCommentTodoDataData = (OpenCommentTodoDataData) o;
    return Objects.equals(this.factSheets, openCommentTodoDataData.factSheets) &&
        Objects.equals(this.comments, openCommentTodoDataData.comments) &&
        Objects.equals(this.user, openCommentTodoDataData.user) &&
        Objects.equals(this.status, openCommentTodoDataData.status) &&
        Objects.equals(this.subscriptionType, openCommentTodoDataData.subscriptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factSheets, comments, user, status, subscriptionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenCommentTodoDataData {\n");
    
    sb.append("    factSheets: ").append(toIndentedString(factSheets)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
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

