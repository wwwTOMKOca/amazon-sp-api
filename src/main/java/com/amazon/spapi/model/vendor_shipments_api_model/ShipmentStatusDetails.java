/*
 * Selling Partner API for Retail Procurement Shipments
 * The Selling Partner API for Retail Procurement Shipments provides programmatic access to retail shipping data for vendors.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_shipments_api_model;

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
 * Shipment Status details.
 */
@ApiModel(description = "Shipment Status details.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:12.893-04:00")
public class ShipmentStatusDetails {
  /**
   * Current status of the shipment on whether it is picked up or scheduled.
   */
  @JsonAdapter(ShipmentStatusEnum.Adapter.class)
  public enum ShipmentStatusEnum {
    CREATED("Created"),
    
    TRANSPORTATIONREQUESTED("TransportationRequested"),
    
    CARRIERASSIGNED("CarrierAssigned"),
    
    SHIPPED("Shipped");

    private String value;

    ShipmentStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShipmentStatusEnum fromValue(String text) {
      for (ShipmentStatusEnum b : ShipmentStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ShipmentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShipmentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShipmentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ShipmentStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("shipmentStatus")
  private ShipmentStatusEnum shipmentStatus = null;

  @SerializedName("shipmentStatusDate")
  private OffsetDateTime shipmentStatusDate = null;

  public ShipmentStatusDetails shipmentStatus(ShipmentStatusEnum shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
    return this;
  }

   /**
   * Current status of the shipment on whether it is picked up or scheduled.
   * @return shipmentStatus
  **/
  @ApiModelProperty(value = "Current status of the shipment on whether it is picked up or scheduled.")
  public ShipmentStatusEnum getShipmentStatus() {
    return shipmentStatus;
  }

  public void setShipmentStatus(ShipmentStatusEnum shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }

  public ShipmentStatusDetails shipmentStatusDate(OffsetDateTime shipmentStatusDate) {
    this.shipmentStatusDate = shipmentStatusDate;
    return this;
  }

   /**
   * Date and time on last status update received for the shipment
   * @return shipmentStatusDate
  **/
  @ApiModelProperty(value = "Date and time on last status update received for the shipment")
  public OffsetDateTime getShipmentStatusDate() {
    return shipmentStatusDate;
  }

  public void setShipmentStatusDate(OffsetDateTime shipmentStatusDate) {
    this.shipmentStatusDate = shipmentStatusDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentStatusDetails shipmentStatusDetails = (ShipmentStatusDetails) o;
    return Objects.equals(this.shipmentStatus, shipmentStatusDetails.shipmentStatus) &&
        Objects.equals(this.shipmentStatusDate, shipmentStatusDetails.shipmentStatusDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentStatus, shipmentStatusDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentStatusDetails {\n");
    
    sb.append("    shipmentStatus: ").append(toIndentedString(shipmentStatus)).append("\n");
    sb.append("    shipmentStatusDate: ").append(toIndentedString(shipmentStatusDate)).append("\n");
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

