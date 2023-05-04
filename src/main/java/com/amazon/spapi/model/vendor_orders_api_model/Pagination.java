/*
 * Selling Partner API for Retail Procurement Orders
 * The Selling Partner API for Retail Procurement Orders provides programmatic access to vendor orders data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_orders_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Pagination
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:53:53.803-04:00")
public class Pagination {
  @SerializedName("nextToken")
  private String nextToken = null;

  public Pagination nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * A generated string used to pass information to your next request. If NextToken is returned, pass the value of NextToken to the next request. If NextToken is not returned, there are no more purchase order items to return.
   * @return nextToken
  **/
  @ApiModelProperty(value = "A generated string used to pass information to your next request. If NextToken is returned, pass the value of NextToken to the next request. If NextToken is not returned, there are no more purchase order items to return.")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.nextToken, pagination.nextToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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

