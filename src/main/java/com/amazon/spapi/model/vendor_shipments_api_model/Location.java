/*
 * Selling Partner API for Retail Procurement Shipments
 * The Selling Partner API for Retail Procurement Shipments provides programmatic access to retail shipping data for vendors.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_shipments_api_model;

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
 * Location identifier.
 */
@ApiModel(description = "Location identifier.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:12.893-04:00")
public class Location {
  @SerializedName("type")
  private String type = null;

  @SerializedName("locationCode")
  private String locationCode = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  public Location type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of location identification.
   * @return type
  **/
  @ApiModelProperty(value = "Type of location identification.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Location locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Location code.
   * @return locationCode
  **/
  @ApiModelProperty(value = "Location code.")
  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public Location countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The two digit country code. In ISO 3166-1 alpha-2 format.
   * @return countryCode
  **/
  @ApiModelProperty(value = "The two digit country code. In ISO 3166-1 alpha-2 format.")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.type, location.type) &&
        Objects.equals(this.locationCode, location.locationCode) &&
        Objects.equals(this.countryCode, location.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, locationCode, countryCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

