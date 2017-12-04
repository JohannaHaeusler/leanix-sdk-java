/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 3.9.144-SNAPSHOT
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
 * UserTodoData
 */

public class UserTodoData {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("permissionId")
  private UUID permissionId = null;

  public UserTodoData id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UserTodoData email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserTodoData displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserTodoData permissionId(UUID permissionId) {
    this.permissionId = permissionId;
    return this;
  }

   /**
   * Get permissionId
   * @return permissionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getPermissionId() {
    return permissionId;
  }

  public void setPermissionId(UUID permissionId) {
    this.permissionId = permissionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTodoData userTodoData = (UserTodoData) o;
    return Objects.equals(this.id, userTodoData.id) &&
        Objects.equals(this.email, userTodoData.email) &&
        Objects.equals(this.displayName, userTodoData.displayName) &&
        Objects.equals(this.permissionId, userTodoData.permissionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, displayName, permissionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTodoData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    permissionId: ").append(toIndentedString(permissionId)).append("\n");
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
