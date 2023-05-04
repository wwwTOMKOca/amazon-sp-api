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
import com.amazon.spapi.model.fulfillment_outbound_api_model.Address;
import com.amazon.spapi.model.fulfillment_outbound_api_model.CODSettings;
import com.amazon.spapi.model.fulfillment_outbound_api_model.DeliveryWindow;
import com.amazon.spapi.model.fulfillment_outbound_api_model.FeatureSettings;
import com.amazon.spapi.model.fulfillment_outbound_api_model.FulfillmentAction;
import com.amazon.spapi.model.fulfillment_outbound_api_model.FulfillmentOrderStatus;
import com.amazon.spapi.model.fulfillment_outbound_api_model.FulfillmentPolicy;
import com.amazon.spapi.model.fulfillment_outbound_api_model.NotificationEmailList;
import com.amazon.spapi.model.fulfillment_outbound_api_model.ShippingSpeedCategory;
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
 * General information about a fulfillment order, including its status.
 */
@ApiModel(description = "General information about a fulfillment order, including its status.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:53:52.634-04:00")
public class FulfillmentOrder {
  @SerializedName("sellerFulfillmentOrderId")
  private String sellerFulfillmentOrderId = null;

  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("displayableOrderId")
  private String displayableOrderId = null;

  @SerializedName("displayableOrderDate")
  private String displayableOrderDate = null;

  @SerializedName("displayableOrderComment")
  private String displayableOrderComment = null;

  @SerializedName("shippingSpeedCategory")
  private ShippingSpeedCategory shippingSpeedCategory = null;

  @SerializedName("deliveryWindow")
  private DeliveryWindow deliveryWindow = null;

  @SerializedName("destinationAddress")
  private Address destinationAddress = null;

  @SerializedName("fulfillmentAction")
  private FulfillmentAction fulfillmentAction = null;

  @SerializedName("fulfillmentPolicy")
  private FulfillmentPolicy fulfillmentPolicy = null;

  @SerializedName("codSettings")
  private CODSettings codSettings = null;

  @SerializedName("receivedDate")
  private String receivedDate = null;

  @SerializedName("fulfillmentOrderStatus")
  private FulfillmentOrderStatus fulfillmentOrderStatus = null;

  @SerializedName("statusUpdatedDate")
  private String statusUpdatedDate = null;

  @SerializedName("notificationEmails")
  private NotificationEmailList notificationEmails = null;

  @SerializedName("featureConstraints")
  private List<FeatureSettings> featureConstraints = null;

  public FulfillmentOrder sellerFulfillmentOrderId(String sellerFulfillmentOrderId) {
    this.sellerFulfillmentOrderId = sellerFulfillmentOrderId;
    return this;
  }

   /**
   * The fulfillment order identifier submitted with the createFulfillmentOrder operation.
   * @return sellerFulfillmentOrderId
  **/
  @ApiModelProperty(required = true, value = "The fulfillment order identifier submitted with the createFulfillmentOrder operation.")
  public String getSellerFulfillmentOrderId() {
    return sellerFulfillmentOrderId;
  }

  public void setSellerFulfillmentOrderId(String sellerFulfillmentOrderId) {
    this.sellerFulfillmentOrderId = sellerFulfillmentOrderId;
  }

