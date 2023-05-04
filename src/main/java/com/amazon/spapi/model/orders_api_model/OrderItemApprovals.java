/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.orders_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.orders_api_model.ItemApproval;
import com.amazon.spapi.model.orders_api_model.ItemApprovalStatus;
import com.amazon.spapi.model.orders_api_model.ItemApprovalType;
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
 * List of item approvals gathered during the approval process.
 */
@ApiModel(description = "List of item approvals gathered during the approval process.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:54:01.520-04:00")
public class OrderItemApprovals {
  @SerializedName("OrderItemId")
  private String orderItemId = null;

  @SerializedName("ApprovalType")
  private ItemApprovalType approvalType = null;

  @SerializedName("ApprovalStatus")
  private ItemApprovalStatus approvalStatus = null;

  @SerializedName("ItemApprovals")
  private List<ItemApproval> itemApprovals = new ArrayList<ItemApproval>();

  public OrderItemApprovals orderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

   /**
   * The unique identifier of the order item.
   * @return orderItemId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the order item.")
  public String getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }

  public OrderItemApprovals approvalType(ItemApprovalType approvalType) {
    this.approvalType = approvalType;
    return this;
  }

   /**
   * The approval process type required for the order item.
   * @return approvalType
  **/
  @ApiModelProperty(required = true, value = "The approval process type required for the order item.")
  public ItemApprovalType getApprovalType() {
    return approvalType;
  }

  public void setApprovalType(ItemApprovalType approvalType) {
    this.approvalType = approvalType;
  }

  public OrderItemApprovals approvalStatus(ItemApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Current status of the order item approval.
   * @return approvalStatus
  **/
  @ApiModelProperty(required = true, value = "Current status of the order item approval.")
  public ItemApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(ItemApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public OrderItemApprovals itemApprovals(List<ItemApproval> itemApprovals) {
    this.itemApprovals = itemApprovals;
    return this;
  }

  public OrderItemApprovals addItemApprovalsItem(ItemApproval itemApprovalsItem) {
    this.itemApprovals.add(itemApprovalsItem);
    return this;
  }

   /**
   * Get itemApprovals
   * @return itemApprovals
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ItemApproval> getItemApprovals() {
    return itemApprovals;
  }

  public void setItemApprovals(List<ItemApproval> itemApprovals) {
    this.itemApprovals = itemApprovals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemApprovals orderItemApprovals = (OrderItemApprovals) o;
    return Objects.equals(this.orderItemId, orderItemApprovals.orderItemId) &&
        Objects.equals(this.approvalType, orderItemApprovals.approvalType) &&
        Objects.equals(this.approvalStatus, orderItemApprovals.approvalStatus) &&
        Objects.equals(this.itemApprovals, orderItemApprovals.itemApprovals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItemId, approvalType, approvalStatus, itemApprovals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemApprovals {\n");
    
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    approvalType: ").append(toIndentedString(approvalType)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    itemApprovals: ").append(toIndentedString(itemApprovals)).append("\n");
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

