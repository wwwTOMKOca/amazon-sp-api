/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillment_inbound_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.fulfillment_inbound_api_model.UnitOfMeasurement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * The dimension values and unit of measurement.
 */
@ApiModel(description = "The dimension values and unit of measurement.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:27:43.557-04:00")
public class Dimensions {
  @SerializedName("Length")
  private BigDecimal length = null;

  @SerializedName("Width")
  private BigDecimal width = null;

  @SerializedName("Height")
  private BigDecimal height = null;

  @SerializedName("Unit")
  private UnitOfMeasurement unit = null;

  public Dimensions length(BigDecimal length) {
    this.length = length;
    return this;
  }

   /**
   * The length dimension.
   * @return length
  **/
  @ApiModelProperty(required = true, value = "The length dimension.")
  public BigDecimal getLength() {
    return length;
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public Dimensions width(BigDecimal width) {
    this.width = width;
    return this;
  }

   /**
   * The width dimension.
   * @return width
  **/
  @ApiModelProperty(required = true, value = "The width dimension.")
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public Dimensions height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * The height dimension.
   * @return height
  **/
  @ApiModelProperty(required = true, value = "The height dimension.")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public Dimensions unit(UnitOfMeasurement unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The unit of measurement for the dimensions.
   * @return unit
  **/
  @ApiModelProperty(required = true, value = "The unit of measurement for the dimensions.")
  public UnitOfMeasurement getUnit() {
    return unit;
  }

  public void setUnit(UnitOfMeasurement unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dimensions dimensions = (Dimensions) o;
    return Objects.equals(this.length, dimensions.length) &&
        Objects.equals(this.width, dimensions.width) &&
        Objects.equals(this.height, dimensions.height) &&
        Objects.equals(this.unit, dimensions.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, width, height, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dimensions {\n");
    
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

