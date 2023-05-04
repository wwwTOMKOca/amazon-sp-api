/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer pricing information for Amazon Marketplace products.  For more information, see the [Product Pricing v2022-05-01 Use Case Guide](doc:product-pricing-api-v2022-05-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-05-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.product_pricing_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.product_pricing_api_model.BatchRequest;
import com.amazon.spapi.model.product_pricing_api_model.HttpBody;
import com.amazon.spapi.model.product_pricing_api_model.HttpHeaders;
import com.amazon.spapi.model.product_pricing_api_model.HttpMethod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An individual featured offer expected price request for a particular SKU.
 */
@ApiModel(description = "An individual featured offer expected price request for a particular SKU.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:27:47.660-04:00")
public class FeaturedOfferExpectedPriceRequest extends BatchRequest {
  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("sku")
  private String sku = null;

  public FeaturedOfferExpectedPriceRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * Get marketplaceId
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public FeaturedOfferExpectedPriceRequest sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturedOfferExpectedPriceRequest featuredOfferExpectedPriceRequest = (FeaturedOfferExpectedPriceRequest) o;
    return Objects.equals(this.marketplaceId, featuredOfferExpectedPriceRequest.marketplaceId) &&
        Objects.equals(this.sku, featuredOfferExpectedPriceRequest.sku) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, sku, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturedOfferExpectedPriceRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

