/*
 * Selling Partner API for FBA Small And Light
 * The Selling Partner API for FBA Small and Light lets you help sellers manage their listings in the Small and Light program. The program reduces the cost of fulfilling orders for small and lightweight FBA inventory. You can enroll or remove items from the program and check item eligibility and enrollment status. You can also preview the estimated program fees charged to a seller for items sold while enrolled in the program.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fba_small_and_light_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.fba_small_and_light_api_model.FeePreview;
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
 * SmallAndLightFeePreviews
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:34.356-04:00")
public class SmallAndLightFeePreviews {
  @SerializedName("data")
  private List<FeePreview> data = null;

  public SmallAndLightFeePreviews data(List<FeePreview> data) {
    this.data = data;
    return this;
  }

  public SmallAndLightFeePreviews addDataItem(FeePreview dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<FeePreview>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * A list of fee estimates for the requested items. The order of the fee estimates will follow the same order as the items in the request, with duplicates removed.
   * @return data
  **/
  @ApiModelProperty(value = "A list of fee estimates for the requested items. The order of the fee estimates will follow the same order as the items in the request, with duplicates removed.")
  public List<FeePreview> getData() {
    return data;
  }

  public void setData(List<FeePreview> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmallAndLightFeePreviews smallAndLightFeePreviews = (SmallAndLightFeePreviews) o;
    return Objects.equals(this.data, smallAndLightFeePreviews.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmallAndLightFeePreviews {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

