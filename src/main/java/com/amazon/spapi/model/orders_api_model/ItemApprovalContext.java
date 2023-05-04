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
import com.amazon.spapi.model.orders_api_model.ApprovalSupportDataElementList;
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

/**
 * Generic item approval context. Check the applicable restrictions at the specific approval type schemas.
 */
@ApiModel(description = "Generic item approval context. Check the applicable restrictions at the specific approval type schemas.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:27:51.478-04:00")
public class ItemApprovalContext {
  @SerializedName("ApprovalType")
  private ItemApprovalType approvalType = null;

  @SerializedName("ApprovalStatus")
  private ItemApprovalStatus approvalStatus = null;

  @SerializedName("ApprovalSupportData")
  private ApprovalSupportDataElementList approvalSupportData = null;

  public ItemApprovalContext approvalType(ItemApprovalType approvalType) {
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

  public ItemApprovalContext approvalStatus(ItemApprovalStatus approvalStatus) {
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

  public ItemApprovalContext approvalSupportData(ApprovalSupportDataElementList approvalSupportData) {
    this.approvalSupportData = approvalSupportData;
    return this;
  }

   /**
   * List of additional data elements supporting the approval process. Check the applicable restrictions at the specific approval type schemas.
   * @return approvalSupportData
  **/
  @ApiModelProperty(value = "List of additional data elements supporting the approval process. Check the applicable restrictions at the specific approval type schemas.")
  public ApprovalSupportDataElementList getApprovalSupportData() {
    return approvalSupportData;
  }

  public void setApprovalSupportData(ApprovalSupportDataElementList approvalSupportData) {
    this.approvalSupportData = approvalSupportData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemApprovalContext itemApprovalContext = (ItemApprovalContext) o;
    return Objects.equals(this.approvalType, itemApprovalContext.approvalType) &&
        Objects.equals(this.approvalStatus, itemApprovalContext.approvalStatus) &&
        Objects.equals(this.approvalSupportData, itemApprovalContext.approvalSupportData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalType, approvalStatus, approvalSupportData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemApprovalContext {\n");
    
    sb.append("    approvalType: ").append(toIndentedString(approvalType)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    approvalSupportData: ").append(toIndentedString(approvalSupportData)).append("\n");
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

