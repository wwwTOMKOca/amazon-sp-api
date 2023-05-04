/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.aplus_content_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.aplus_content_api_model.ContentMetadata;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The metadata for an A+ Content document, with additional information for content management.
 */
@ApiModel(description = "The metadata for an A+ Content document, with additional information for content management.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:54:03.792-04:00")
public class ContentMetadataRecord {
  @SerializedName("contentReferenceKey")
  private String contentReferenceKey = null;

  @SerializedName("contentMetadata")
  private ContentMetadata contentMetadata = null;

  public ContentMetadataRecord contentReferenceKey(String contentReferenceKey) {
    this.contentReferenceKey = contentReferenceKey;
    return this;
  }

   /**
   * Get contentReferenceKey
   * @return contentReferenceKey
  **/
  @ApiModelProperty(required = true, value = "")
  public String getContentReferenceKey() {
    return contentReferenceKey;
  }

  public void setContentReferenceKey(String contentReferenceKey) {
    this.contentReferenceKey = contentReferenceKey;
  }

  public ContentMetadataRecord contentMetadata(ContentMetadata contentMetadata) {
    this.contentMetadata = contentMetadata;
    return this;
  }

   /**
   * Get contentMetadata
   * @return contentMetadata
  **/
  @ApiModelProperty(required = true, value = "")
  public ContentMetadata getContentMetadata() {
    return contentMetadata;
  }

  public void setContentMetadata(ContentMetadata contentMetadata) {
    this.contentMetadata = contentMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentMetadataRecord contentMetadataRecord = (ContentMetadataRecord) o;
    return Objects.equals(this.contentReferenceKey, contentMetadataRecord.contentReferenceKey) &&
        Objects.equals(this.contentMetadata, contentMetadataRecord.contentMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentReferenceKey, contentMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentMetadataRecord {\n");
    
    sb.append("    contentReferenceKey: ").append(toIndentedString(contentReferenceKey)).append("\n");
    sb.append("    contentMetadata: ").append(toIndentedString(contentMetadata)).append("\n");
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

