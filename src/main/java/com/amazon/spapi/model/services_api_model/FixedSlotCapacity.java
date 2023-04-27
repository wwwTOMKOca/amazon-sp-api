/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders and manage their resources.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.services_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.services_api_model.FixedSlot;
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
 * Response schema for the &#x60;getFixedSlotCapacity&#x60; operation.
 */
@ApiModel(description = "Response schema for the `getFixedSlotCapacity` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:14.119-04:00")
public class FixedSlotCapacity {
  @SerializedName("resourceId")
  private String resourceId = null;

  @SerializedName("slotDuration")
  private BigDecimal slotDuration = null;

  @SerializedName("capacities")
  private List<FixedSlot> capacities = null;

  @SerializedName("nextPageToken")
  private String nextPageToken = null;

  public FixedSlotCapacity resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Resource Identifier.
   * @return resourceId
  **/
  @ApiModelProperty(value = "Resource Identifier.")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public FixedSlotCapacity slotDuration(BigDecimal slotDuration) {
    this.slotDuration = slotDuration;
    return this;
  }

   /**
   * The duration of each slot which is returned. This value will be a multiple of 5 and fall in the following range: 5 &lt;&#x3D; &#x60;slotDuration&#x60; &lt;&#x3D; 360.
   * @return slotDuration
  **/
  @ApiModelProperty(value = "The duration of each slot which is returned. This value will be a multiple of 5 and fall in the following range: 5 <= `slotDuration` <= 360.")
  public BigDecimal getSlotDuration() {
    return slotDuration;
  }

  public void setSlotDuration(BigDecimal slotDuration) {
    this.slotDuration = slotDuration;
  }

  public FixedSlotCapacity capacities(List<FixedSlot> capacities) {
    this.capacities = capacities;
    return this;
  }

  public FixedSlotCapacity addCapacitiesItem(FixedSlot capacitiesItem) {
    if (this.capacities == null) {
      this.capacities = new ArrayList<FixedSlot>();
    }
    this.capacities.add(capacitiesItem);
    return this;
  }

   /**
   * Array of capacity slots in fixed slot format.
   * @return capacities
  **/
  @ApiModelProperty(value = "Array of capacity slots in fixed slot format.")
  public List<FixedSlot> getCapacities() {
    return capacities;
  }

  public void setCapacities(List<FixedSlot> capacities) {
    this.capacities = capacities;
  }

  public FixedSlotCapacity nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * Next page token, if there are more pages.
   * @return nextPageToken
  **/
  @ApiModelProperty(value = "Next page token, if there are more pages.")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FixedSlotCapacity fixedSlotCapacity = (FixedSlotCapacity) o;
    return Objects.equals(this.resourceId, fixedSlotCapacity.resourceId) &&
        Objects.equals(this.slotDuration, fixedSlotCapacity.slotDuration) &&
        Objects.equals(this.capacities, fixedSlotCapacity.capacities) &&
        Objects.equals(this.nextPageToken, fixedSlotCapacity.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, slotDuration, capacities, nextPageToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FixedSlotCapacity {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    slotDuration: ").append(toIndentedString(slotDuration)).append("\n");
    sb.append("    capacities: ").append(toIndentedString(capacities)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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

