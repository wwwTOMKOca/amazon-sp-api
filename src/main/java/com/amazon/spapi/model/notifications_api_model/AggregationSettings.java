/*
 * Selling Partner API for Notifications
 * The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.  For more information, see the [Notifications Use Case Guide](doc:notifications-api-v1-use-case-guide).
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.notifications_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.notifications_api_model.AggregationTimePeriod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A container that holds all of the necessary properties to configure the aggregation of notifications.
 */
@ApiModel(description = "A container that holds all of the necessary properties to configure the aggregation of notifications.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:29.080-04:00")
public class AggregationSettings {
  @SerializedName("aggregationTimePeriod")
  private AggregationTimePeriod aggregationTimePeriod = null;

  public AggregationSettings aggregationTimePeriod(AggregationTimePeriod aggregationTimePeriod) {
    this.aggregationTimePeriod = aggregationTimePeriod;
    return this;
  }

   /**
   * The supported time period to use to perform marketplace-ASIN level aggregation.
   * @return aggregationTimePeriod
  **/
  @ApiModelProperty(required = true, value = "The supported time period to use to perform marketplace-ASIN level aggregation.")
  public AggregationTimePeriod getAggregationTimePeriod() {
    return aggregationTimePeriod;
  }

  public void setAggregationTimePeriod(AggregationTimePeriod aggregationTimePeriod) {
    this.aggregationTimePeriod = aggregationTimePeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationSettings aggregationSettings = (AggregationSettings) o;
    return Objects.equals(this.aggregationTimePeriod, aggregationSettings.aggregationTimePeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationTimePeriod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationSettings {\n");
    
    sb.append("    aggregationTimePeriod: ").append(toIndentedString(aggregationTimePeriod)).append("\n");
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

