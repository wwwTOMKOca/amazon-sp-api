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
import com.amazon.spapi.model.fulfillment_outbound_api_model.InvalidReturnItemList;
import com.amazon.spapi.model.fulfillment_outbound_api_model.ReturnAuthorizationList;
import com.amazon.spapi.model.fulfillment_outbound_api_model.ReturnItemList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateFulfillmentReturnResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:53:52.634-04:00")
public class CreateFulfillmentReturnResult {
  @SerializedName("returnItems")
  private ReturnItemList returnItems = null;

  @SerializedName("invalidReturnItems")
  private InvalidReturnItemList invalidReturnItems = null;

  @SerializedName("returnAuthorizations")
  private ReturnAuthorizationList returnAuthorizations = null;

  public CreateFulfillmentReturnResult returnItems(ReturnItemList returnItems) {
    this.returnItems = returnItems;
    return this;
  }

   /**
   * Get returnItems
   * @return returnItems
  **/
  @ApiModelProperty(value = "")
  public ReturnItemList getReturnItems() {
    return returnItems;
  }

  public void setReturnItems(ReturnItemList returnItems) {
    this.returnItems = returnItems;
  }

  public CreateFulfillmentReturnResult invalidReturnItems(InvalidReturnItemList invalidReturnItems) {
    this.invalidReturnItems = invalidReturnItems;
    return this;
  }

   /**
   * Get invalidReturnItems
   * @return invalidReturnItems
  **/
  @ApiModelProperty(value = "")
  public InvalidReturnItemList getInvalidReturnItems() {
    return invalidReturnItems;
  }

  public void setInvalidReturnItems(InvalidReturnItemList invalidReturnItems) {
    this.invalidReturnItems = invalidReturnItems;
  }

  public CreateFulfillmentReturnResult returnAuthorizations(ReturnAuthorizationList returnAuthorizations) {
    this.returnAuthorizations = returnAuthorizations;
    return this;
  }

   /**
   * Get returnAuthorizations
   * @return returnAuthorizations
  **/
  @ApiModelProperty(value = "")
  public ReturnAuthorizationList getReturnAuthorizations() {
    return returnAuthorizations;
  }

  public void setReturnAuthorizations(ReturnAuthorizationList returnAuthorizations) {
    this.returnAuthorizations = returnAuthorizations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFulfillmentReturnResult createFulfillmentReturnResult = (CreateFulfillmentReturnResult) o;
    return Objects.equals(this.returnItems, createFulfillmentReturnResult.returnItems) &&
        Objects.equals(this.invalidReturnItems, createFulfillmentReturnResult.invalidReturnItems) &&
        Objects.equals(this.returnAuthorizations, createFulfillmentReturnResult.returnAuthorizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnItems, invalidReturnItems, returnAuthorizations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFulfillmentReturnResult {\n");
    
    sb.append("    returnItems: ").append(toIndentedString(returnItems)).append("\n");
    sb.append("    invalidReturnItems: ").append(toIndentedString(invalidReturnItems)).append("\n");
    sb.append("    returnAuthorizations: ").append(toIndentedString(returnAuthorizations)).append("\n");
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

