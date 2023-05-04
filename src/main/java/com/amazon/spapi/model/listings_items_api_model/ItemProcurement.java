/*
 * Selling Partner API for Listings Items
 * The Selling Partner API for Listings Items (Listings Items API) provides programmatic access to selling partner listings on Amazon. Use this API in collaboration with the Selling Partner API for Product Type Definitions, which you use to retrieve the information about Amazon product types needed to use the Listings Items API.  For more information, see the [Listings Items API Use Case Guide](doc:listings-items-api-v2021-08-01-use-case-guide).
 *
 * OpenAPI spec version: 2021-08-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.listings_items_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.listings_items_api_model.Money;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Vendor procurement information for the listings item.
 */
@ApiModel(description = "Vendor procurement information for the listings item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:54:11.747-04:00")
public class ItemProcurement {
  @SerializedName("costPrice")
  private Money costPrice = null;

  public ItemProcurement costPrice(Money costPrice) {
    this.costPrice = costPrice;
    return this;
  }

   /**
   * The price (numeric value) that you want Amazon to pay you for this product.
   * @return costPrice
  **/
  @ApiModelProperty(required = true, value = "The price (numeric value) that you want Amazon to pay you for this product.")
  public Money getCostPrice() {
    return costPrice;
  }

  public void setCostPrice(Money costPrice) {
    this.costPrice = costPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemProcurement itemProcurement = (ItemProcurement) o;
    return Objects.equals(this.costPrice, itemProcurement.costPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemProcurement {\n");
    
    sb.append("    costPrice: ").append(toIndentedString(costPrice)).append("\n");
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

