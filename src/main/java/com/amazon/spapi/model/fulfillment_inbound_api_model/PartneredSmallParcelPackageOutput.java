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
import com.amazon.spapi.model.fulfillment_inbound_api_model.Dimensions;
import com.amazon.spapi.model.fulfillment_inbound_api_model.PackageStatus;
import com.amazon.spapi.model.fulfillment_inbound_api_model.Weight;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Dimension, weight, and shipping information for the package.
 */
@ApiModel(description = "Dimension, weight, and shipping information for the package.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:31.213-04:00")
public class PartneredSmallParcelPackageOutput {
  @SerializedName("Dimensions")
  private Dimensions dimensions = null;

  @SerializedName("Weight")
  private Weight weight = null;

  @SerializedName("CarrierName")
  private String carrierName = null;

  @SerializedName("TrackingId")
  private String trackingId = null;

  @SerializedName("PackageStatus")
  private PackageStatus packageStatus = null;

  public PartneredSmallParcelPackageOutput dimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @ApiModelProperty(required = true, value = "")
  public Dimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
  }

  public PartneredSmallParcelPackageOutput weight(Weight weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "")
  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }

  public PartneredSmallParcelPackageOutput carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

   /**
   * The carrier specified with a previous call to putTransportDetails.
   * @return carrierName
  **/
  @ApiModelProperty(required = true, value = "The carrier specified with a previous call to putTransportDetails.")
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  public PartneredSmallParcelPackageOutput trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Get trackingId
   * @return trackingId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }

  public PartneredSmallParcelPackageOutput packageStatus(PackageStatus packageStatus) {
    this.packageStatus = packageStatus;
    return this;
  }

   /**
   * Get packageStatus
   * @return packageStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public PackageStatus getPackageStatus() {
    return packageStatus;
  }

  public void setPackageStatus(PackageStatus packageStatus) {
    this.packageStatus = packageStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartneredSmallParcelPackageOutput partneredSmallParcelPackageOutput = (PartneredSmallParcelPackageOutput) o;
    return Objects.equals(this.dimensions, partneredSmallParcelPackageOutput.dimensions) &&
        Objects.equals(this.weight, partneredSmallParcelPackageOutput.weight) &&
        Objects.equals(this.carrierName, partneredSmallParcelPackageOutput.carrierName) &&
        Objects.equals(this.trackingId, partneredSmallParcelPackageOutput.trackingId) &&
        Objects.equals(this.packageStatus, partneredSmallParcelPackageOutput.packageStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, weight, carrierName, trackingId, packageStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartneredSmallParcelPackageOutput {\n");
    
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    packageStatus: ").append(toIndentedString(packageStatus)).append("\n");
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
