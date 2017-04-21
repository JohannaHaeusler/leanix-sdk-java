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

/**
 * ConfigTypeOnOffWithTime
 */

public class ConfigTypeOnOffWithTime {
  @JsonProperty("enabled")
  private Boolean enabled = false;

  @JsonProperty("value")
  private Long value = null;

  /**
   * Gets or Sets unit
   */
  public enum UnitEnum {
    NANOSECONDS("NANOSECONDS"),
    
    MICROSECONDS("MICROSECONDS"),
    
    MILLISECONDS("MILLISECONDS"),
    
    SECONDS("SECONDS"),
    
    MINUTES("MINUTES"),
    
    HOURS("HOURS"),
    
    DAYS("DAYS");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UnitEnum fromValue(String text) {
      for (UnitEnum b : UnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("unit")
  private UnitEnum unit = null;

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getEnabled() {
    return enabled;
  }

  public ConfigTypeOnOffWithTime value(Long value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public ConfigTypeOnOffWithTime unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @ApiModelProperty(example = "null", value = "")
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigTypeOnOffWithTime configTypeOnOffWithTime = (ConfigTypeOnOffWithTime) o;
    return Objects.equals(this.enabled, configTypeOnOffWithTime.enabled) &&
        Objects.equals(this.value, configTypeOnOffWithTime.value) &&
        Objects.equals(this.unit, configTypeOnOffWithTime.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, value, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigTypeOnOffWithTime {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

