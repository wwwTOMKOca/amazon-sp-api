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
import com.amazon.spapi.model.product_pricing_api_model.Condition;
import com.amazon.spapi.model.product_pricing_api_model.OfferIdentifier;
import com.amazon.spapi.model.product_pricing_api_model.Price;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FeaturedOffer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:53:58.021-04:00")
public class FeaturedOffer {
  @SerializedName("offerIdentifier")
  private OfferIdentifier offerIdentifier = null;

  @SerializedName("condition")
  private Condition condition = null;

  @SerializedName("price")
  private Price price = null;

  public FeaturedOffer offerIdentifier(OfferIdentifier offerIdentifier) {
    this.offerIdentifier = offerIdentifier;
    return this;
  }

   /**
   * An offer identifier used to identify the merchant of the featured offer. Since this may not belong to the requester, the SKU field will be omitted.
   * @return offerIdentifier
  **/
  @ApiModelProperty(required = true, value = "An offer identifier used to identify the merchant of the featured offer. Since this may not belong to the requester, the SKU field will be omitted.")
  public OfferIdentifier getOfferIdentifier() {
    return offerIdentifier;
  }

  public void setOfferIdentifier(OfferIdentifier offerIdentifier) {
    this.offerIdentifier = offerIdentifier;
  }

  public FeaturedOffer condition(Condition condition) {
    this.condition = condition;
    return this;
  }

   /**
   * The item condition.
   * @return condition
  **/
  @ApiModelProperty(value = "The item condition.")
  public Condition getCondition() {
    return condition;
  }

  public void setCondition(Condition condition) {
    this.condition = condition;
  }

  public FeaturedOffer price(Price price) {
    this.price = price;
    return this;
  }

   /**
   * The current active price of the offer.
   * @return price
  **/
  @ApiModelProperty(value = "The current active price of the offer.")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturedOffer featuredOffer = (FeaturedOffer) o;
    return Objects.equals(this.offerIdentifier, featuredOffer.offerIdentifier) &&
        Objects.equals(this.condition, featuredOffer.condition) &&
        Objects.equals(this.price, featuredOffer.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerIdentifier, condition, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturedOffer {\n");
    
    sb.append("    offerIdentifier: ").append(toIndentedString(offerIdentifier)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

