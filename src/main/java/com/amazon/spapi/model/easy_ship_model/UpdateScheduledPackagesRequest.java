/*
 * Selling Partner API for Easy Ship
 * The Selling Partner API for Easy Ship helps you build applications that help sellers manage and ship Amazon Easy Ship orders.  Your Easy Ship applications can:  * Get available time slots for packages to be scheduled for delivery.  * Schedule, reschedule, and cancel Easy Ship orders.  * Print labels, invoices, and warranties.  See the [Marketplace Support Table](doc:easyship-api-v2022-03-23-use-case-guide#marketplace-support-table) for the differences in Easy Ship operations by marketplace.
 *
 * OpenAPI spec version: 2022-03-23
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.easy_ship_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.easy_ship_model.UpdatePackageDetailsList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The request schema for the &#x60;updateScheduledPackages&#x60; operation.
 */
@ApiModel(description = "The request schema for the `updateScheduledPackages` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:27:49.111-04:00")
public class UpdateScheduledPackagesRequest {
  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("updatePackageDetailsList")
  private UpdatePackageDetailsList updatePackageDetailsList = null;

  public UpdateScheduledPackagesRequest marketplaceId(String marketplaceId) {
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

  public UpdateScheduledPackagesRequest updatePackageDetailsList(UpdatePackageDetailsList updatePackageDetailsList) {
    this.updatePackageDetailsList = updatePackageDetailsList;
    return this;
  }

   /**
   * Get updatePackageDetailsList
   * @return updatePackageDetailsList
  **/
  @ApiModelProperty(required = true, value = "")
  public UpdatePackageDetailsList getUpdatePackageDetailsList() {
    return updatePackageDetailsList;
  }

  public void setUpdatePackageDetailsList(UpdatePackageDetailsList updatePackageDetailsList) {
    this.updatePackageDetailsList = updatePackageDetailsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateScheduledPackagesRequest updateScheduledPackagesRequest = (UpdateScheduledPackagesRequest) o;
    return Objects.equals(this.marketplaceId, updateScheduledPackagesRequest.marketplaceId) &&
        Objects.equals(this.updatePackageDetailsList, updateScheduledPackagesRequest.updatePackageDetailsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, updatePackageDetailsList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateScheduledPackagesRequest {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    updatePackageDetailsList: ").append(toIndentedString(updatePackageDetailsList)).append("\n");
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

