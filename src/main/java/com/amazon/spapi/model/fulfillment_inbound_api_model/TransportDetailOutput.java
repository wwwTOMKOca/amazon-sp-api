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
import com.amazon.spapi.model.fulfillment_inbound_api_model.NonPartneredLtlDataOutput;
import com.amazon.spapi.model.fulfillment_inbound_api_model.NonPartneredSmallParcelDataOutput;
import com.amazon.spapi.model.fulfillment_inbound_api_model.PartneredLtlDataOutput;
import com.amazon.spapi.model.fulfillment_inbound_api_model.PartneredSmallParcelDataOutput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Inbound shipment information, including carrier details and shipment status.
 */
@ApiModel(description = "Inbound shipment information, including carrier details and shipment status.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:53:54.337-04:00")
public class TransportDetailOutput {
  @SerializedName("PartneredSmallParcelData")
  private PartneredSmallParcelDataOutput partneredSmallParcelData = null;

  @SerializedName("NonPartneredSmallParcelData")
  private NonPartneredSmallParcelDataOutput nonPartneredSmallParcelData = null;

  @SerializedName("PartneredLtlData")
  private PartneredLtlDataOutput partneredLtlData = null;

  @SerializedName("NonPartneredLtlData")
  private NonPartneredLtlDataOutput nonPartneredLtlData = null;

  public TransportDetailOutput partneredSmallParcelData(PartneredSmallParcelDataOutput partneredSmallParcelData) {
    this.partneredSmallParcelData = partneredSmallParcelData;
    return this;
  }

   /**
   * Get partneredSmallParcelData
   * @return partneredSmallParcelData
  **/
  @ApiModelProperty(value = "")
  public PartneredSmallParcelDataOutput getPartneredSmallParcelData() {
    return partneredSmallParcelData;
  }

  public void setPartneredSmallParcelData(PartneredSmallParcelDataOutput partneredSmallParcelData) {
    this.partneredSmallParcelData = partneredSmallParcelData;
  }

  public TransportDetailOutput nonPartneredSmallParcelData(NonPartneredSmallParcelDataOutput nonPartneredSmallParcelData) {
    this.nonPartneredSmallParcelData = nonPartneredSmallParcelData;
    return this;
  }

   /**
   * Get nonPartneredSmallParcelData
   * @return nonPartneredSmallParcelData
  **/
  @ApiModelProperty(value = "")
  public NonPartneredSmallParcelDataOutput getNonPartneredSmallParcelData() {
    return nonPartneredSmallParcelData;
  }

  public void setNonPartneredSmallParcelData(NonPartneredSmallParcelDataOutput nonPartneredSmallParcelData) {
    this.nonPartneredSmallParcelData = nonPartneredSmallParcelData;
  }

  public TransportDetailOutput partneredLtlData(PartneredLtlDataOutput partneredLtlData) {
    this.partneredLtlData = partneredLtlData;
    return this;
  }

   /**
   * Get partneredLtlData
   * @return partneredLtlData
  **/
  @ApiModelProperty(value = "")
  public PartneredLtlDataOutput getPartneredLtlData() {
    return partneredLtlData;
  }

  public void setPartneredLtlData(PartneredLtlDataOutput partneredLtlData) {
    this.partneredLtlData = partneredLtlData;
  }

  public TransportDetailOutput nonPartneredLtlData(NonPartneredLtlDataOutput nonPartneredLtlData) {
    this.nonPartneredLtlData = nonPartneredLtlData;
    return this;
  }

   /**
   * Get nonPartneredLtlData
   * @return nonPartneredLtlData
  **/
  @ApiModelProperty(value = "")
  public NonPartneredLtlDataOutput getNonPartneredLtlData() {
    return nonPartneredLtlData;
  }

  public void setNonPartneredLtlData(NonPartneredLtlDataOutput nonPartneredLtlData) {
    this.nonPartneredLtlData = nonPartneredLtlData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportDetailOutput transportDetailOutput = (TransportDetailOutput) o;
    return Objects.equals(this.partneredSmallParcelData, transportDetailOutput.partneredSmallParcelData) &&
        Objects.equals(this.nonPartneredSmallParcelData, transportDetailOutput.nonPartneredSmallParcelData) &&
        Objects.equals(this.partneredLtlData, transportDetailOutput.partneredLtlData) &&
        Objects.equals(this.nonPartneredLtlData, transportDetailOutput.nonPartneredLtlData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partneredSmallParcelData, nonPartneredSmallParcelData, partneredLtlData, nonPartneredLtlData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportDetailOutput {\n");
    
    sb.append("    partneredSmallParcelData: ").append(toIndentedString(partneredSmallParcelData)).append("\n");
    sb.append("    nonPartneredSmallParcelData: ").append(toIndentedString(nonPartneredSmallParcelData)).append("\n");
    sb.append("    partneredLtlData: ").append(toIndentedString(partneredLtlData)).append("\n");
    sb.append("    nonPartneredLtlData: ").append(toIndentedString(nonPartneredLtlData)).append("\n");
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

