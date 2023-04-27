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
import com.amazon.spapi.model.shipping_api_model.ErrorList;
import com.amazon.spapi.model.shipping_api_model.PurchaseShipmentResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response schema for the purchaseShipment operation.
 */
@ApiModel(description = "The response schema for the purchaseShipment operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:15.232-04:00")
public class PurchaseShipmentResponse {
  @SerializedName("payload")
  private PurchaseShipmentResult payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public PurchaseShipmentResponse payload(PurchaseShipmentResult payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for purchaseShipment operation
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for purchaseShipment operation")
  public PurchaseShipmentResult getPayload() {
    return payload;
  }

  public void setPayload(PurchaseShipmentResult payload) {
    this.payload = payload;
  }

  public PurchaseShipmentResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Encountered errors for the operation.
   * @return errors
  **/
  @ApiModelProperty(value = "Encountered errors for the operation.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseShipmentResponse purchaseShipmentResponse = (PurchaseShipmentResponse) o;
    return Objects.equals(this.payload, purchaseShipmentResponse.payload) &&
        Objects.equals(this.errors, purchaseShipmentResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseShipmentResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
