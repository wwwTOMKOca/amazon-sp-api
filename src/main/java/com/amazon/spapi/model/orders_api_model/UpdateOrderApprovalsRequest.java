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
import com.amazon.spapi.model.orders_api_model.OrderItemApprovalRequest;
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
 * The request body for the updateOrderItemsApprovals operation.
 */
@ApiModel(description = "The request body for the updateOrderItemsApprovals operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:27:51.478-04:00")
public class UpdateOrderApprovalsRequest {
  @SerializedName("Approver")
  private String approver = null;

  @SerializedName("OrderItemsApprovalRequests")
  private List<OrderItemApprovalRequest> orderItemsApprovalRequests = new ArrayList<OrderItemApprovalRequest>();

  public UpdateOrderApprovalsRequest approver(String approver) {
    this.approver = approver;
    return this;
  }

   /**
   * Person or system that triggers the approval actions on behalf of the actor.
   * @return approver
  **/
  @ApiModelProperty(value = "Person or system that triggers the approval actions on behalf of the actor.")
  public String getApprover() {
    return approver;
  }

  public void setApprover(String approver) {
    this.approver = approver;
  }

  public UpdateOrderApprovalsRequest orderItemsApprovalRequests(List<OrderItemApprovalRequest> orderItemsApprovalRequests) {
    this.orderItemsApprovalRequests = orderItemsApprovalRequests;
    return this;
  }

  public UpdateOrderApprovalsRequest addOrderItemsApprovalRequestsItem(OrderItemApprovalRequest orderItemsApprovalRequestsItem) {
    this.orderItemsApprovalRequests.add(orderItemsApprovalRequestsItem);
    return this;
  }

   /**
   * A list of item approval requests.
   * @return orderItemsApprovalRequests
  **/
  @ApiModelProperty(required = true, value = "A list of item approval requests.")
  public List<OrderItemApprovalRequest> getOrderItemsApprovalRequests() {
    return orderItemsApprovalRequests;
  }

  public void setOrderItemsApprovalRequests(List<OrderItemApprovalRequest> orderItemsApprovalRequests) {
    this.orderItemsApprovalRequests = orderItemsApprovalRequests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrderApprovalsRequest updateOrderApprovalsRequest = (UpdateOrderApprovalsRequest) o;
    return Objects.equals(this.approver, updateOrderApprovalsRequest.approver) &&
        Objects.equals(this.orderItemsApprovalRequests, updateOrderApprovalsRequest.orderItemsApprovalRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approver, orderItemsApprovalRequests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderApprovalsRequest {\n");
    
    sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
    sb.append("    orderItemsApprovalRequests: ").append(toIndentedString(orderItemsApprovalRequests)).append("\n");
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

