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
import com.amazon.spapi.model.vendor_direct_fulfillment_shipping_api_model.Pagination;
import com.amazon.spapi.model.vendor_direct_fulfillment_shipping_api_model.ShippingLabel;
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
 * ShippingLabelList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:27:58.519-04:00")
public class ShippingLabelList {
  @SerializedName("pagination")
  private Pagination pagination = null;

  @SerializedName("shippingLabels")
  private List<ShippingLabel> shippingLabels = null;

  public ShippingLabelList pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public ShippingLabelList shippingLabels(List<ShippingLabel> shippingLabels) {
    this.shippingLabels = shippingLabels;
    return this;
  }

  public ShippingLabelList addShippingLabelsItem(ShippingLabel shippingLabelsItem) {
    if (this.shippingLabels == null) {
      this.shippingLabels = new ArrayList<ShippingLabel>();
    }
    this.shippingLabels.add(shippingLabelsItem);
    return this;
  }

   /**
   * Get shippingLabels
   * @return shippingLabels
  **/
  @ApiModelProperty(value = "")
  public List<ShippingLabel> getShippingLabels() {
    return shippingLabels;
  }

  public void setShippingLabels(List<ShippingLabel> shippingLabels) {
    this.shippingLabels = shippingLabels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingLabelList shippingLabelList = (ShippingLabelList) o;
    return Objects.equals(this.pagination, shippingLabelList.pagination) &&
        Objects.equals(this.shippingLabels, shippingLabelList.shippingLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, shippingLabels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingLabelList {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    shippingLabels: ").append(toIndentedString(shippingLabels)).append("\n");
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

