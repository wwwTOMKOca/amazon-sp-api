/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items helps you programmatically retrieve item details for items in the catalog.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.catalog_items_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.catalog_items_api_model.DecimalWithUnits;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The image attribute of the item.
 */
@ApiModel(description = "The image attribute of the item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:21.168-04:00")
public class Image {
  @SerializedName("URL")
  private String URL = null;

  @SerializedName("Height")
  private DecimalWithUnits height = null;

  @SerializedName("Width")
  private DecimalWithUnits width = null;

  public Image URL(String URL) {
    this.URL = URL;
    return this;
  }

   /**
   * The image URL attribute of the item.
   * @return URL
  **/
  @ApiModelProperty(value = "The image URL attribute of the item.")
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }

  public Image height(DecimalWithUnits height) {
    this.height = height;
    return this;
  }

   /**
   * The image height attribute of the item.
   * @return height
  **/
  @ApiModelProperty(value = "The image height attribute of the item.")
  public DecimalWithUnits getHeight() {
    return height;
  }

  public void setHeight(DecimalWithUnits height) {
    this.height = height;
  }

  public Image width(DecimalWithUnits width) {
    this.width = width;
    return this;
  }

   /**
   * The image width attribute of the item.
   * @return width
  **/
  @ApiModelProperty(value = "The image width attribute of the item.")
  public DecimalWithUnits getWidth() {
    return width;
  }

  public void setWidth(DecimalWithUnits width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.URL, image.URL) &&
        Objects.equals(this.height, image.height) &&
        Objects.equals(this.width, image.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(URL, height, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

