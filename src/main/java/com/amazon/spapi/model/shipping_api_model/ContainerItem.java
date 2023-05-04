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
import com.amazon.spapi.model.shipping_api_model.Currency;
import com.amazon.spapi.model.shipping_api_model.Weight;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Item in the container.
 */
@ApiModel(description = "Item in the container.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:54:10.750-04:00")
public class ContainerItem {
  @SerializedName("quantity")
  private BigDecimal quantity = null;

  @SerializedName("unitPrice")
  private Currency unitPrice = null;

  @SerializedName("unitWeight")
  private Weight unitWeight = null;

  @SerializedName("title")
  private String title = null;

  public ContainerItem quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the items of this type in the container.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The quantity of the items of this type in the container.")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public ContainerItem unitPrice(Currency unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * The unit price of an item of this type (the total value of this item type in the container is unitPrice * quantity).
   * @return unitPrice
  **/
  @ApiModelProperty(required = true, value = "The unit price of an item of this type (the total value of this item type in the container is unitPrice * quantity).")
  public Currency getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Currency unitPrice) {
    this.unitPrice = unitPrice;
  }

  public ContainerItem unitWeight(Weight unitWeight) {
    this.unitWeight = unitWeight;
    return this;
  }

   /**
   * The unit weight of an item of this type (the total weight of this item type in the container is unitWeight * quantity).
   * @return unitWeight
  **/
  @ApiModelProperty(required = true, value = "The unit weight of an item of this type (the total weight of this item type in the container is unitWeight * quantity).")
  public Weight getUnitWeight() {
    return unitWeight;
  }

  public void setUnitWeight(Weight unitWeight) {
    this.unitWeight = unitWeight;
  }

  public ContainerItem title(String title) {
    this.title = title;
    return this;
  }

   /**
   * A descriptive title of the item.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "A descriptive title of the item.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerItem containerItem = (ContainerItem) o;
    return Objects.equals(this.quantity, containerItem.quantity) &&
        Objects.equals(this.unitPrice, containerItem.unitPrice) &&
        Objects.equals(this.unitWeight, containerItem.unitWeight) &&
        Objects.equals(this.title, containerItem.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, unitPrice, unitWeight, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerItem {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    unitWeight: ").append(toIndentedString(unitWeight)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

