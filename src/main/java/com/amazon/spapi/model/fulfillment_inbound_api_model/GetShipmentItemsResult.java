/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillment_inbound_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.fulfillment_inbound_api_model.InboundShipmentItemList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetShipmentItemsResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:53:54.337-04:00")
public class GetShipmentItemsResult {
  @SerializedName("ItemData")
  private InboundShipmentItemList itemData = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  public GetShipmentItemsResult itemData(InboundShipmentItemList itemData) {
    this.itemData = itemData;
    return this;
  }

   /**
   * A list of item information for an inbound shipment.
   * @return itemData
  **/
  @ApiModelProperty(value = "A list of item information for an inbound shipment.")
  public InboundShipmentItemList getItemData() {
    return itemData;
  }

  public void setItemData(InboundShipmentItemList itemData) {
    this.itemData = itemData;
  }

  public GetShipmentItemsResult nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * When present and not empty, pass this string token in the next request to return the next response page.
   * @return nextToken
  **/
  @ApiModelProperty(value = "When present and not empty, pass this string token in the next request to return the next response page.")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetShipmentItemsResult getShipmentItemsResult = (GetShipmentItemsResult) o;
    return Objects.equals(this.itemData, getShipmentItemsResult.itemData) &&
        Objects.equals(this.nextToken, getShipmentItemsResult.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemData, nextToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetShipmentItemsResult {\n");
    
    sb.append("    itemData: ").append(toIndentedString(itemData)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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

