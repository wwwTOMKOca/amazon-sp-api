/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders and manage their resources.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.services_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.services_api_model.DayOfWeek;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Repeated occurrence of an event in a time range.
 */
@ApiModel(description = "Repeated occurrence of an event in a time range.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:14.119-04:00")
public class Recurrence {
  @SerializedName("endTime")
  private OffsetDateTime endTime = null;

  @SerializedName("daysOfWeek")
  private List<DayOfWeek> daysOfWeek = null;

  @SerializedName("daysOfMonth")
  private List<Integer> daysOfMonth = null;

  public Recurrence endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * End time of the recurrence.
   * @return endTime
  **/
  @ApiModelProperty(required = true, value = "End time of the recurrence.")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public Recurrence daysOfWeek(List<DayOfWeek> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public Recurrence addDaysOfWeekItem(DayOfWeek daysOfWeekItem) {
    if (this.daysOfWeek == null) {
      this.daysOfWeek = new ArrayList<DayOfWeek>();
    }
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

   /**
   * Days of the week when recurrence is valid. If the schedule is valid every Monday, input will only contain &#x60;MONDAY&#x60; in the list.
   * @return daysOfWeek
  **/
  @ApiModelProperty(value = "Days of the week when recurrence is valid. If the schedule is valid every Monday, input will only contain `MONDAY` in the list.")
  public List<DayOfWeek> getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(List<DayOfWeek> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public Recurrence daysOfMonth(List<Integer> daysOfMonth) {
    this.daysOfMonth = daysOfMonth;
    return this;
  }

  public Recurrence addDaysOfMonthItem(Integer daysOfMonthItem) {
    if (this.daysOfMonth == null) {
      this.daysOfMonth = new ArrayList<Integer>();
    }
    this.daysOfMonth.add(daysOfMonthItem);
    return this;
  }

   /**
   * Days of the month when recurrence is valid.
   * @return daysOfMonth
  **/
  @ApiModelProperty(value = "Days of the month when recurrence is valid.")
  public List<Integer> getDaysOfMonth() {
    return daysOfMonth;
  }

  public void setDaysOfMonth(List<Integer> daysOfMonth) {
    this.daysOfMonth = daysOfMonth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recurrence recurrence = (Recurrence) o;
    return Objects.equals(this.endTime, recurrence.endTime) &&
        Objects.equals(this.daysOfWeek, recurrence.daysOfWeek) &&
        Objects.equals(this.daysOfMonth, recurrence.daysOfMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, daysOfWeek, daysOfMonth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recurrence {\n");
    
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    daysOfMonth: ").append(toIndentedString(daysOfMonth)).append("\n");
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

