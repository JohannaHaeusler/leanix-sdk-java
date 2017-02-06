/**
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 0.1.8-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;


/**
 * Phase
 */

public class Phase   {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("startDateUnixEpoche")
  private Long startDateUnixEpoche = null;

  @JsonProperty("phase")
  private String phase = null;

  public Phase startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Phase startDateUnixEpoche(Long startDateUnixEpoche) {
    this.startDateUnixEpoche = startDateUnixEpoche;
    return this;
  }

   /**
   * Get startDateUnixEpoche
   * @return startDateUnixEpoche
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getStartDateUnixEpoche() {
    return startDateUnixEpoche;
  }

  public void setStartDateUnixEpoche(Long startDateUnixEpoche) {
    this.startDateUnixEpoche = startDateUnixEpoche;
  }

  public Phase phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phase phase = (Phase) o;
    return Objects.equals(this.startDate, phase.startDate) &&
        Objects.equals(this.startDateUnixEpoche, phase.startDateUnixEpoche) &&
        Objects.equals(this.phase, phase.phase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, startDateUnixEpoche, phase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phase {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startDateUnixEpoche: ").append(toIndentedString(startDateUnixEpoche)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
