/*
 * Selling Partner API for FBA Inbound Eligibilty
 * With the FBA Inbound Eligibility API, you can build applications that let sellers get eligibility previews for items before shipping them to Amazon's fulfillment centers. With this API you can find out if an item is eligible for inbound shipment to Amazon's fulfillment centers in a specific marketplace. You can also find out if an item is eligible for using the manufacturer barcode for FBA inventory tracking. Sellers can use this information to inform their decisions about which items to ship Amazon's fulfillment centers.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fba_inbound_eligibility_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.fba_inbound_eligibility_api_model.Error;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

/**
 * A list of error responses returned when a request is unsuccessful.
 */
@ApiModel(description = "A list of error responses returned when a request is unsuccessful.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:29.838-04:00")
public class ErrorList extends ArrayList<Error> {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

