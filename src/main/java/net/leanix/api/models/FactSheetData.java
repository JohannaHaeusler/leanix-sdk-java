/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 0.1.8-SNAPSHOT
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
import java.util.UUID;
import net.leanix.api.models.Completion;
import net.leanix.api.models.FactSheetDataRelation;
import net.leanix.api.models.FieldnameAndData;
import net.leanix.api.models.GQLComment;
import net.leanix.api.models.GQLSubscription;
import net.leanix.api.models.Instant;
import net.leanix.api.models.Tag;

/**
 * FactSheetData
 */

public class FactSheetData {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("dbRevision")
  private Long dbRevision = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("tags")
  private List<Tag> tags = new ArrayList<Tag>();

  @JsonProperty("fields")
  private List<FieldnameAndData> fields = new ArrayList<FieldnameAndData>();

  @JsonProperty("relations")
  private List<FactSheetDataRelation> relations = new ArrayList<FactSheetDataRelation>();

  @JsonProperty("intentionallyNotSet")
  private List<String> intentionallyNotSet = new ArrayList<String>();

  @JsonProperty("completion")
  private Completion completion = null;

  @JsonProperty("lastChanged")
  private Instant lastChanged = null;

  @JsonProperty("comments")
  private List<GQLComment> comments = new ArrayList<GQLComment>();

  @JsonProperty("subscriptions")
  private List<GQLSubscription> subscriptions = new ArrayList<GQLSubscription>();

  @JsonProperty("approvedDate")
  private Instant approvedDate = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    ARCHIVED("ARCHIVED");

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

  public FactSheetData id(UUID id) {
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

  public FactSheetData dbRevision(Long dbRevision) {
    this.dbRevision = dbRevision;
    return this;
  }

   /**
   * Get dbRevision
   * @return dbRevision
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getDbRevision() {
    return dbRevision;
  }

  public void setDbRevision(Long dbRevision) {
    this.dbRevision = dbRevision;
  }

  public FactSheetData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FactSheetData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FactSheetData displayName(String displayName) {
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

  public FactSheetData type(String type) {
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

  public FactSheetData tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public FactSheetData addTagsItem(Tag tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public FactSheetData fields(List<FieldnameAndData> fields) {
    this.fields = fields;
    return this;
  }

  public FactSheetData addFieldsItem(FieldnameAndData fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FieldnameAndData> getFields() {
    return fields;
  }

  public void setFields(List<FieldnameAndData> fields) {
    this.fields = fields;
  }

  public FactSheetData relations(List<FactSheetDataRelation> relations) {
    this.relations = relations;
    return this;
  }

  public FactSheetData addRelationsItem(FactSheetDataRelation relationsItem) {
    this.relations.add(relationsItem);
    return this;
  }

   /**
   * Get relations
   * @return relations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FactSheetDataRelation> getRelations() {
    return relations;
  }

  public void setRelations(List<FactSheetDataRelation> relations) {
    this.relations = relations;
  }

  public FactSheetData intentionallyNotSet(List<String> intentionallyNotSet) {
    this.intentionallyNotSet = intentionallyNotSet;
    return this;
  }

  public FactSheetData addIntentionallyNotSetItem(String intentionallyNotSetItem) {
    this.intentionallyNotSet.add(intentionallyNotSetItem);
    return this;
  }

   /**
   * Get intentionallyNotSet
   * @return intentionallyNotSet
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getIntentionallyNotSet() {
    return intentionallyNotSet;
  }

  public void setIntentionallyNotSet(List<String> intentionallyNotSet) {
    this.intentionallyNotSet = intentionallyNotSet;
  }

  public FactSheetData completion(Completion completion) {
    this.completion = completion;
    return this;
  }

   /**
   * Get completion
   * @return completion
  **/
  @ApiModelProperty(example = "null", value = "")
  public Completion getCompletion() {
    return completion;
  }

  public void setCompletion(Completion completion) {
    this.completion = completion;
  }

  public FactSheetData lastChanged(Instant lastChanged) {
    this.lastChanged = lastChanged;
    return this;
  }

   /**
   * Get lastChanged
   * @return lastChanged
  **/
  @ApiModelProperty(example = "null", value = "")
  public Instant getLastChanged() {
    return lastChanged;
  }

  public void setLastChanged(Instant lastChanged) {
    this.lastChanged = lastChanged;
  }

  public FactSheetData comments(List<GQLComment> comments) {
    this.comments = comments;
    return this;
  }

  public FactSheetData addCommentsItem(GQLComment commentsItem) {
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<GQLComment> getComments() {
    return comments;
  }

  public void setComments(List<GQLComment> comments) {
    this.comments = comments;
  }

  public FactSheetData subscriptions(List<GQLSubscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public FactSheetData addSubscriptionsItem(GQLSubscription subscriptionsItem) {
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<GQLSubscription> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<GQLSubscription> subscriptions) {
    this.subscriptions = subscriptions;
  }

  public FactSheetData approvedDate(Instant approvedDate) {
    this.approvedDate = approvedDate;
    return this;
  }

   /**
   * Get approvedDate
   * @return approvedDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Instant getApprovedDate() {
    return approvedDate;
  }

  public void setApprovedDate(Instant approvedDate) {
    this.approvedDate = approvedDate;
  }

  public FactSheetData status(StatusEnum status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSheetData factSheetData = (FactSheetData) o;
    return Objects.equals(this.id, factSheetData.id) &&
        Objects.equals(this.dbRevision, factSheetData.dbRevision) &&
        Objects.equals(this.name, factSheetData.name) &&
        Objects.equals(this.description, factSheetData.description) &&
        Objects.equals(this.displayName, factSheetData.displayName) &&
        Objects.equals(this.type, factSheetData.type) &&
        Objects.equals(this.tags, factSheetData.tags) &&
        Objects.equals(this.fields, factSheetData.fields) &&
        Objects.equals(this.relations, factSheetData.relations) &&
        Objects.equals(this.intentionallyNotSet, factSheetData.intentionallyNotSet) &&
        Objects.equals(this.completion, factSheetData.completion) &&
        Objects.equals(this.lastChanged, factSheetData.lastChanged) &&
        Objects.equals(this.comments, factSheetData.comments) &&
        Objects.equals(this.subscriptions, factSheetData.subscriptions) &&
        Objects.equals(this.approvedDate, factSheetData.approvedDate) &&
        Objects.equals(this.status, factSheetData.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dbRevision, name, description, displayName, type, tags, fields, relations, intentionallyNotSet, completion, lastChanged, comments, subscriptions, approvedDate, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dbRevision: ").append(toIndentedString(dbRevision)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    intentionallyNotSet: ").append(toIndentedString(intentionallyNotSet)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    lastChanged: ").append(toIndentedString(lastChanged)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    approvedDate: ").append(toIndentedString(approvedDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

