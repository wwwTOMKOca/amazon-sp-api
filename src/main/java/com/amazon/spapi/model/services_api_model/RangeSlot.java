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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Capacity slots represented in a format similar to availability rules.
 */
@ApiModel(description = "Capacity slots represented in a format similar to availability rules.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:54:03.079-04:00")
public class RangeSlot {
  @SerializedName("startDateTime")
  private OffsetDateTime startDateTime = null;

  @SerializedName("endDateTime")
  private OffsetDateTime endDateTime = null;

  @SerializedName("capacity")
  private Integer capacity = null;

  public RangeSlot startDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Start date time of slot in ISO 8601 format with precision of seconds.
   * @return startDateTime
  **/
  @ApiModelProperty(value = "Start date time of slot in ISO 8601 format with precision of seconds.")
  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  public RangeSlot endDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

   /**
   * End date time of slot in ISO 8601 format with precision of seconds.
   * @return endDateTime
  **/
  @ApiModelProperty(value = "End date time of slot in ISO 8601 format with precision of seconds.")
  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }

  public RangeSlot capacity(Integer capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Capacity of the slot.
   * @return capacity
  **/
  @ApiModelProperty(value = "Capacity of the slot.")
  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeSlot rangeSlot = (RangeSlot) o;
    return Objects.equals(this.startDateTime, rangeSlot.startDateTime) &&
        Objects.equals(this.endDateTime, rangeSlot.endDateTime) &&
        Objects.equals(this.capacity, rangeSlot.capacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDateTime, endDateTime, capacity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeSlot {\n");
    
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
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

