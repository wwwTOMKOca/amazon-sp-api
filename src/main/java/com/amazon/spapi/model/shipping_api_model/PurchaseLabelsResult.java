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
import com.amazon.spapi.model.shipping_api_model.AcceptedRate;
import com.amazon.spapi.model.shipping_api_model.LabelResultList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The payload schema for the purchaseLabels operation.
 */
@ApiModel(description = "The payload schema for the purchaseLabels operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:15.232-04:00")
public class PurchaseLabelsResult {
  @SerializedName("shipmentId")
  private String shipmentId = null;

  @SerializedName("clientReferenceId")
  private String clientReferenceId = null;

  @SerializedName("acceptedRate")
  private AcceptedRate acceptedRate = null;

  @SerializedName("labelResults")
  private LabelResultList labelResults = null;

  public PurchaseLabelsResult shipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

   /**
   * Get shipmentId
   * @return shipmentId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
  }

  public PurchaseLabelsResult clientReferenceId(String clientReferenceId) {
    this.clientReferenceId = clientReferenceId;
    return this;
  }

   /**
   * Get clientReferenceId
   * @return clientReferenceId
  **/
  @ApiModelProperty(value = "")
  public String getClientReferenceId() {
    return clientReferenceId;
  }

  public void setClientReferenceId(String clientReferenceId) {
    this.clientReferenceId = clientReferenceId;
  }

  public PurchaseLabelsResult acceptedRate(AcceptedRate acceptedRate) {
    this.acceptedRate = acceptedRate;
    return this;
  }

   /**
   * Get acceptedRate
   * @return acceptedRate
  **/
  @ApiModelProperty(required = true, value = "")
  public AcceptedRate getAcceptedRate() {
    return acceptedRate;
  }

  public void setAcceptedRate(AcceptedRate acceptedRate) {
    this.acceptedRate = acceptedRate;
  }

  public PurchaseLabelsResult labelResults(LabelResultList labelResults) {
    this.labelResults = labelResults;
    return this;
  }

   /**
   * Get labelResults
   * @return labelResults
  **/
  @ApiModelProperty(required = true, value = "")
  public LabelResultList getLabelResults() {
    return labelResults;
  }

  public void setLabelResults(LabelResultList labelResults) {
    this.labelResults = labelResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseLabelsResult purchaseLabelsResult = (PurchaseLabelsResult) o;
    return Objects.equals(this.shipmentId, purchaseLabelsResult.shipmentId) &&
        Objects.equals(this.clientReferenceId, purchaseLabelsResult.clientReferenceId) &&
        Objects.equals(this.acceptedRate, purchaseLabelsResult.acceptedRate) &&
        Objects.equals(this.labelResults, purchaseLabelsResult.labelResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentId, clientReferenceId, acceptedRate, labelResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseLabelsResult {\n");
    
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    clientReferenceId: ").append(toIndentedString(clientReferenceId)).append("\n");
    sb.append("    acceptedRate: ").append(toIndentedString(acceptedRate)).append("\n");
    sb.append("    labelResults: ").append(toIndentedString(labelResults)).append("\n");
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

