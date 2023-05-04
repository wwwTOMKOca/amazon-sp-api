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
import com.amazon.spapi.model.services_api_model.AvailabilityRecord;
import com.amazon.spapi.model.services_api_model.ErrorList;
import com.amazon.spapi.model.services_api_model.WarningList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * &#x60;UpdateScheduleRecord&#x60; entity contains the &#x60;AvailabilityRecord&#x60; if there is an error/warning while performing the requested operation on it.
 */
@ApiModel(description = "`UpdateScheduleRecord` entity contains the `AvailabilityRecord` if there is an error/warning while performing the requested operation on it.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:54:03.079-04:00")
public class UpdateScheduleRecord {
  @SerializedName("availability")
  private AvailabilityRecord availability = null;

  @SerializedName("warnings")
  private WarningList warnings = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public UpdateScheduleRecord availability(AvailabilityRecord availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Availability record if the operation failed.
   * @return availability
  **/
  @ApiModelProperty(value = "Availability record if the operation failed.")
  public AvailabilityRecord getAvailability() {
    return availability;
  }

  public void setAvailability(AvailabilityRecord availability) {
    this.availability = availability;
  }

  public UpdateScheduleRecord warnings(WarningList warnings) {
    this.warnings = warnings;
    return this;
  }

   /**
   * Warnings encountered, if any.
   * @return warnings
  **/
  @ApiModelProperty(value = "Warnings encountered, if any.")
  public WarningList getWarnings() {
    return warnings;
  }

  public void setWarnings(WarningList warnings) {
    this.warnings = warnings;
  }

  public UpdateScheduleRecord errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Errors encountered, if any.
   * @return errors
  **/
  @ApiModelProperty(value = "Errors encountered, if any.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateScheduleRecord updateScheduleRecord = (UpdateScheduleRecord) o;
    return Objects.equals(this.availability, updateScheduleRecord.availability) &&
        Objects.equals(this.warnings, updateScheduleRecord.warnings) &&
        Objects.equals(this.errors, updateScheduleRecord.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, warnings, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateScheduleRecord {\n");
    
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

