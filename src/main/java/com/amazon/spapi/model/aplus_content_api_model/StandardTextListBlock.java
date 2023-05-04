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
import com.amazon.spapi.model.aplus_content_api_model.TextItem;
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
 * The A+ Content standard fixed length list of text, usually presented as bullet points.
 */
@ApiModel(description = "The A+ Content standard fixed length list of text, usually presented as bullet points.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:27:54.086-04:00")
public class StandardTextListBlock {
  @SerializedName("textList")
  private List<TextItem> textList = new ArrayList<TextItem>();

  public StandardTextListBlock textList(List<TextItem> textList) {
    this.textList = textList;
    return this;
  }

  public StandardTextListBlock addTextListItem(TextItem textListItem) {
    this.textList.add(textListItem);
    return this;
  }

   /**
   * Get textList
   * @return textList
  **/
  @ApiModelProperty(required = true, value = "")
  public List<TextItem> getTextList() {
    return textList;
  }

  public void setTextList(List<TextItem> textList) {
    this.textList = textList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardTextListBlock standardTextListBlock = (StandardTextListBlock) o;
    return Objects.equals(this.textList, standardTextListBlock.textList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardTextListBlock {\n");
    
    sb.append("    textList: ").append(toIndentedString(textList)).append("\n");
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