  public FulfillmentOrder marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * The identifier for the marketplace the fulfillment order is placed against.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "The identifier for the marketplace the fulfillment order is placed against.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public FulfillmentOrder displayableOrderId(String displayableOrderId) {
    this.displayableOrderId = displayableOrderId;
    return this;
  }

   /**
   * A fulfillment order identifier submitted with the createFulfillmentOrder operation. Displays as the order identifier in recipient-facing materials such as the packing slip.
   * @return displayableOrderId
  **/
  @ApiModelProperty(required = true, value = "A fulfillment order identifier submitted with the createFulfillmentOrder operation. Displays as the order identifier in recipient-facing materials such as the packing slip.")
  public String getDisplayableOrderId() {
    return displayableOrderId;
  }

  public void setDisplayableOrderId(String displayableOrderId) {
    this.displayableOrderId = displayableOrderId;
  }

  public FulfillmentOrder displayableOrderDate(String displayableOrderDate) {
    this.displayableOrderDate = displayableOrderDate;
    return this;
  }

   /**
   * A date and time submitted with the createFulfillmentOrder operation. Displays as the order date in recipient-facing materials such as the packing slip.
   * @return displayableOrderDate
  **/
  @ApiModelProperty(required = true, value = "A date and time submitted with the createFulfillmentOrder operation. Displays as the order date in recipient-facing materials such as the packing slip.")
  public String getDisplayableOrderDate() {
    return displayableOrderDate;
  }

  public void setDisplayableOrderDate(String displayableOrderDate) {
    this.displayableOrderDate = displayableOrderDate;
  }

  public FulfillmentOrder displayableOrderComment(String displayableOrderComment) {
    this.displayableOrderComment = displayableOrderComment;
    return this;
  }

   /**
   * A text block submitted with the createFulfillmentOrder operation. Displays in recipient-facing materials such as the packing slip.
   * @return displayableOrderComment
  **/
  @ApiModelProperty(required = true, value = "A text block submitted with the createFulfillmentOrder operation. Displays in recipient-facing materials such as the packing slip.")
  public String getDisplayableOrderComment() {
    return displayableOrderComment;
  }

  public void setDisplayableOrderComment(String displayableOrderComment) {
    this.displayableOrderComment = displayableOrderComment;
  }

  public FulfillmentOrder shippingSpeedCategory(ShippingSpeedCategory shippingSpeedCategory) {
    this.shippingSpeedCategory = shippingSpeedCategory;
    return this;
  }

   /**
   * Get shippingSpeedCategory
   * @return shippingSpeedCategory
  **/
  @ApiModelProperty(required = true, value = "")
  public ShippingSpeedCategory getShippingSpeedCategory() {
    return shippingSpeedCategory;
  }

  public void setShippingSpeedCategory(ShippingSpeedCategory shippingSpeedCategory) {
    this.shippingSpeedCategory = shippingSpeedCategory;
  }

  public FulfillmentOrder deliveryWindow(DeliveryWindow deliveryWindow) {
    this.deliveryWindow = deliveryWindow;
    return this;
  }

   /**
   * Get deliveryWindow
   * @return deliveryWindow
  **/
  @ApiModelProperty(value = "")
  public DeliveryWindow getDeliveryWindow() {
    return deliveryWindow;
  }

  public void setDeliveryWindow(DeliveryWindow deliveryWindow) {
    this.deliveryWindow = deliveryWindow;
  }

  public FulfillmentOrder destinationAddress(Address destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

   /**
   * The destination address submitted with the createFulfillmentOrder operation.
   * @return destinationAddress
  **/
  @ApiModelProperty(required = true, value = "The destination address submitted with the createFulfillmentOrder operation.")
  public Address getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(Address destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public FulfillmentOrder fulfillmentAction(FulfillmentAction fulfillmentAction) {
    this.fulfillmentAction = fulfillmentAction;
    return this;
  }

   /**
   * Get fulfillmentAction
   * @return fulfillmentAction
  **/
  @ApiModelProperty(value = "")
  public FulfillmentAction getFulfillmentAction() {
    return fulfillmentAction;
  }

  public void setFulfillmentAction(FulfillmentAction fulfillmentAction) {
    this.fulfillmentAction = fulfillmentAction;
  }

  public FulfillmentOrder fulfillmentPolicy(FulfillmentPolicy fulfillmentPolicy) {
    this.fulfillmentPolicy = fulfillmentPolicy;
    return this;
  }

   /**
   * Get fulfillmentPolicy
   * @return fulfillmentPolicy
  **/
  @ApiModelProperty(value = "")
  public FulfillmentPolicy getFulfillmentPolicy() {
    return fulfillmentPolicy;
  }

  public void setFulfillmentPolicy(FulfillmentPolicy fulfillmentPolicy) {
    this.fulfillmentPolicy = fulfillmentPolicy;
  }

  public FulfillmentOrder codSettings(CODSettings codSettings) {
    this.codSettings = codSettings;
    return this;
  }

   /**
   * Get codSettings
   * @return codSettings
  **/
  @ApiModelProperty(value = "")
  public CODSettings getCodSettings() {
    return codSettings;
  }

  public void setCodSettings(CODSettings codSettings) {
    this.codSettings = codSettings;
  }

  public FulfillmentOrder receivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
    return this;
  }

   /**
   * The date and time that the fulfillment order was received by an Amazon fulfillment center.
   * @return receivedDate
  **/
  @ApiModelProperty(required = true, value = "The date and time that the fulfillment order was received by an Amazon fulfillment center.")
  public String getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
  }

  public FulfillmentOrder fulfillmentOrderStatus(FulfillmentOrderStatus fulfillmentOrderStatus) {
    this.fulfillmentOrderStatus = fulfillmentOrderStatus;
    return this;
  }

   /**
   * Get fulfillmentOrderStatus
   * @return fulfillmentOrderStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public FulfillmentOrderStatus getFulfillmentOrderStatus() {
    return fulfillmentOrderStatus;
  }

  public void setFulfillmentOrderStatus(FulfillmentOrderStatus fulfillmentOrderStatus) {
    this.fulfillmentOrderStatus = fulfillmentOrderStatus;
  }

  public FulfillmentOrder statusUpdatedDate(String statusUpdatedDate) {
    this.statusUpdatedDate = statusUpdatedDate;
    return this;
  }

   /**
   * The date and time that the status of the fulfillment order last changed, in ISO 8601 date time format.
   * @return statusUpdatedDate
  **/
  @ApiModelProperty(required = true, value = "The date and time that the status of the fulfillment order last changed, in ISO 8601 date time format.")
  public String getStatusUpdatedDate() {
    return statusUpdatedDate;
  }

  public void setStatusUpdatedDate(String statusUpdatedDate) {
    this.statusUpdatedDate = statusUpdatedDate;
  }

  public FulfillmentOrder notificationEmails(NotificationEmailList notificationEmails) {
    this.notificationEmails = notificationEmails;
    return this;
  }

   /**
   * Get notificationEmails
   * @return notificationEmails
  **/
  @ApiModelProperty(value = "")
  public NotificationEmailList getNotificationEmails() {
    return notificationEmails;
  }

  public void setNotificationEmails(NotificationEmailList notificationEmails) {
    this.notificationEmails = notificationEmails;
  }

  public FulfillmentOrder featureConstraints(List<FeatureSettings> featureConstraints) {
    this.featureConstraints = featureConstraints;
    return this;
  }

  public FulfillmentOrder addFeatureConstraintsItem(FeatureSettings featureConstraintsItem) {
    if (this.featureConstraints == null) {
      this.featureConstraints = new ArrayList<FeatureSettings>();
    }
    this.featureConstraints.add(featureConstraintsItem);
    return this;
  }

   /**
   * A list of features and their fulfillment policies to apply to the order.
   * @return featureConstraints
  **/
  @ApiModelProperty(value = "A list of features and their fulfillment policies to apply to the order.")
  public List<FeatureSettings> getFeatureConstraints() {
    return featureConstraints;
  }

  public void setFeatureConstraints(List<FeatureSettings> featureConstraints) {
    this.featureConstraints = featureConstraints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentOrder fulfillmentOrder = (FulfillmentOrder) o;
    return Objects.equals(this.sellerFulfillmentOrderId, fulfillmentOrder.sellerFulfillmentOrderId) &&
        Objects.equals(this.marketplaceId, fulfillmentOrder.marketplaceId) &&
        Objects.equals(this.displayableOrderId, fulfillmentOrder.displayableOrderId) &&
        Objects.equals(this.displayableOrderDate, fulfillmentOrder.displayableOrderDate) &&
        Objects.equals(this.displayableOrderComment, fulfillmentOrder.displayableOrderComment) &&
        Objects.equals(this.shippingSpeedCategory, fulfillmentOrder.shippingSpeedCategory) &&
        Objects.equals(this.deliveryWindow, fulfillmentOrder.deliveryWindow) &&
        Objects.equals(this.destinationAddress, fulfillmentOrder.destinationAddress) &&
        Objects.equals(this.fulfillmentAction, fulfillmentOrder.fulfillmentAction) &&
        Objects.equals(this.fulfillmentPolicy, fulfillmentOrder.fulfillmentPolicy) &&
        Objects.equals(this.codSettings, fulfillmentOrder.codSettings) &&
        Objects.equals(this.receivedDate, fulfillmentOrder.receivedDate) &&
        Objects.equals(this.fulfillmentOrderStatus, fulfillmentOrder.fulfillmentOrderStatus) &&
        Objects.equals(this.statusUpdatedDate, fulfillmentOrder.statusUpdatedDate) &&
        Objects.equals(this.notificationEmails, fulfillmentOrder.notificationEmails) &&
        Objects.equals(this.featureConstraints, fulfillmentOrder.featureConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerFulfillmentOrderId, marketplaceId, displayableOrderId, displayableOrderDate, displayableOrderComment, shippingSpeedCategory, deliveryWindow, destinationAddress, fulfillmentAction, fulfillmentPolicy, codSettings, receivedDate, fulfillmentOrderStatus, statusUpdatedDate, notificationEmails, featureConstraints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentOrder {\n");
    
    sb.append("    sellerFulfillmentOrderId: ").append(toIndentedString(sellerFulfillmentOrderId)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    displayableOrderId: ").append(toIndentedString(displayableOrderId)).append("\n");
    sb.append("    displayableOrderDate: ").append(toIndentedString(displayableOrderDate)).append("\n");
    sb.append("    displayableOrderComment: ").append(toIndentedString(displayableOrderComment)).append("\n");
    sb.append("    shippingSpeedCategory: ").append(toIndentedString(shippingSpeedCategory)).append("\n");
    sb.append("    deliveryWindow: ").append(toIndentedString(deliveryWindow)).append("\n");
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
    sb.append("    fulfillmentAction: ").append(toIndentedString(fulfillmentAction)).append("\n");
    sb.append("    fulfillmentPolicy: ").append(toIndentedString(fulfillmentPolicy)).append("\n");
    sb.append("    codSettings: ").append(toIndentedString(codSettings)).append("\n");
    sb.append("    receivedDate: ").append(toIndentedString(receivedDate)).append("\n");
    sb.append("    fulfillmentOrderStatus: ").append(toIndentedString(fulfillmentOrderStatus)).append("\n");
    sb.append("    statusUpdatedDate: ").append(toIndentedString(statusUpdatedDate)).append("\n");
    sb.append("    notificationEmails: ").append(toIndentedString(notificationEmails)).append("\n");
    sb.append("    featureConstraints: ").append(toIndentedString(featureConstraints)).append("\n");
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

