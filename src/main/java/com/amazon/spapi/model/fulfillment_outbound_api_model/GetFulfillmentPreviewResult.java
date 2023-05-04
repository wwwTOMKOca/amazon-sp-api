/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillment_outbound_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.fulfillment_outbound_api_model.FulfillmentPreviewList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A list of fulfillment order previews, including estimated shipping weights, estimated shipping fees, and estimated ship dates and arrival dates.
 */
@ApiModel(description = "A list of fulfillment order previews, including estimated shipping weights, estimated shipping fees, and estimated ship dates and arrival dates.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:27:41.721-04:00")
public class GetFulfillmentPreviewResult {
  @SerializedName("fulfillmentPreviews")
  private FulfillmentPreviewList fulfillmentPreviews = null;

  public GetFulfillmentPreviewResult fulfillmentPreviews(FulfillmentPreviewList fulfillmentPreviews) {
    this.fulfillmentPreviews = fulfillmentPreviews;
    return this;
  }

   /**
   * Get fulfillmentPreviews
   * @return fulfillmentPreviews
  **/
  @ApiModelProperty(value = "")
  public FulfillmentPreviewList getFulfillmentPreviews() {
    return fulfillmentPreviews;
  }

  public void setFulfillmentPreviews(FulfillmentPreviewList fulfillmentPreviews) {
    this.fulfillmentPreviews = fulfillmentPreviews;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFulfillmentPreviewResult getFulfillmentPreviewResult = (GetFulfillmentPreviewResult) o;
    return Objects.equals(this.fulfillmentPreviews, getFulfillmentPreviewResult.fulfillmentPreviews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentPreviews);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFulfillmentPreviewResult {\n");
    
    sb.append("    fulfillmentPreviews: ").append(toIndentedString(fulfillmentPreviews)).append("\n");
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

