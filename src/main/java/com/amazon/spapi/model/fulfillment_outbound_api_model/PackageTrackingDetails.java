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
import com.amazon.spapi.model.fulfillment_outbound_api_model.AdditionalLocationInfo;
import com.amazon.spapi.model.fulfillment_outbound_api_model.CurrentStatus;
import com.amazon.spapi.model.fulfillment_outbound_api_model.TrackingAddress;
import com.amazon.spapi.model.fulfillment_outbound_api_model.TrackingEventList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PackageTrackingDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:53:52.634-04:00")
public class PackageTrackingDetails {
  @SerializedName("packageNumber")
  private Integer packageNumber = null;

  @SerializedName("trackingNumber")
  private String trackingNumber = null;

  @SerializedName("customerTrackingLink")
  private String customerTrackingLink = null;

  @SerializedName("carrierCode")
  private String carrierCode = null;

  @SerializedName("carrierPhoneNumber")
  private String carrierPhoneNumber = null;

  @SerializedName("carrierURL")
  private String carrierURL = null;

  @SerializedName("shipDate")
  private String shipDate = null;

  @SerializedName("estimatedArrivalDate")
  private String estimatedArrivalDate = null;

  @SerializedName("shipToAddress")
  private TrackingAddress shipToAddress = null;

  @SerializedName("currentStatus")
  private CurrentStatus currentStatus = null;

  @SerializedName("currentStatusDescription")
  private String currentStatusDescription = null;

  @SerializedName("signedForBy")
  private String signedForBy = null;

  @SerializedName("additionalLocationInfo")
  private AdditionalLocationInfo additionalLocationInfo = null;

  @SerializedName("trackingEvents")
  private TrackingEventList trackingEvents = null;

  public PackageTrackingDetails packageNumber(Integer packageNumber) {
    this.packageNumber = packageNumber;
    return this;
  }

   /**
   * The package identifier.
   * @return packageNumber
  **/
  @ApiModelProperty(required = true, value = "The package identifier.")
  public Integer getPackageNumber() {
    return packageNumber;
  }

  public void setPackageNumber(Integer packageNumber) {
    this.packageNumber = packageNumber;
  }

  public PackageTrackingDetails trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * The tracking number for the package.
   * @return trackingNumber
  **/
  @ApiModelProperty(value = "The tracking number for the package.")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public PackageTrackingDetails customerTrackingLink(String customerTrackingLink) {
    this.customerTrackingLink = customerTrackingLink;
    return this;
  }

   /**
   * Link on swiship.com that allows customers to track the package.
   * @return customerTrackingLink
  **/
  @ApiModelProperty(value = "Link on swiship.com that allows customers to track the package.")
  public String getCustomerTrackingLink() {
    return customerTrackingLink;
  }

  public void setCustomerTrackingLink(String customerTrackingLink) {
    this.customerTrackingLink = customerTrackingLink;
  }

