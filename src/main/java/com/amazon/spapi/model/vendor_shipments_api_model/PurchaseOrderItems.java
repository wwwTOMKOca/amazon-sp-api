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
import com.amazon.spapi.model.vendor_shipments_api_model.ItemQuantity;
import com.amazon.spapi.model.vendor_shipments_api_model.Money;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Details of the item being shipped.
 */
@ApiModel(description = "Details of the item being shipped.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:54:08.878-04:00")
public class PurchaseOrderItems {
  @SerializedName("itemSequenceNumber")
  private String itemSequenceNumber = null;

  @SerializedName("buyerProductIdentifier")
  private String buyerProductIdentifier = null;

  @SerializedName("vendorProductIdentifier")
  private String vendorProductIdentifier = null;

  @SerializedName("shippedQuantity")
  private ItemQuantity shippedQuantity = null;

  @SerializedName("maximumRetailPrice")
  private Money maximumRetailPrice = null;

  public PurchaseOrderItems itemSequenceNumber(String itemSequenceNumber) {
    this.itemSequenceNumber = itemSequenceNumber;
    return this;
  }

   /**
   * Item sequence number for the item. The first item will be 001, the second 002, and so on. This number is used as a reference to refer to this item from the carton or pallet level.
   * @return itemSequenceNumber
  **/
  @ApiModelProperty(required = true, value = "Item sequence number for the item. The first item will be 001, the second 002, and so on. This number is used as a reference to refer to this item from the carton or pallet level.")
  public String getItemSequenceNumber() {
    return itemSequenceNumber;
  }

  public void setItemSequenceNumber(String itemSequenceNumber) {
    this.itemSequenceNumber = itemSequenceNumber;
  }

  public PurchaseOrderItems buyerProductIdentifier(String buyerProductIdentifier) {
    this.buyerProductIdentifier = buyerProductIdentifier;
    return this;
  }

   /**
   * Amazon Standard Identification Number (ASIN) for a SKU
   * @return buyerProductIdentifier
  **/
  @ApiModelProperty(value = "Amazon Standard Identification Number (ASIN) for a SKU")
  public String getBuyerProductIdentifier() {
    return buyerProductIdentifier;
  }

  public void setBuyerProductIdentifier(String buyerProductIdentifier) {
    this.buyerProductIdentifier = buyerProductIdentifier;
  }

  public PurchaseOrderItems vendorProductIdentifier(String vendorProductIdentifier) {
    this.vendorProductIdentifier = vendorProductIdentifier;
    return this;
  }

   /**
   * The vendor selected product identification of the item. Should be the same as was sent in the purchase order.
   * @return vendorProductIdentifier
  **/
  @ApiModelProperty(value = "The vendor selected product identification of the item. Should be the same as was sent in the purchase order.")
  public String getVendorProductIdentifier() {
    return vendorProductIdentifier;
  }

  public void setVendorProductIdentifier(String vendorProductIdentifier) {
    this.vendorProductIdentifier = vendorProductIdentifier;
  }

  public PurchaseOrderItems shippedQuantity(ItemQuantity shippedQuantity) {
    this.shippedQuantity = shippedQuantity;
    return this;
  }

   /**
   * Total item quantity shipped in this shipment.
   * @return shippedQuantity
  **/
  @ApiModelProperty(required = true, value = "Total item quantity shipped in this shipment.")
  public ItemQuantity getShippedQuantity() {
    return shippedQuantity;
  }

  public void setShippedQuantity(ItemQuantity shippedQuantity) {
    this.shippedQuantity = shippedQuantity;
  }

  public PurchaseOrderItems maximumRetailPrice(Money maximumRetailPrice) {
    this.maximumRetailPrice = maximumRetailPrice;
    return this;
  }

   /**
   * Get maximumRetailPrice
   * @return maximumRetailPrice
  **/
  @ApiModelProperty(value = "")
  public Money getMaximumRetailPrice() {
    return maximumRetailPrice;
  }

  public void setMaximumRetailPrice(Money maximumRetailPrice) {
    this.maximumRetailPrice = maximumRetailPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseOrderItems purchaseOrderItems = (PurchaseOrderItems) o;
    return Objects.equals(this.itemSequenceNumber, purchaseOrderItems.itemSequenceNumber) &&
        Objects.equals(this.buyerProductIdentifier, purchaseOrderItems.buyerProductIdentifier) &&
        Objects.equals(this.vendorProductIdentifier, purchaseOrderItems.vendorProductIdentifier) &&
        Objects.equals(this.shippedQuantity, purchaseOrderItems.shippedQuantity) &&
        Objects.equals(this.maximumRetailPrice, purchaseOrderItems.maximumRetailPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemSequenceNumber, buyerProductIdentifier, vendorProductIdentifier, shippedQuantity, maximumRetailPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseOrderItems {\n");
    
    sb.append("    itemSequenceNumber: ").append(toIndentedString(itemSequenceNumber)).append("\n");
    sb.append("    buyerProductIdentifier: ").append(toIndentedString(buyerProductIdentifier)).append("\n");
    sb.append("    vendorProductIdentifier: ").append(toIndentedString(vendorProductIdentifier)).append("\n");
    sb.append("    shippedQuantity: ").append(toIndentedString(shippedQuantity)).append("\n");
    sb.append("    maximumRetailPrice: ").append(toIndentedString(maximumRetailPrice)).append("\n");
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

