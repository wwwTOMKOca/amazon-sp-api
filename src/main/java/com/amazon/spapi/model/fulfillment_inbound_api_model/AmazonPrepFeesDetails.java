/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillment_inbound_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.fulfillment_inbound_api_model.Amount;
import com.amazon.spapi.model.fulfillment_inbound_api_model.PrepInstruction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The fees for Amazon to prep goods for shipment.
 */
@ApiModel(description = "The fees for Amazon to prep goods for shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:31.213-04:00")
public class AmazonPrepFeesDetails {
  @SerializedName("PrepInstruction")
  private PrepInstruction prepInstruction = null;

  @SerializedName("FeePerUnit")
  private Amount feePerUnit = null;

  public AmazonPrepFeesDetails prepInstruction(PrepInstruction prepInstruction) {
    this.prepInstruction = prepInstruction;
    return this;
  }

   /**
   * Get prepInstruction
   * @return prepInstruction
  **/
  @ApiModelProperty(value = "")
  public PrepInstruction getPrepInstruction() {
    return prepInstruction;
  }

  public void setPrepInstruction(PrepInstruction prepInstruction) {
    this.prepInstruction = prepInstruction;
  }

  public AmazonPrepFeesDetails feePerUnit(Amount feePerUnit) {
    this.feePerUnit = feePerUnit;
    return this;
  }

   /**
   * The fee for Amazon to prepare 1 unit.
   * @return feePerUnit
  **/
  @ApiModelProperty(value = "The fee for Amazon to prepare 1 unit.")
  public Amount getFeePerUnit() {
    return feePerUnit;
  }

  public void setFeePerUnit(Amount feePerUnit) {
    this.feePerUnit = feePerUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmazonPrepFeesDetails amazonPrepFeesDetails = (AmazonPrepFeesDetails) o;
    return Objects.equals(this.prepInstruction, amazonPrepFeesDetails.prepInstruction) &&
        Objects.equals(this.feePerUnit, amazonPrepFeesDetails.feePerUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prepInstruction, feePerUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmazonPrepFeesDetails {\n");
    
    sb.append("    prepInstruction: ").append(toIndentedString(prepInstruction)).append("\n");
    sb.append("    feePerUnit: ").append(toIndentedString(feePerUnit)).append("\n");
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

