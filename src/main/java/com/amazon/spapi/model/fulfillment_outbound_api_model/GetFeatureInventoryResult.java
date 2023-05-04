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
import com.amazon.spapi.model.fulfillment_outbound_api_model.FeatureSku;
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
 * The payload for the getEligibileInventory operation.
 */
@ApiModel(description = "The payload for the getEligibileInventory operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:27:41.721-04:00")
public class GetFeatureInventoryResult {
  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("featureName")
  private String featureName = null;

  @SerializedName("nextToken")
  private String nextToken = null;

  @SerializedName("featureSkus")
  private List<FeatureSku> featureSkus = null;

  public GetFeatureInventoryResult marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * The requested marketplace.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "The requested marketplace.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public GetFeatureInventoryResult featureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

   /**
   * The name of the feature.
   * @return featureName
  **/
  @ApiModelProperty(required = true, value = "The name of the feature.")
  public String getFeatureName() {
    return featureName;
  }

  public void setFeatureName(String featureName) {
    this.featureName = featureName;
  }

  public GetFeatureInventoryResult nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * When present and not empty, pass this string token in the next request to return the next response page.
   * @return nextToken
  **/
  @ApiModelProperty(value = "When present and not empty, pass this string token in the next request to return the next response page.")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public GetFeatureInventoryResult featureSkus(List<FeatureSku> featureSkus) {
    this.featureSkus = featureSkus;
    return this;
  }

  public GetFeatureInventoryResult addFeatureSkusItem(FeatureSku featureSkusItem) {
    if (this.featureSkus == null) {
      this.featureSkus = new ArrayList<FeatureSku>();
    }
    this.featureSkus.add(featureSkusItem);
    return this;
  }

   /**
   * An array of SKUs eligible for this feature and the quantity available.
   * @return featureSkus
  **/
  @ApiModelProperty(value = "An array of SKUs eligible for this feature and the quantity available.")
  public List<FeatureSku> getFeatureSkus() {
    return featureSkus;
  }

  public void setFeatureSkus(List<FeatureSku> featureSkus) {
    this.featureSkus = featureSkus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFeatureInventoryResult getFeatureInventoryResult = (GetFeatureInventoryResult) o;
    return Objects.equals(this.marketplaceId, getFeatureInventoryResult.marketplaceId) &&
        Objects.equals(this.featureName, getFeatureInventoryResult.featureName) &&
        Objects.equals(this.nextToken, getFeatureInventoryResult.nextToken) &&
        Objects.equals(this.featureSkus, getFeatureInventoryResult.featureSkus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, featureName, nextToken, featureSkus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFeatureInventoryResult {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    featureSkus: ").append(toIndentedString(featureSkus)).append("\n");
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

