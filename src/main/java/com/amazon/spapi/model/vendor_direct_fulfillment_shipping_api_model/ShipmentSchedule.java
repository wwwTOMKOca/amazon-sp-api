/*
 * Selling Partner API for Direct Fulfillment Shipping
 * The Selling Partner API for Direct Fulfillment Shipping provides programmatic access to a direct fulfillment vendor's shipping data.
 *
 * OpenAPI spec version: 2021-12-28
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_direct_fulfillment_shipping_api_model;

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
 * Details about the estimated delivery window.
 */
@ApiModel(description = "Details about the estimated delivery window.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:27:58.519-04:00")
public class ShipmentSchedule {
  @SerializedName("estimatedDeliveryDateTime")
  private OffsetDateTime estimatedDeliveryDateTime = null;

  @SerializedName("apptWindowStartDateTime")
  private OffsetDateTime apptWindowStartDateTime = null;

  @SerializedName("apptWindowEndDateTime")
  private OffsetDateTime apptWindowEndDateTime = null;

  public ShipmentSchedule estimatedDeliveryDateTime(OffsetDateTime estimatedDeliveryDateTime) {
    this.estimatedDeliveryDateTime = estimatedDeliveryDateTime;
    return this;
  }

   /**
   * Date on which the shipment is expected to reach the customer delivery location. This field is expected to be in ISO-8601 date/time format, with UTC time zone or UTC offset. For example, 2020-07-16T23:00:00Z or 2020-07-16T23:00:00+01:00.
   * @return estimatedDeliveryDateTime
  **/
  @ApiModelProperty(value = "Date on which the shipment is expected to reach the customer delivery location. This field is expected to be in ISO-8601 date/time format, with UTC time zone or UTC offset. For example, 2020-07-16T23:00:00Z or 2020-07-16T23:00:00+01:00.")
  public OffsetDateTime getEstimatedDeliveryDateTime() {
    return estimatedDeliveryDateTime;
  }

  public void setEstimatedDeliveryDateTime(OffsetDateTime estimatedDeliveryDateTime) {
    this.estimatedDeliveryDateTime = estimatedDeliveryDateTime;
  }

  public ShipmentSchedule apptWindowStartDateTime(OffsetDateTime apptWindowStartDateTime) {
    this.apptWindowStartDateTime = apptWindowStartDateTime;
    return this;
  }

   /**
   * This field indicates the date and time at the start of the appointment window scheduled to deliver the shipment. This field is expected to be in ISO-8601 date/time format, with UTC time zone or UTC offset. For example, 2020-07-16T23:00:00Z or 2020-07-16T23:00:00+01:00.
   * @return apptWindowStartDateTime
  **/
  @ApiModelProperty(value = "This field indicates the date and time at the start of the appointment window scheduled to deliver the shipment. This field is expected to be in ISO-8601 date/time format, with UTC time zone or UTC offset. For example, 2020-07-16T23:00:00Z or 2020-07-16T23:00:00+01:00.")
  public OffsetDateTime getApptWindowStartDateTime() {
    return apptWindowStartDateTime;
  }

  public void setApptWindowStartDateTime(OffsetDateTime apptWindowStartDateTime) {
    this.apptWindowStartDateTime = apptWindowStartDateTime;
  }

  public ShipmentSchedule apptWindowEndDateTime(OffsetDateTime apptWindowEndDateTime) {
    this.apptWindowEndDateTime = apptWindowEndDateTime;
    return this;
  }

   /**
   * This field indicates the date and time at the end of the appointment window scheduled to deliver the shipment. This field is expected to be in ISO-8601 date/time format, with UTC time zone or UTC offset. For example, 2020-07-16T23:00:00Z or 2020-07-16T23:00:00+01:00.
   * @return apptWindowEndDateTime
  **/
  @ApiModelProperty(value = "This field indicates the date and time at the end of the appointment window scheduled to deliver the shipment. This field is expected to be in ISO-8601 date/time format, with UTC time zone or UTC offset. For example, 2020-07-16T23:00:00Z or 2020-07-16T23:00:00+01:00.")
  public OffsetDateTime getApptWindowEndDateTime() {
    return apptWindowEndDateTime;
  }

  public void setApptWindowEndDateTime(OffsetDateTime apptWindowEndDateTime) {
    this.apptWindowEndDateTime = apptWindowEndDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentSchedule shipmentSchedule = (ShipmentSchedule) o;
    return Objects.equals(this.estimatedDeliveryDateTime, shipmentSchedule.estimatedDeliveryDateTime) &&
        Objects.equals(this.apptWindowStartDateTime, shipmentSchedule.apptWindowStartDateTime) &&
        Objects.equals(this.apptWindowEndDateTime, shipmentSchedule.apptWindowEndDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedDeliveryDateTime, apptWindowStartDateTime, apptWindowEndDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentSchedule {\n");
    
    sb.append("    estimatedDeliveryDateTime: ").append(toIndentedString(estimatedDeliveryDateTime)).append("\n");
    sb.append("    apptWindowStartDateTime: ").append(toIndentedString(apptWindowStartDateTime)).append("\n");
    sb.append("    apptWindowEndDateTime: ").append(toIndentedString(apptWindowEndDateTime)).append("\n");
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

