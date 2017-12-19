/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 4.0.3-SNAPSHOT
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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.leanix.api.models.FactSheet;
import net.leanix.api.models.FactSheetRelation;
import net.leanix.api.models.FieldnameAndData;

/**
 * FactSheetRelation
 */

public class FactSheetRelation {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("displayNameToFS")
  private String displayNameToFS = null;

  @JsonProperty("typeFromFS")
  private String typeFromFS = null;

  @JsonProperty("typeToFS")
  private String typeToFS = null;

  @JsonProperty("activeFrom")
  private LocalDate activeFrom = null;

  @JsonProperty("activeUntil")
  private LocalDate activeUntil = null;

  @JsonProperty("constrainingRelations")
  private List<FactSheetRelation> constrainingRelations = new ArrayList<FactSheetRelation>();

  @JsonProperty("fields")
  private List<FieldnameAndData> fields = new ArrayList<FieldnameAndData>();

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

  @JsonProperty("fromId")
  private UUID fromId = null;

  @JsonProperty("toId")
  private UUID toId = null;

  @JsonProperty("factSheet")
  private FactSheet factSheet = null;

  @JsonProperty("naFields")
  private List<String> naFields = new ArrayList<String>();

  @JsonProperty("type")
  private String type = null;

  public FactSheetRelation id(UUID id) {
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

  public FactSheetRelation displayNameToFS(String displayNameToFS) {
    this.displayNameToFS = displayNameToFS;
    return this;
  }

   /**
   * Get displayNameToFS
   * @return displayNameToFS
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplayNameToFS() {
    return displayNameToFS;
  }

  public void setDisplayNameToFS(String displayNameToFS) {
    this.displayNameToFS = displayNameToFS;
  }

  public FactSheetRelation typeFromFS(String typeFromFS) {
    this.typeFromFS = typeFromFS;
    return this;
  }

   /**
   * Get typeFromFS
   * @return typeFromFS
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTypeFromFS() {
    return typeFromFS;
  }

  public void setTypeFromFS(String typeFromFS) {
    this.typeFromFS = typeFromFS;
  }

  public FactSheetRelation typeToFS(String typeToFS) {
    this.typeToFS = typeToFS;
    return this;
  }

   /**
   * Get typeToFS
   * @return typeToFS
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTypeToFS() {
    return typeToFS;
  }

  public void setTypeToFS(String typeToFS) {
    this.typeToFS = typeToFS;
  }

  public FactSheetRelation activeFrom(LocalDate activeFrom) {
    this.activeFrom = activeFrom;
    return this;
  }

   /**
   * Get activeFrom
   * @return activeFrom
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getActiveFrom() {
    return activeFrom;
  }

  public void setActiveFrom(LocalDate activeFrom) {
    this.activeFrom = activeFrom;
  }

  public FactSheetRelation activeUntil(LocalDate activeUntil) {
    this.activeUntil = activeUntil;
    return this;
  }

   /**
   * Get activeUntil
   * @return activeUntil
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getActiveUntil() {
    return activeUntil;
  }

  public void setActiveUntil(LocalDate activeUntil) {
    this.activeUntil = activeUntil;
  }

  public FactSheetRelation constrainingRelations(List<FactSheetRelation> constrainingRelations) {
    this.constrainingRelations = constrainingRelations;
    return this;
  }

  public FactSheetRelation addConstrainingRelationsItem(FactSheetRelation constrainingRelationsItem) {
    this.constrainingRelations.add(constrainingRelationsItem);
    return this;
  }

   /**
   * Get constrainingRelations
   * @return constrainingRelations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FactSheetRelation> getConstrainingRelations() {
    return constrainingRelations;
  }

  public void setConstrainingRelations(List<FactSheetRelation> constrainingRelations) {
    this.constrainingRelations = constrainingRelations;
  }

  public FactSheetRelation fields(List<FieldnameAndData> fields) {
    this.fields = fields;
    return this;
  }

  public FactSheetRelation addFieldsItem(FieldnameAndData fieldsItem) {
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

  public FactSheetRelation status(StatusEnum status) {
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

  public FactSheetRelation fromId(UUID fromId) {
    this.fromId = fromId;
    return this;
  }

   /**
   * Get fromId
   * @return fromId
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getFromId() {
    return fromId;
  }

  public void setFromId(UUID fromId) {
    this.fromId = fromId;
  }

  public FactSheetRelation toId(UUID toId) {
    this.toId = toId;
    return this;
  }

   /**
   * Get toId
   * @return toId
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getToId() {
    return toId;
  }

  public void setToId(UUID toId) {
    this.toId = toId;
  }

  public FactSheetRelation factSheet(FactSheet factSheet) {
    this.factSheet = factSheet;
    return this;
  }

   /**
   * Get factSheet
   * @return factSheet
  **/
  @ApiModelProperty(example = "null", value = "")
  public FactSheet getFactSheet() {
    return factSheet;
  }

  public void setFactSheet(FactSheet factSheet) {
    this.factSheet = factSheet;
  }

  public FactSheetRelation naFields(List<String> naFields) {
    this.naFields = naFields;
    return this;
  }

  public FactSheetRelation addNaFieldsItem(String naFieldsItem) {
    this.naFields.add(naFieldsItem);
    return this;
  }

   /**
   * Get naFields
   * @return naFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getNaFields() {
    return naFields;
  }

  public void setNaFields(List<String> naFields) {
    this.naFields = naFields;
  }

  public FactSheetRelation type(String type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSheetRelation factSheetRelation = (FactSheetRelation) o;
    return Objects.equals(this.id, factSheetRelation.id) &&
        Objects.equals(this.displayNameToFS, factSheetRelation.displayNameToFS) &&
        Objects.equals(this.typeFromFS, factSheetRelation.typeFromFS) &&
        Objects.equals(this.typeToFS, factSheetRelation.typeToFS) &&
        Objects.equals(this.activeFrom, factSheetRelation.activeFrom) &&
        Objects.equals(this.activeUntil, factSheetRelation.activeUntil) &&
        Objects.equals(this.constrainingRelations, factSheetRelation.constrainingRelations) &&
        Objects.equals(this.fields, factSheetRelation.fields) &&
        Objects.equals(this.status, factSheetRelation.status) &&
        Objects.equals(this.fromId, factSheetRelation.fromId) &&
        Objects.equals(this.toId, factSheetRelation.toId) &&
        Objects.equals(this.factSheet, factSheetRelation.factSheet) &&
        Objects.equals(this.naFields, factSheetRelation.naFields) &&
        Objects.equals(this.type, factSheetRelation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayNameToFS, typeFromFS, typeToFS, activeFrom, activeUntil, constrainingRelations, fields, status, fromId, toId, factSheet, naFields, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetRelation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayNameToFS: ").append(toIndentedString(displayNameToFS)).append("\n");
    sb.append("    typeFromFS: ").append(toIndentedString(typeFromFS)).append("\n");
    sb.append("    typeToFS: ").append(toIndentedString(typeToFS)).append("\n");
    sb.append("    activeFrom: ").append(toIndentedString(activeFrom)).append("\n");
    sb.append("    activeUntil: ").append(toIndentedString(activeUntil)).append("\n");
    sb.append("    constrainingRelations: ").append(toIndentedString(constrainingRelations)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fromId: ").append(toIndentedString(fromId)).append("\n");
    sb.append("    toId: ").append(toIndentedString(toId)).append("\n");
    sb.append("    factSheet: ").append(toIndentedString(factSheet)).append("\n");
    sb.append("    naFields: ").append(toIndentedString(naFields)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

