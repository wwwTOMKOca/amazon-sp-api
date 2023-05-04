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
import com.amazon.spapi.model.vendor_direct_fulfillment_shipping_api_model.Container;
import com.amazon.spapi.model.vendor_direct_fulfillment_shipping_api_model.PartyIdentification;
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

/**
 * The request body for the createShippingLabels operation.
 */
@ApiModel(description = "The request body for the createShippingLabels operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:54:07.786-04:00")
public class CreateShippingLabelsRequest {
  @SerializedName("sellingParty")
  private PartyIdentification sellingParty = null;

  @SerializedName("shipFromParty")
  private PartyIdentification shipFromParty = null;

  @SerializedName("containers")
  private List<Container> containers = null;

  public CreateShippingLabelsRequest sellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
    return this;
  }

   /**
   * ID of the selling party or vendor.
   * @return sellingParty
  **/
  @ApiModelProperty(required = true, value = "ID of the selling party or vendor.")
  public PartyIdentification getSellingParty() {
    return sellingParty;
  }

  public void setSellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
  }

  public CreateShippingLabelsRequest shipFromParty(PartyIdentification shipFromParty) {
    this.shipFromParty = shipFromParty;
    return this;
  }

   /**
   * Warehouse code of vendor.
   * @return shipFromParty
  **/
  @ApiModelProperty(required = true, value = "Warehouse code of vendor.")
  public PartyIdentification getShipFromParty() {
    return shipFromParty;
  }

  public void setShipFromParty(PartyIdentification shipFromParty) {
    this.shipFromParty = shipFromParty;
  }

  public CreateShippingLabelsRequest containers(List<Container> containers) {
    this.containers = containers;
    return this;
  }

  public CreateShippingLabelsRequest addContainersItem(Container containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<Container>();
    }
    this.containers.add(containersItem);
    return this;
  }

   /**
   * A list of the packages in this shipment.
   * @return containers
  **/
  @ApiModelProperty(value = "A list of the packages in this shipment.")
  public List<Container> getContainers() {
    return containers;
  }

  public void setContainers(List<Container> containers) {
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
    CreateShippingLabelsRequest createShippingLabelsRequest = (CreateShippingLabelsRequest) o;
    return Objects.equals(this.sellingParty, createShippingLabelsRequest.sellingParty) &&
        Objects.equals(this.shipFromParty, createShippingLabelsRequest.shipFromParty) &&
        Objects.equals(this.containers, createShippingLabelsRequest.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellingParty, shipFromParty, containers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShippingLabelsRequest {\n");
    
    sb.append("    sellingParty: ").append(toIndentedString(sellingParty)).append("\n");
    sb.append("    shipFromParty: ").append(toIndentedString(shipFromParty)).append("\n");
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

