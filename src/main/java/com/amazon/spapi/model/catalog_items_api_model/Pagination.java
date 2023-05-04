/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, refer to the [Catalog Items API Use Case Guide](doc:catalog-items-api-v2022-04-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-04-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.catalog_items_api_model;

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
 * When a request produces a response that exceeds the &#x60;pageSize&#x60;, pagination occurs. This means the response is divided into individual pages. To retrieve the next page or the previous page, you must pass the &#x60;nextToken&#x60; value or the &#x60;previousToken&#x60; value as the &#x60;pageToken&#x60; parameter in the next request. When you receive the last page, there will be no &#x60;nextToken&#x60; key in the pagination object.
 */
@ApiModel(description = "When a request produces a response that exceeds the `pageSize`, pagination occurs. This means the response is divided into individual pages. To retrieve the next page or the previous page, you must pass the `nextToken` value or the `previousToken` value as the `pageToken` parameter in the next request. When you receive the last page, there will be no `nextToken` key in the pagination object.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:27:54.867-04:00")
public class Pagination {
  @SerializedName("nextToken")
  private String nextToken = null;

  @SerializedName("previousToken")
  private String previousToken = null;

  public Pagination nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * A token that can be used to fetch the next page.
   * @return nextToken
  **/
  @ApiModelProperty(value = "A token that can be used to fetch the next page.")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public Pagination previousToken(String previousToken) {
    this.previousToken = previousToken;
    return this;
  }

   /**
   * A token that can be used to fetch the previous page.
   * @return previousToken
  **/
  @ApiModelProperty(value = "A token that can be used to fetch the previous page.")
  public String getPreviousToken() {
    return previousToken;
  }

  public void setPreviousToken(String previousToken) {
    this.previousToken = previousToken;
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
    return Objects.equals(this.nextToken, pagination.nextToken) &&
        Objects.equals(this.previousToken, pagination.previousToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, previousToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    previousToken: ").append(toIndentedString(previousToken)).append("\n");
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

