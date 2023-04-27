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
import com.amazon.spapi.model.notifications_api_model.EventBridgeResource;
import com.amazon.spapi.model.notifications_api_model.SqsResource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The destination resource types.
 */
@ApiModel(description = "The destination resource types.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:29.080-04:00")
public class DestinationResource {
  @SerializedName("sqs")
  private SqsResource sqs = null;

  @SerializedName("eventBridge")
  private EventBridgeResource eventBridge = null;

  public DestinationResource sqs(SqsResource sqs) {
    this.sqs = sqs;
    return this;
  }

   /**
   * An Amazon Simple Queue Service (SQS) queue destination.
   * @return sqs
  **/
  @ApiModelProperty(value = "An Amazon Simple Queue Service (SQS) queue destination.")
  public SqsResource getSqs() {
    return sqs;
  }

  public void setSqs(SqsResource sqs) {
    this.sqs = sqs;
  }

  public DestinationResource eventBridge(EventBridgeResource eventBridge) {
    this.eventBridge = eventBridge;
    return this;
  }

   /**
   * An Amazon EventBridge destination.
   * @return eventBridge
  **/
  @ApiModelProperty(value = "An Amazon EventBridge destination.")
  public EventBridgeResource getEventBridge() {
    return eventBridge;
  }

  public void setEventBridge(EventBridgeResource eventBridge) {
    this.eventBridge = eventBridge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinationResource destinationResource = (DestinationResource) o;
    return Objects.equals(this.sqs, destinationResource.sqs) &&
        Objects.equals(this.eventBridge, destinationResource.eventBridge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sqs, eventBridge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinationResource {\n");
    
    sb.append("    sqs: ").append(toIndentedString(sqs)).append("\n");
    sb.append("    eventBridge: ").append(toIndentedString(eventBridge)).append("\n");
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

