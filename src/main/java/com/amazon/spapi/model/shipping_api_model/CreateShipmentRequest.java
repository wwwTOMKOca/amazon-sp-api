/*
 * Selling Partner API for Shipping
 * Provides programmatic access to Amazon Shipping APIs.   **Note:** If you are new to the Amazon Shipping API, refer to the latest version of <a href=\"https://developer-docs.amazon.com/amazon-shipping/docs/shipping-api-v2-reference\">Amazon Shipping API (v2)</a> on the <a href=\"https://developer-docs.amazon.com/amazon-shipping/\">Amazon Shipping Developer Documentation</a> site.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.shipping_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.shipping_api_model.Address;
import com.amazon.spapi.model.shipping_api_model.ContainerList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The request schema for the createShipment operation.
 */
@ApiModel(description = "The request schema for the createShipment operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:15.232-04:00")
public class CreateShipmentRequest {
  @SerializedName("clientReferenceId")
  private String clientReferenceId = null;

  @SerializedName("shipTo")
  private Address shipTo = null;

  @SerializedName("shipFrom")
  private Address shipFrom = null;

  @SerializedName("containers")
  private ContainerList containers = null;

  public CreateShipmentRequest clientReferenceId(String clientReferenceId) {
    this.clientReferenceId = clientReferenceId;
    return this;
  }

   /**
   * Get clientReferenceId
   * @return clientReferenceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getClientReferenceId() {
    return clientReferenceId;
  }

  public void setClientReferenceId(String clientReferenceId) {
    this.clientReferenceId = clientReferenceId;
  }

  public CreateShipmentRequest shipTo(Address shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(required = true, value = "")
  public Address getShipTo() {
    return shipTo;
  }

  public void setShipTo(Address shipTo) {
    this.shipTo = shipTo;
  }

  public CreateShipmentRequest shipFrom(Address shipFrom) {
    this.shipFrom = shipFrom;
    return this;
  }

   /**
   * Get shipFrom
   * @return shipFrom
  **/
  @ApiModelProperty(required = true, value = "")
  public Address getShipFrom() {
    return shipFrom;
  }

  public void setShipFrom(Address shipFrom) {
    this.shipFrom = shipFrom;
  }

  public CreateShipmentRequest containers(ContainerList containers) {
    this.containers = containers;
    return this;
  }

   /**
   * Get containers
   * @return containers
  **/
  @ApiModelProperty(required = true, value = "")
  public ContainerList getContainers() {
    return containers;
  }

  public void setContainers(ContainerList containers) {
    this.containers = containers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShipmentRequest createShipmentRequest = (CreateShipmentRequest) o;
    return Objects.equals(this.clientReferenceId, createShipmentRequest.clientReferenceId) &&
        Objects.equals(this.shipTo, createShipmentRequest.shipTo) &&
        Objects.equals(this.shipFrom, createShipmentRequest.shipFrom) &&
        Objects.equals(this.containers, createShipmentRequest.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceId, shipTo, shipFrom, containers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShipmentRequest {\n");
    
    sb.append("    clientReferenceId: ").append(toIndentedString(clientReferenceId)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    shipFrom: ").append(toIndentedString(shipFrom)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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

