/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 4.0.60-SNAPSHOT
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
import net.leanix.api.models.Chart;
import net.leanix.api.models.Series;

/**
 * ChartSetting
 */

public class ChartSetting {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("chart")
  private Chart chart = null;

  @JsonProperty("series")
  private List<Series> series = new ArrayList<Series>();

  public ChartSetting id(String id) {
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

  public ChartSetting chart(Chart chart) {
    this.chart = chart;
    return this;
  }

   /**
   * Get chart
   * @return chart
  **/
  @ApiModelProperty(example = "null", value = "")
  public Chart getChart() {
    return chart;
  }

  public void setChart(Chart chart) {
    this.chart = chart;
  }

  public ChartSetting series(List<Series> series) {
    this.series = series;
    return this;
  }

  public ChartSetting addSeriesItem(Series seriesItem) {
    this.series.add(seriesItem);
    return this;
  }

   /**
   * Get series
   * @return series
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Series> getSeries() {
    return series;
  }

  public void setSeries(List<Series> series) {
    this.series = series;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartSetting chartSetting = (ChartSetting) o;
    return Objects.equals(this.id, chartSetting.id) &&
        Objects.equals(this.chart, chartSetting.chart) &&
        Objects.equals(this.series, chartSetting.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, chart, series);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartSetting {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
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
