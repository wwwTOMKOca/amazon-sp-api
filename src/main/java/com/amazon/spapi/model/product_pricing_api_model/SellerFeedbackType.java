/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.product_pricing_api_model;

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
 * Information about the seller&#39;s feedback, including the percentage of positive feedback, and the total number of ratings received.
 */
@ApiModel(description = "Information about the seller's feedback, including the percentage of positive feedback, and the total number of ratings received.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:32.134-04:00")
public class SellerFeedbackType {
  @SerializedName("SellerPositiveFeedbackRating")
  private Double sellerPositiveFeedbackRating = null;

  @SerializedName("FeedbackCount")
  private Long feedbackCount = null;

  public SellerFeedbackType sellerPositiveFeedbackRating(Double sellerPositiveFeedbackRating) {
    this.sellerPositiveFeedbackRating = sellerPositiveFeedbackRating;
    return this;
  }

   /**
   * The percentage of positive feedback for the seller in the past 365 days.
   * @return sellerPositiveFeedbackRating
  **/
  @ApiModelProperty(value = "The percentage of positive feedback for the seller in the past 365 days.")
  public Double getSellerPositiveFeedbackRating() {
    return sellerPositiveFeedbackRating;
  }

  public void setSellerPositiveFeedbackRating(Double sellerPositiveFeedbackRating) {
    this.sellerPositiveFeedbackRating = sellerPositiveFeedbackRating;
  }

  public SellerFeedbackType feedbackCount(Long feedbackCount) {
    this.feedbackCount = feedbackCount;
    return this;
  }

   /**
   * The number of ratings received about the seller.
   * @return feedbackCount
  **/
  @ApiModelProperty(required = true, value = "The number of ratings received about the seller.")
  public Long getFeedbackCount() {
    return feedbackCount;
  }

  public void setFeedbackCount(Long feedbackCount) {
    this.feedbackCount = feedbackCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellerFeedbackType sellerFeedbackType = (SellerFeedbackType) o;
    return Objects.equals(this.sellerPositiveFeedbackRating, sellerFeedbackType.sellerPositiveFeedbackRating) &&
        Objects.equals(this.feedbackCount, sellerFeedbackType.feedbackCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerPositiveFeedbackRating, feedbackCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerFeedbackType {\n");
    
    sb.append("    sellerPositiveFeedbackRating: ").append(toIndentedString(sellerPositiveFeedbackRating)).append("\n");
    sb.append("    feedbackCount: ").append(toIndentedString(feedbackCount)).append("\n");
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

