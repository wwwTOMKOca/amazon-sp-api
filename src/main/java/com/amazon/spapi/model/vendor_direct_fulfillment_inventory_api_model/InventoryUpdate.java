/*
 * Selling Partner API for Direct Fulfillment Inventory Updates
 * The Selling Partner API for Direct Fulfillment Inventory Updates provides programmatic access to a direct fulfillment vendor's inventory updates.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_direct_fulfillment_inventory_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_direct_fulfillment_inventory_api_model.ItemDetails;
import com.amazon.spapi.model.vendor_direct_fulfillment_inventory_api_model.PartyIdentification;
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
 * InventoryUpdate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:16.058-04:00")
public class InventoryUpdate {
  @SerializedName("sellingParty")
  private PartyIdentification sellingParty = null;

  @SerializedName("isFullUpdate")
  private Boolean isFullUpdate = null;

  @SerializedName("items")
  private List<ItemDetails> items = new ArrayList<ItemDetails>();

  public InventoryUpdate sellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
    return this;
  }

   /**
   * ID of the selling party or vendor.
   * @return sellingParty
  **/
  @ApiModelProperty(required = true, value = "ID of the selling party or vendor.")
  public PartyIdentification getSellingParty() {
    return sellingParty;
  }

  public void setSellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
  }

  public InventoryUpdate isFullUpdate(Boolean isFullUpdate) {
    this.isFullUpdate = isFullUpdate;
    return this;
  }

   /**
   * When true, this request contains a full feed. Otherwise, this request contains a partial feed. When sending a full feed, you must send information about all items in the warehouse. Any items not in the full feed are updated as not available. When sending a partial feed, only include the items that need an update to inventory. The status of other items will remain unchanged.
   * @return isFullUpdate
  **/
  @ApiModelProperty(required = true, value = "When true, this request contains a full feed. Otherwise, this request contains a partial feed. When sending a full feed, you must send information about all items in the warehouse. Any items not in the full feed are updated as not available. When sending a partial feed, only include the items that need an update to inventory. The status of other items will remain unchanged.")
  public Boolean isIsFullUpdate() {
    return isFullUpdate;
  }

  public void setIsFullUpdate(Boolean isFullUpdate) {
    this.isFullUpdate = isFullUpdate;
  }

  public InventoryUpdate items(List<ItemDetails> items) {
    this.items = items;
    return this;
  }

  public InventoryUpdate addItemsItem(ItemDetails itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of inventory items with updated details, including quantity available.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "A list of inventory items with updated details, including quantity available.")
  public List<ItemDetails> getItems() {
    return items;
  }

  public void setItems(List<ItemDetails> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryUpdate inventoryUpdate = (InventoryUpdate) o;
    return Objects.equals(this.sellingParty, inventoryUpdate.sellingParty) &&
        Objects.equals(this.isFullUpdate, inventoryUpdate.isFullUpdate) &&
        Objects.equals(this.items, inventoryUpdate.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellingParty, isFullUpdate, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryUpdate {\n");
    
    sb.append("    sellingParty: ").append(toIndentedString(sellingParty)).append("\n");
    sb.append("    isFullUpdate: ").append(toIndentedString(isFullUpdate)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

