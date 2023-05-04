/*
 * Selling Partner API for Retail Procurement Orders
 * The Selling Partner API for Retail Procurement Orders provides programmatic access to vendor orders data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_orders_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_orders_api_model.OrderAcknowledgementItem;
import com.amazon.spapi.model.vendor_orders_api_model.PartyIdentification;
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
 * OrderAcknowledgement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:27:42.994-04:00")
public class OrderAcknowledgement {
  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  @SerializedName("sellingParty")
  private PartyIdentification sellingParty = null;

  @SerializedName("acknowledgementDate")
  private OffsetDateTime acknowledgementDate = null;

  @SerializedName("items")
  private List<OrderAcknowledgementItem> items = new ArrayList<OrderAcknowledgementItem>();

  public OrderAcknowledgement purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * The purchase order number. Formatting Notes: 8-character alpha-numeric code.
   * @return purchaseOrderNumber
  **/
  @ApiModelProperty(required = true, value = "The purchase order number. Formatting Notes: 8-character alpha-numeric code.")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public OrderAcknowledgement sellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
    return this;
  }

   /**
   * Name, address and tax details of the party receiving a shipment of products.
   * @return sellingParty
  **/
  @ApiModelProperty(required = true, value = "Name, address and tax details of the party receiving a shipment of products.")
  public PartyIdentification getSellingParty() {
    return sellingParty;
  }

  public void setSellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
  }

  public OrderAcknowledgement acknowledgementDate(OffsetDateTime acknowledgementDate) {
    this.acknowledgementDate = acknowledgementDate;
    return this;
  }

   /**
   * The date and time when the purchase order is acknowledged, in ISO-8601 date/time format.
   * @return acknowledgementDate
  **/
  @ApiModelProperty(required = true, value = "The date and time when the purchase order is acknowledged, in ISO-8601 date/time format.")
  public OffsetDateTime getAcknowledgementDate() {
    return acknowledgementDate;
  }

  public void setAcknowledgementDate(OffsetDateTime acknowledgementDate) {
    this.acknowledgementDate = acknowledgementDate;
  }

  public OrderAcknowledgement items(List<OrderAcknowledgementItem> items) {
    this.items = items;
    return this;
  }

  public OrderAcknowledgement addItemsItem(OrderAcknowledgementItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of the items being acknowledged with associated details.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "A list of the items being acknowledged with associated details.")
  public List<OrderAcknowledgementItem> getItems() {
    return items;
  }

  public void setItems(List<OrderAcknowledgementItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderAcknowledgement orderAcknowledgement = (OrderAcknowledgement) o;
    return Objects.equals(this.purchaseOrderNumber, orderAcknowledgement.purchaseOrderNumber) &&
        Objects.equals(this.sellingParty, orderAcknowledgement.sellingParty) &&
        Objects.equals(this.acknowledgementDate, orderAcknowledgement.acknowledgementDate) &&
        Objects.equals(this.items, orderAcknowledgement.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseOrderNumber, sellingParty, acknowledgementDate, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderAcknowledgement {\n");
    
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    sellingParty: ").append(toIndentedString(sellingParty)).append("\n");
    sb.append("    acknowledgementDate: ").append(toIndentedString(acknowledgementDate)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

