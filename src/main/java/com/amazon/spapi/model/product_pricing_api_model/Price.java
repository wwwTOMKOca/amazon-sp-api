/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer pricing information for Amazon Marketplace products.  For more information, see the [Product Pricing v2022-05-01 Use Case Guide](doc:product-pricing-api-v2022-05-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-05-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.product_pricing_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.product_pricing_api_model.MoneyType;
import com.amazon.spapi.model.product_pricing_api_model.Points;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Price
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:32.787-04:00")
public class Price {
  @SerializedName("listingPrice")
  private MoneyType listingPrice = null;

  @SerializedName("shippingPrice")
  private MoneyType shippingPrice = null;

  @SerializedName("points")
  private Points points = null;

  public Price listingPrice(MoneyType listingPrice) {
    this.listingPrice = listingPrice;
    return this;
  }

   /**
   * The listing price of the item excluding any promotions.
   * @return listingPrice
  **/
  @ApiModelProperty(required = true, value = "The listing price of the item excluding any promotions.")
  public MoneyType getListingPrice() {
    return listingPrice;
  }

  public void setListingPrice(MoneyType listingPrice) {
    this.listingPrice = listingPrice;
  }

  public Price shippingPrice(MoneyType shippingPrice) {
    this.shippingPrice = shippingPrice;
    return this;
  }

   /**
   * The shipping cost of the product. Note that the shipping cost is not always available.
   * @return shippingPrice
  **/
  @ApiModelProperty(value = "The shipping cost of the product. Note that the shipping cost is not always available.")
  public MoneyType getShippingPrice() {
    return shippingPrice;
  }

  public void setShippingPrice(MoneyType shippingPrice) {
    this.shippingPrice = shippingPrice;
  }

  public Price points(Points points) {
    this.points = points;
    return this;
  }

   /**
   * The number of Amazon Points offered with the purchase of an item, and their monetary value.
   * @return points
  **/
  @ApiModelProperty(value = "The number of Amazon Points offered with the purchase of an item, and their monetary value.")
  public Points getPoints() {
    return points;
  }

  public void setPoints(Points points) {
    this.points = points;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.listingPrice, price.listingPrice) &&
        Objects.equals(this.shippingPrice, price.shippingPrice) &&
        Objects.equals(this.points, price.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listingPrice, shippingPrice, points);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    listingPrice: ").append(toIndentedString(listingPrice)).append("\n");
    sb.append("    shippingPrice: ").append(toIndentedString(shippingPrice)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

