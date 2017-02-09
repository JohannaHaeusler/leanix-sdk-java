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
import net.leanix.api.models.Completion;
import net.leanix.api.models.FactSheetDataRelation;
import net.leanix.api.models.FieldnameAndData;
import net.leanix.api.models.GQLComment;
import net.leanix.api.models.GQLSubscription;
import net.leanix.api.models.Tag;
import org.joda.time.DateTime;

/**
 * FactSheetDataREST
 */

public class FactSheetDataREST {
  @JsonProperty("id")
  private String id = null;

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
  private DateTime lastChanged = null;

  @JsonProperty("comments")
  private List<GQLComment> comments = new ArrayList<GQLComment>();

  @JsonProperty("subscriptions")
  private List<GQLSubscription> subscriptions = new ArrayList<GQLSubscription>();

  @JsonProperty("approvedDate")
  private DateTime approvedDate = null;

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

  @JsonProperty("rev")
  private Long rev = null;

  public FactSheetDataREST id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FactSheetDataREST name(String name) {
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

  public FactSheetDataREST description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FactSheetDataREST displayName(String displayName) {
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

  public FactSheetDataREST type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FactSheetDataREST tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public FactSheetDataREST addTagsItem(Tag tagsItem) {
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

  public FactSheetDataREST fields(List<FieldnameAndData> fields) {
    this.fields = fields;
    return this;
  }

  public FactSheetDataREST addFieldsItem(FieldnameAndData fieldsItem) {
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

  public FactSheetDataREST relations(List<FactSheetDataRelation> relations) {
    this.relations = relations;
    return this;
  }

  public FactSheetDataREST addRelationsItem(FactSheetDataRelation relationsItem) {
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

  public FactSheetDataREST intentionallyNotSet(List<String> intentionallyNotSet) {
    this.intentionallyNotSet = intentionallyNotSet;
    return this;
  }

  public FactSheetDataREST addIntentionallyNotSetItem(String intentionallyNotSetItem) {
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

  public FactSheetDataREST completion(Completion completion) {
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

  public FactSheetDataREST lastChanged(DateTime lastChanged) {
    this.lastChanged = lastChanged;
    return this;
  }

   /**
   * when the fact sheet was last changed
   * @return lastChanged
  **/
  @ApiModelProperty(example = "null", value = "when the fact sheet was last changed")
  public DateTime getLastChanged() {
    return lastChanged;
  }

  public void setLastChanged(DateTime lastChanged) {
    this.lastChanged = lastChanged;
  }

  public FactSheetDataREST comments(List<GQLComment> comments) {
    this.comments = comments;
    return this;
  }

  public FactSheetDataREST addCommentsItem(GQLComment commentsItem) {
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

  public FactSheetDataREST subscriptions(List<GQLSubscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public FactSheetDataREST addSubscriptionsItem(GQLSubscription subscriptionsItem) {
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

  public FactSheetDataREST approvedDate(DateTime approvedDate) {
    this.approvedDate = approvedDate;
    return this;
  }

   /**
   * when the fact sheet was last approved
   * @return approvedDate
  **/
  @ApiModelProperty(example = "null", value = "when the fact sheet was last approved")
  public DateTime getApprovedDate() {
    return approvedDate;
  }

  public void setApprovedDate(DateTime approvedDate) {
    this.approvedDate = approvedDate;
  }

  public FactSheetDataREST status(StatusEnum status) {
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

  public FactSheetDataREST rev(Long rev) {
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
    FactSheetDataREST factSheetDataREST = (FactSheetDataREST) o;
    return Objects.equals(this.id, factSheetDataREST.id) &&
        Objects.equals(this.name, factSheetDataREST.name) &&
        Objects.equals(this.description, factSheetDataREST.description) &&
        Objects.equals(this.displayName, factSheetDataREST.displayName) &&
        Objects.equals(this.type, factSheetDataREST.type) &&
        Objects.equals(this.tags, factSheetDataREST.tags) &&
        Objects.equals(this.fields, factSheetDataREST.fields) &&
        Objects.equals(this.relations, factSheetDataREST.relations) &&
        Objects.equals(this.intentionallyNotSet, factSheetDataREST.intentionallyNotSet) &&
        Objects.equals(this.completion, factSheetDataREST.completion) &&
        Objects.equals(this.lastChanged, factSheetDataREST.lastChanged) &&
        Objects.equals(this.comments, factSheetDataREST.comments) &&
        Objects.equals(this.subscriptions, factSheetDataREST.subscriptions) &&
        Objects.equals(this.approvedDate, factSheetDataREST.approvedDate) &&
        Objects.equals(this.status, factSheetDataREST.status) &&
        Objects.equals(this.rev, factSheetDataREST.rev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, displayName, type, tags, fields, relations, intentionallyNotSet, completion, lastChanged, comments, subscriptions, approvedDate, status, rev);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetDataREST {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

