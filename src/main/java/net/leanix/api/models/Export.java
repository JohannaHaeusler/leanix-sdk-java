/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 3.9.139-SNAPSHOT
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
import java.time.Instant;
import java.util.UUID;
import net.leanix.api.models.User;

/**
 * Export
 */

public class Export {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("userId")
  private UUID userId = null;

  @JsonProperty("user")
  private User user = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    AUDIT_LOG("AUDIT_LOG"),
    
    SNAPSHOT("SNAPSHOT"),
    
    INVENTORY_IMPORT("INVENTORY_IMPORT"),
    
    INVENTORY_EXPORT("INVENTORY_EXPORT"),
    
    WS_SYNC("WS_SYNC"),
    
    REPORT_SYNC("REPORT_SYNC"),
    
    AUDIT_LOG_LEGACY("AUDIT_LOG_LEGACY");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    STARTED("STARTED"),
    
    COMPLETED("COMPLETED"),
    
    DOWNLOADED("DOWNLOADED"),
    
    ERROR("ERROR"),
    
    DELETED("DELETED"),
    
    CANCELED("CANCELED");

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

  @JsonProperty("localFilename")
  private String localFilename = null;

  @JsonProperty("downloadFilename")
  private String downloadFilename = null;

  @JsonProperty("createdAt")
  private Instant createdAt = null;

  @JsonProperty("deleteAt")
  private Instant deleteAt = null;

  @JsonProperty("dryRun")
  private Boolean dryRun = false;

  @JsonProperty("downloadKey")
  private UUID downloadKey = null;

  public Export id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Export userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public Export user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Export type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Export status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Export localFilename(String localFilename) {
    this.localFilename = localFilename;
    return this;
  }

   /**
   * Get localFilename
   * @return localFilename
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getLocalFilename() {
    return localFilename;
  }

  public void setLocalFilename(String localFilename) {
    this.localFilename = localFilename;
  }

  public Export downloadFilename(String downloadFilename) {
    this.downloadFilename = downloadFilename;
    return this;
  }

   /**
   * Get downloadFilename
   * @return downloadFilename
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getDownloadFilename() {
    return downloadFilename;
  }

  public void setDownloadFilename(String downloadFilename) {
    this.downloadFilename = downloadFilename;
  }

  public Export createdAt(Instant createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Export deleteAt(Instant deleteAt) {
    this.deleteAt = deleteAt;
    return this;
  }

   /**
   * Get deleteAt
   * @return deleteAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public Instant getDeleteAt() {
    return deleteAt;
  }

  public void setDeleteAt(Instant deleteAt) {
    this.deleteAt = deleteAt;
  }

  public Export dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

   /**
   * Get dryRun
   * @return dryRun
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public Export downloadKey(UUID downloadKey) {
    this.downloadKey = downloadKey;
    return this;
  }

   /**
   * Get downloadKey
   * @return downloadKey
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getDownloadKey() {
    return downloadKey;
  }

  public void setDownloadKey(UUID downloadKey) {
    this.downloadKey = downloadKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Export export = (Export) o;
    return Objects.equals(this.id, export.id) &&
        Objects.equals(this.userId, export.userId) &&
        Objects.equals(this.user, export.user) &&
        Objects.equals(this.type, export.type) &&
        Objects.equals(this.status, export.status) &&
        Objects.equals(this.localFilename, export.localFilename) &&
        Objects.equals(this.downloadFilename, export.downloadFilename) &&
        Objects.equals(this.createdAt, export.createdAt) &&
        Objects.equals(this.deleteAt, export.deleteAt) &&
        Objects.equals(this.dryRun, export.dryRun) &&
        Objects.equals(this.downloadKey, export.downloadKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, user, type, status, localFilename, downloadFilename, createdAt, deleteAt, dryRun, downloadKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Export {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    localFilename: ").append(toIndentedString(localFilename)).append("\n");
    sb.append("    downloadFilename: ").append(toIndentedString(downloadFilename)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    downloadKey: ").append(toIndentedString(downloadKey)).append("\n");
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
