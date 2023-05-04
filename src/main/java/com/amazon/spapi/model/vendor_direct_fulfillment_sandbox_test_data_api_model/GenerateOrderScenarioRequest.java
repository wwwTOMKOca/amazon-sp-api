/*
 * Selling Partner API for Vendor Direct Fulfillment Sandbox Test Data
 * The Selling Partner API for Vendor Direct Fulfillment Sandbox Test Data provides programmatic access to vendor direct fulfillment sandbox test data.
 *
 * OpenAPI spec version: 2021-10-28
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_direct_fulfillment_sandbox_test_data_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_direct_fulfillment_sandbox_test_data_api_model.OrderScenarioRequest;
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
 * The request body for the generateOrderScenarios operation.
 */
@ApiModel(description = "The request body for the generateOrderScenarios operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:54:11.316-04:00")
public class GenerateOrderScenarioRequest {
  @SerializedName("orders")
  private List<OrderScenarioRequest> orders = null;

  public GenerateOrderScenarioRequest orders(List<OrderScenarioRequest> orders) {
    this.orders = orders;
    return this;
  }

  public GenerateOrderScenarioRequest addOrdersItem(OrderScenarioRequest ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<OrderScenarioRequest>();
    }
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * The list of test orders requested as indicated by party identifiers.
   * @return orders
  **/
  @ApiModelProperty(value = "The list of test orders requested as indicated by party identifiers.")
  public List<OrderScenarioRequest> getOrders() {
    return orders;
  }

  public void setOrders(List<OrderScenarioRequest> orders) {
    this.orders = orders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateOrderScenarioRequest generateOrderScenarioRequest = (GenerateOrderScenarioRequest) o;
    return Objects.equals(this.orders, generateOrderScenarioRequest.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateOrderScenarioRequest {\n");
    
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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

