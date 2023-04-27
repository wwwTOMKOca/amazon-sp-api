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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Information about an SKU, including the count available, identifiers, and a list of overlapping SKUs that share the same inventory pool.
 */
@ApiModel(description = "Information about an SKU, including the count available, identifiers, and a list of overlapping SKUs that share the same inventory pool.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:40.067-04:00")
public class FeatureSku {
  @SerializedName("sellerSku")
  private String sellerSku = null;

  @SerializedName("fnSku")
  private String fnSku = null;

  @SerializedName("asin")
  private String asin = null;

  @SerializedName("skuCount")
  private BigDecimal skuCount = null;

  @SerializedName("overlappingSkus")
  private List<String> overlappingSkus = null;

  public FeatureSku sellerSku(String sellerSku) {
    this.sellerSku = sellerSku;
    return this;
  }

   /**
   * Used to identify an item in the given marketplace. SellerSKU is qualified by the seller&#39;s SellerId, which is included with every operation that you submit.
   * @return sellerSku
  **/
  @ApiModelProperty(value = "Used to identify an item in the given marketplace. SellerSKU is qualified by the seller's SellerId, which is included with every operation that you submit.")
  public String getSellerSku() {
    return sellerSku;
  }

  public void setSellerSku(String sellerSku) {
    this.sellerSku = sellerSku;
  }

  public FeatureSku fnSku(String fnSku) {
    this.fnSku = fnSku;
    return this;
  }

   /**
   * The unique SKU used by Amazon&#39;s fulfillment network.
   * @return fnSku
  **/
  @ApiModelProperty(value = "The unique SKU used by Amazon's fulfillment network.")
  public String getFnSku() {
    return fnSku;
  }

  public void setFnSku(String fnSku) {
    this.fnSku = fnSku;
  }

  public FeatureSku asin(String asin) {
    this.asin = asin;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item.
   * @return asin
  **/
  @ApiModelProperty(value = "The Amazon Standard Identification Number (ASIN) of the item.")
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public FeatureSku skuCount(BigDecimal skuCount) {
    this.skuCount = skuCount;
    return this;
  }

   /**
   * The number of SKUs available for this service.
   * @return skuCount
  **/
  @ApiModelProperty(value = "The number of SKUs available for this service.")
  public BigDecimal getSkuCount() {
    return skuCount;
  }

  public void setSkuCount(BigDecimal skuCount) {
    this.skuCount = skuCount;
  }

  public FeatureSku overlappingSkus(List<String> overlappingSkus) {
    this.overlappingSkus = overlappingSkus;
    return this;
  }

  public FeatureSku addOverlappingSkusItem(String overlappingSkusItem) {
    if (this.overlappingSkus == null) {
      this.overlappingSkus = new ArrayList<String>();
    }
    this.overlappingSkus.add(overlappingSkusItem);
    return this;
  }

   /**
   * Other seller SKUs that are shared across the same inventory.
   * @return overlappingSkus
  **/
  @ApiModelProperty(value = "Other seller SKUs that are shared across the same inventory.")
  public List<String> getOverlappingSkus() {
    return overlappingSkus;
  }

  public void setOverlappingSkus(List<String> overlappingSkus) {
    this.overlappingSkus = overlappingSkus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureSku featureSku = (FeatureSku) o;
    return Objects.equals(this.sellerSku, featureSku.sellerSku) &&
        Objects.equals(this.fnSku, featureSku.fnSku) &&
        Objects.equals(this.asin, featureSku.asin) &&
        Objects.equals(this.skuCount, featureSku.skuCount) &&
        Objects.equals(this.overlappingSkus, featureSku.overlappingSkus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerSku, fnSku, asin, skuCount, overlappingSkus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureSku {\n");
    
    sb.append("    sellerSku: ").append(toIndentedString(sellerSku)).append("\n");
    sb.append("    fnSku: ").append(toIndentedString(fnSku)).append("\n");
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    skuCount: ").append(toIndentedString(skuCount)).append("\n");
    sb.append("    overlappingSkus: ").append(toIndentedString(overlappingSkus)).append("\n");
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
