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
import com.amazon.spapi.model.services_api_model.ErrorList;
import com.amazon.spapi.model.services_api_model.Reservation;
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
 * &#x60;CreateReservationRecord&#x60; entity contains the &#x60;Reservation&#x60; if there is an error/warning while performing the requested operation on it, otherwise it will contain the new &#x60;reservationId&#x60;.
 */
@ApiModel(description = "`CreateReservationRecord` entity contains the `Reservation` if there is an error/warning while performing the requested operation on it, otherwise it will contain the new `reservationId`.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:27:53.305-04:00")
public class CreateReservationRecord {
  @SerializedName("reservation")
  private Reservation reservation = null;

  @SerializedName("warnings")
  private WarningList warnings = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public CreateReservationRecord reservation(Reservation reservation) {
    this.reservation = reservation;
    return this;
  }

   /**
   * Reservation record if the operation failed. It will only contain the new &#x60;reservationId&#x60; if the operation is successful.
   * @return reservation
  **/
  @ApiModelProperty(value = "Reservation record if the operation failed. It will only contain the new `reservationId` if the operation is successful.")
  public Reservation getReservation() {
    return reservation;
  }

  public void setReservation(Reservation reservation) {
    this.reservation = reservation;
  }

  public CreateReservationRecord warnings(WarningList warnings) {
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

  public CreateReservationRecord errors(ErrorList errors) {
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
    CreateReservationRecord createReservationRecord = (CreateReservationRecord) o;
    return Objects.equals(this.reservation, createReservationRecord.reservation) &&
        Objects.equals(this.warnings, createReservationRecord.warnings) &&
        Objects.equals(this.errors, createReservationRecord.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservation, warnings, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReservationRecord {\n");
    
    sb.append("    reservation: ").append(toIndentedString(reservation)).append("\n");
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

