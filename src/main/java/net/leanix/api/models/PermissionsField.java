/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 3.9.7-SNAPSHOT
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

/**
 * PermissionsField
 */

public class PermissionsField {
  /**
   * Gets or Sets self
   */
  public enum SelfEnum {
    READ("READ"),
    
    UPDATE("UPDATE"),
    
    CREATE("CREATE"),
    
    DELETE("DELETE"),
    
    ARCHIVE("ARCHIVE"),
    
    IMPORT("IMPORT"),
    
    EXPORT("EXPORT");

    private String value;

    SelfEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SelfEnum fromValue(String text) {
      for (SelfEnum b : SelfEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("self")
  private List<SelfEnum> self = new ArrayList<SelfEnum>();

  @JsonProperty("create")
  private List<String> create = new ArrayList<String>();

  @JsonProperty("read")
  private List<String> read = new ArrayList<String>();

  @JsonProperty("update")
  private List<String> update = new ArrayList<String>();

  @JsonProperty("delete")
  private List<String> delete = new ArrayList<String>();

  public PermissionsField self(List<SelfEnum> self) {
    this.self = self;
    return this;
  }

  public PermissionsField addSelfItem(SelfEnum selfItem) {
    this.self.add(selfItem);
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SelfEnum> getSelf() {
    return self;
  }

  public void setSelf(List<SelfEnum> self) {
    this.self = self;
  }

  public PermissionsField create(List<String> create) {
    this.create = create;
    return this;
  }

  public PermissionsField addCreateItem(String createItem) {
    this.create.add(createItem);
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getCreate() {
    return create;
  }

  public void setCreate(List<String> create) {
    this.create = create;
  }

  public PermissionsField read(List<String> read) {
    this.read = read;
    return this;
  }

  public PermissionsField addReadItem(String readItem) {
    this.read.add(readItem);
    return this;
  }

   /**
   * Get read
   * @return read
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getRead() {
    return read;
  }

  public void setRead(List<String> read) {
    this.read = read;
  }

  public PermissionsField update(List<String> update) {
    this.update = update;
    return this;
  }

  public PermissionsField addUpdateItem(String updateItem) {
    this.update.add(updateItem);
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getUpdate() {
    return update;
  }

  public void setUpdate(List<String> update) {
    this.update = update;
  }

  public PermissionsField delete(List<String> delete) {
    this.delete = delete;
    return this;
  }

  public PermissionsField addDeleteItem(String deleteItem) {
    this.delete.add(deleteItem);
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getDelete() {
    return delete;
  }

  public void setDelete(List<String> delete) {
    this.delete = delete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionsField permissionsField = (PermissionsField) o;
    return Objects.equals(this.self, permissionsField.self) &&
        Objects.equals(this.create, permissionsField.create) &&
        Objects.equals(this.read, permissionsField.read) &&
        Objects.equals(this.update, permissionsField.update) &&
        Objects.equals(this.delete, permissionsField.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, create, read, update, delete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionsField {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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

