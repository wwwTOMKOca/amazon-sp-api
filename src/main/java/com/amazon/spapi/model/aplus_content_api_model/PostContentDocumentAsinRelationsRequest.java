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
import com.amazon.spapi.model.aplus_content_api_model.AsinSet;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PostContentDocumentAsinRelationsRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:54:03.792-04:00")
public class PostContentDocumentAsinRelationsRequest {
  @SerializedName("asinSet")
  private AsinSet asinSet = null;

  public PostContentDocumentAsinRelationsRequest asinSet(AsinSet asinSet) {
    this.asinSet = asinSet;
    return this;
  }

   /**
   * Get asinSet
   * @return asinSet
  **/
  @ApiModelProperty(required = true, value = "")
  public AsinSet getAsinSet() {
    return asinSet;
  }

  public void setAsinSet(AsinSet asinSet) {
    this.asinSet = asinSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostContentDocumentAsinRelationsRequest postContentDocumentAsinRelationsRequest = (PostContentDocumentAsinRelationsRequest) o;
    return Objects.equals(this.asinSet, postContentDocumentAsinRelationsRequest.asinSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asinSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostContentDocumentAsinRelationsRequest {\n");
    
    sb.append("    asinSet: ").append(toIndentedString(asinSet)).append("\n");
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

