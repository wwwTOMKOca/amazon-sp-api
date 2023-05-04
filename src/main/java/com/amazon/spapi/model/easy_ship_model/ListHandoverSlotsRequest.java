/*
 * Selling Partner API for Easy Ship
 * The Selling Partner API for Easy Ship helps you build applications that help sellers manage and ship Amazon Easy Ship orders.  Your Easy Ship applications can:  * Get available time slots for packages to be scheduled for delivery.  * Schedule, reschedule, and cancel Easy Ship orders.  * Print labels, invoices, and warranties.  See the [Marketplace Support Table](doc:easyship-api-v2022-03-23-use-case-guide#marketplace-support-table) for the differences in Easy Ship operations by marketplace.
 *
 * OpenAPI spec version: 2022-03-23
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.easy_ship_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.easy_ship_model.Dimensions;
import com.amazon.spapi.model.easy_ship_model.Weight;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The request schema for the &#x60;listHandoverSlots&#x60; operation.
 */
@ApiModel(description = "The request schema for the `listHandoverSlots` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:53:59.384-04:00")
public class ListHandoverSlotsRequest {
  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("amazonOrderId")
  private String amazonOrderId = null;

  @SerializedName("packageDimensions")
  private Dimensions packageDimensions = null;

  @SerializedName("packageWeight")
  private Weight packageWeight = null;

  public ListHandoverSlotsRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * Get marketplaceId
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public ListHandoverSlotsRequest amazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
    return this;
  }

   /**
   * Get amazonOrderId
   * @return amazonOrderId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAmazonOrderId() {
    return amazonOrderId;
  }

  public void setAmazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
  }

  public ListHandoverSlotsRequest packageDimensions(Dimensions packageDimensions) {
    this.packageDimensions = packageDimensions;
    return this;
  }

   /**
   * Get packageDimensions
   * @return packageDimensions
  **/
  @ApiModelProperty(required = true, value = "")
  public Dimensions getPackageDimensions() {
    return packageDimensions;
  }

  public void setPackageDimensions(Dimensions packageDimensions) {
    this.packageDimensions = packageDimensions;
  }

  public ListHandoverSlotsRequest packageWeight(Weight packageWeight) {
    this.packageWeight = packageWeight;
    return this;
  }

   /**
   * Get packageWeight
   * @return packageWeight
  **/
  @ApiModelProperty(required = true, value = "")
  public Weight getPackageWeight() {
    return packageWeight;
  }

  public void setPackageWeight(Weight packageWeight) {
    this.packageWeight = packageWeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListHandoverSlotsRequest listHandoverSlotsRequest = (ListHandoverSlotsRequest) o;
    return Objects.equals(this.marketplaceId, listHandoverSlotsRequest.marketplaceId) &&
        Objects.equals(this.amazonOrderId, listHandoverSlotsRequest.amazonOrderId) &&
        Objects.equals(this.packageDimensions, listHandoverSlotsRequest.packageDimensions) &&
        Objects.equals(this.packageWeight, listHandoverSlotsRequest.packageWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, amazonOrderId, packageDimensions, packageWeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListHandoverSlotsRequest {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
    sb.append("    packageDimensions: ").append(toIndentedString(packageDimensions)).append("\n");
    sb.append("    packageWeight: ").append(toIndentedString(packageWeight)).append("\n");
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

