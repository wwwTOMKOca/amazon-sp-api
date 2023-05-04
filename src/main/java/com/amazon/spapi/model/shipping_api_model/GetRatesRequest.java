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
import com.amazon.spapi.model.shipping_api_model.ContainerSpecificationList;
import com.amazon.spapi.model.shipping_api_model.ServiceTypeList;
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
 * The payload schema for the getRates operation.
 */
@ApiModel(description = "The payload schema for the getRates operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:28:02.003-04:00")
public class GetRatesRequest {
  @SerializedName("shipTo")
  private Address shipTo = null;

  @SerializedName("shipFrom")
  private Address shipFrom = null;

  @SerializedName("serviceTypes")
  private ServiceTypeList serviceTypes = null;

  @SerializedName("shipDate")
  private OffsetDateTime shipDate = null;

  @SerializedName("containerSpecifications")
  private ContainerSpecificationList containerSpecifications = null;

  public GetRatesRequest shipTo(Address shipTo) {
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

  public GetRatesRequest shipFrom(Address shipFrom) {
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

  public GetRatesRequest serviceTypes(ServiceTypeList serviceTypes) {
    this.serviceTypes = serviceTypes;
    return this;
  }

   /**
   * Get serviceTypes
   * @return serviceTypes
  **/
  @ApiModelProperty(required = true, value = "")
  public ServiceTypeList getServiceTypes() {
    return serviceTypes;
  }

  public void setServiceTypes(ServiceTypeList serviceTypes) {
    this.serviceTypes = serviceTypes;
  }

  public GetRatesRequest shipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
    return this;
  }

   /**
   * The start date and time. This defaults to the current date and time.
   * @return shipDate
  **/
  @ApiModelProperty(value = "The start date and time. This defaults to the current date and time.")
  public OffsetDateTime getShipDate() {
    return shipDate;
  }

  public void setShipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
  }

  public GetRatesRequest containerSpecifications(ContainerSpecificationList containerSpecifications) {
    this.containerSpecifications = containerSpecifications;
    return this;
  }

   /**
   * Get containerSpecifications
   * @return containerSpecifications
  **/
  @ApiModelProperty(required = true, value = "")
  public ContainerSpecificationList getContainerSpecifications() {
    return containerSpecifications;
  }

  public void setContainerSpecifications(ContainerSpecificationList containerSpecifications) {
    this.containerSpecifications = containerSpecifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRatesRequest getRatesRequest = (GetRatesRequest) o;
    return Objects.equals(this.shipTo, getRatesRequest.shipTo) &&
        Objects.equals(this.shipFrom, getRatesRequest.shipFrom) &&
        Objects.equals(this.serviceTypes, getRatesRequest.serviceTypes) &&
        Objects.equals(this.shipDate, getRatesRequest.shipDate) &&
        Objects.equals(this.containerSpecifications, getRatesRequest.containerSpecifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipTo, shipFrom, serviceTypes, shipDate, containerSpecifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRatesRequest {\n");
    
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    shipFrom: ").append(toIndentedString(shipFrom)).append("\n");
    sb.append("    serviceTypes: ").append(toIndentedString(serviceTypes)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    containerSpecifications: ").append(toIndentedString(containerSpecifications)).append("\n");
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