  public PackageTrackingDetails carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * The name of the carrier.
   * @return carrierCode
  **/
  @ApiModelProperty(value = "The name of the carrier.")
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }

  public PackageTrackingDetails carrierPhoneNumber(String carrierPhoneNumber) {
    this.carrierPhoneNumber = carrierPhoneNumber;
    return this;
  }

   /**
   * The phone number of the carrier.
   * @return carrierPhoneNumber
  **/
  @ApiModelProperty(value = "The phone number of the carrier.")
  public String getCarrierPhoneNumber() {
    return carrierPhoneNumber;
  }

  public void setCarrierPhoneNumber(String carrierPhoneNumber) {
    this.carrierPhoneNumber = carrierPhoneNumber;
  }

  public PackageTrackingDetails carrierURL(String carrierURL) {
    this.carrierURL = carrierURL;
    return this;
  }

   /**
   * The URL of the carrier&#39;s website.
   * @return carrierURL
  **/
  @ApiModelProperty(value = "The URL of the carrier's website.")
  public String getCarrierURL() {
    return carrierURL;
  }

  public void setCarrierURL(String carrierURL) {
    this.carrierURL = carrierURL;
  }

  public PackageTrackingDetails shipDate(String shipDate) {
    this.shipDate = shipDate;
    return this;
  }

   /**
   * The shipping date for the package.
   * @return shipDate
  **/
  @ApiModelProperty(value = "The shipping date for the package.")
  public String getShipDate() {
    return shipDate;
  }

  public void setShipDate(String shipDate) {
    this.shipDate = shipDate;
  }

  public PackageTrackingDetails estimatedArrivalDate(String estimatedArrivalDate) {
    this.estimatedArrivalDate = estimatedArrivalDate;
    return this;
  }

   /**
   * The estimated arrival date.
   * @return estimatedArrivalDate
  **/
  @ApiModelProperty(value = "The estimated arrival date.")
  public String getEstimatedArrivalDate() {
    return estimatedArrivalDate;
  }

  public void setEstimatedArrivalDate(String estimatedArrivalDate) {
    this.estimatedArrivalDate = estimatedArrivalDate;
  }

  public PackageTrackingDetails shipToAddress(TrackingAddress shipToAddress) {
    this.shipToAddress = shipToAddress;
    return this;
  }

   /**
   * The destination city for the package.
   * @return shipToAddress
  **/
  @ApiModelProperty(value = "The destination city for the package.")
  public TrackingAddress getShipToAddress() {
    return shipToAddress;
  }

  public void setShipToAddress(TrackingAddress shipToAddress) {
    this.shipToAddress = shipToAddress;
  }

  public PackageTrackingDetails currentStatus(CurrentStatus currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

   /**
   * Get currentStatus
   * @return currentStatus
  **/
  @ApiModelProperty(value = "")
  public CurrentStatus getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(CurrentStatus currentStatus) {
    this.currentStatus = currentStatus;
  }

  public PackageTrackingDetails currentStatusDescription(String currentStatusDescription) {
    this.currentStatusDescription = currentStatusDescription;
    return this;
  }

   /**
   * Description corresponding to the CurrentStatus value.
   * @return currentStatusDescription
  **/
  @ApiModelProperty(value = "Description corresponding to the CurrentStatus value.")
  public String getCurrentStatusDescription() {
    return currentStatusDescription;
  }

  public void setCurrentStatusDescription(String currentStatusDescription) {
    this.currentStatusDescription = currentStatusDescription;
  }

  public PackageTrackingDetails signedForBy(String signedForBy) {
    this.signedForBy = signedForBy;
    return this;
  }

   /**
   * The name of the person who signed for the package.
   * @return signedForBy
  **/
  @ApiModelProperty(value = "The name of the person who signed for the package.")
  public String getSignedForBy() {
    return signedForBy;
  }

  public void setSignedForBy(String signedForBy) {
    this.signedForBy = signedForBy;
  }

  public PackageTrackingDetails additionalLocationInfo(AdditionalLocationInfo additionalLocationInfo) {
    this.additionalLocationInfo = additionalLocationInfo;
    return this;
  }

   /**
   * Get additionalLocationInfo
   * @return additionalLocationInfo
  **/
  @ApiModelProperty(value = "")
  public AdditionalLocationInfo getAdditionalLocationInfo() {
    return additionalLocationInfo;
  }

  public void setAdditionalLocationInfo(AdditionalLocationInfo additionalLocationInfo) {
    this.additionalLocationInfo = additionalLocationInfo;
  }

  public PackageTrackingDetails trackingEvents(TrackingEventList trackingEvents) {
    this.trackingEvents = trackingEvents;
    return this;
  }

   /**
   * Get trackingEvents
   * @return trackingEvents
  **/
  @ApiModelProperty(value = "")
  public TrackingEventList getTrackingEvents() {
    return trackingEvents;
  }

  public void setTrackingEvents(TrackingEventList trackingEvents) {
    this.trackingEvents = trackingEvents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageTrackingDetails packageTrackingDetails = (PackageTrackingDetails) o;
    return Objects.equals(this.packageNumber, packageTrackingDetails.packageNumber) &&
        Objects.equals(this.trackingNumber, packageTrackingDetails.trackingNumber) &&
        Objects.equals(this.customerTrackingLink, packageTrackingDetails.customerTrackingLink) &&
        Objects.equals(this.carrierCode, packageTrackingDetails.carrierCode) &&
        Objects.equals(this.carrierPhoneNumber, packageTrackingDetails.carrierPhoneNumber) &&
        Objects.equals(this.carrierURL, packageTrackingDetails.carrierURL) &&
        Objects.equals(this.shipDate, packageTrackingDetails.shipDate) &&
        Objects.equals(this.estimatedArrivalDate, packageTrackingDetails.estimatedArrivalDate) &&
        Objects.equals(this.shipToAddress, packageTrackingDetails.shipToAddress) &&
        Objects.equals(this.currentStatus, packageTrackingDetails.currentStatus) &&
        Objects.equals(this.currentStatusDescription, packageTrackingDetails.currentStatusDescription) &&
        Objects.equals(this.signedForBy, packageTrackingDetails.signedForBy) &&
        Objects.equals(this.additionalLocationInfo, packageTrackingDetails.additionalLocationInfo) &&
        Objects.equals(this.trackingEvents, packageTrackingDetails.trackingEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageNumber, trackingNumber, customerTrackingLink, carrierCode, carrierPhoneNumber, carrierURL, shipDate, estimatedArrivalDate, shipToAddress, currentStatus, currentStatusDescription, signedForBy, additionalLocationInfo, trackingEvents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageTrackingDetails {\n");
    
    sb.append("    packageNumber: ").append(toIndentedString(packageNumber)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    customerTrackingLink: ").append(toIndentedString(customerTrackingLink)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    carrierPhoneNumber: ").append(toIndentedString(carrierPhoneNumber)).append("\n");
    sb.append("    carrierURL: ").append(toIndentedString(carrierURL)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    estimatedArrivalDate: ").append(toIndentedString(estimatedArrivalDate)).append("\n");
    sb.append("    shipToAddress: ").append(toIndentedString(shipToAddress)).append("\n");
    sb.append("    currentStatus: ").append(toIndentedString(currentStatus)).append("\n");
    sb.append("    currentStatusDescription: ").append(toIndentedString(currentStatusDescription)).append("\n");
    sb.append("    signedForBy: ").append(toIndentedString(signedForBy)).append("\n");
    sb.append("    additionalLocationInfo: ").append(toIndentedString(additionalLocationInfo)).append("\n");
    sb.append("    trackingEvents: ").append(toIndentedString(trackingEvents)).append("\n");
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

