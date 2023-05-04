/*
 * Selling Partner API for Listings Items
 * The Selling Partner API for Listings Items (Listings Items API) provides programmatic access to selling partner listings on Amazon. Use this API in collaboration with the Selling Partner API for Product Type Definitions, which you use to retrieve the information about Amazon product types needed to use the Listings Items API.  For more information, see the [Listings Items API Use Case Guide](doc:listings-items-api-v2021-08-01-use-case-guide).
 *
 * OpenAPI spec version: 2021-08-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.listings_items_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.listings_items_api_model.FulfillmentAvailability;
import com.amazon.spapi.model.listings_items_api_model.ItemAttributes;
import com.amazon.spapi.model.listings_items_api_model.ItemIssues;
import com.amazon.spapi.model.listings_items_api_model.ItemOffers;
import com.amazon.spapi.model.listings_items_api_model.ItemProcurement;
import com.amazon.spapi.model.listings_items_api_model.ItemSummaries;
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
 * A listings item.
 */
@ApiModel(description = "A listings item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:28:03.156-04:00")
public class Item {
  @SerializedName("sku")
  private String sku = null;

  @SerializedName("summaries")
  private ItemSummaries summaries = null;

  @SerializedName("attributes")
  private ItemAttributes attributes = null;

  @SerializedName("issues")
  private ItemIssues issues = null;

  @SerializedName("offers")
  private ItemOffers offers = null;

  @SerializedName("fulfillmentAvailability")
  private List<FulfillmentAvailability> fulfillmentAvailability = null;

  @SerializedName("procurement")
  private ItemProcurement procurement = null;

  public Item sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * A selling partner provided identifier for an Amazon listing.
   * @return sku
  **/
  @ApiModelProperty(required = true, value = "A selling partner provided identifier for an Amazon listing.")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public Item summaries(ItemSummaries summaries) {
    this.summaries = summaries;
    return this;
  }

   /**
   * Get summaries
   * @return summaries
  **/
  @ApiModelProperty(value = "")
  public ItemSummaries getSummaries() {
    return summaries;
  }

  public void setSummaries(ItemSummaries summaries) {
    this.summaries = summaries;
  }

  public Item attributes(ItemAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public ItemAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ItemAttributes attributes) {
    this.attributes = attributes;
  }

  public Item issues(ItemIssues issues) {
    this.issues = issues;
    return this;
  }

   /**
   * Get issues
   * @return issues
  **/
  @ApiModelProperty(value = "")
  public ItemIssues getIssues() {
    return issues;
  }

  public void setIssues(ItemIssues issues) {
    this.issues = issues;
  }

  public Item offers(ItemOffers offers) {
    this.offers = offers;
    return this;
  }

   /**
   * Get offers
   * @return offers
  **/
  @ApiModelProperty(value = "")
  public ItemOffers getOffers() {
    return offers;
  }

  public void setOffers(ItemOffers offers) {
    this.offers = offers;
  }

  public Item fulfillmentAvailability(List<FulfillmentAvailability> fulfillmentAvailability) {
    this.fulfillmentAvailability = fulfillmentAvailability;
    return this;
  }

  public Item addFulfillmentAvailabilityItem(FulfillmentAvailability fulfillmentAvailabilityItem) {
    if (this.fulfillmentAvailability == null) {
      this.fulfillmentAvailability = new ArrayList<FulfillmentAvailability>();
    }
    this.fulfillmentAvailability.add(fulfillmentAvailabilityItem);
    return this;
  }

   /**
   * Fulfillment availability for the listings item.
   * @return fulfillmentAvailability
  **/
  @ApiModelProperty(value = "Fulfillment availability for the listings item.")
  public List<FulfillmentAvailability> getFulfillmentAvailability() {
    return fulfillmentAvailability;
  }

  public void setFulfillmentAvailability(List<FulfillmentAvailability> fulfillmentAvailability) {
    this.fulfillmentAvailability = fulfillmentAvailability;
  }

  public Item procurement(ItemProcurement procurement) {
    this.procurement = procurement;
    return this;
  }

   /**
   * Get procurement
   * @return procurement
  **/
  @ApiModelProperty(value = "")
  public ItemProcurement getProcurement() {
    return procurement;
  }

  public void setProcurement(ItemProcurement procurement) {
    this.procurement = procurement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.sku, item.sku) &&
        Objects.equals(this.summaries, item.summaries) &&
        Objects.equals(this.attributes, item.attributes) &&
        Objects.equals(this.issues, item.issues) &&
        Objects.equals(this.offers, item.offers) &&
        Objects.equals(this.fulfillmentAvailability, item.fulfillmentAvailability) &&
        Objects.equals(this.procurement, item.procurement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, summaries, attributes, issues, offers, fulfillmentAvailability, procurement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    fulfillmentAvailability: ").append(toIndentedString(fulfillmentAvailability)).append("\n");
    sb.append("    procurement: ").append(toIndentedString(procurement)).append("\n");
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

