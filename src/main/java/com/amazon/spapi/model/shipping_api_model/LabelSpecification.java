/*
 * Selling Partner API for Shipping
 * Provides programmatic access to Amazon Shipping APIs.   **Note:** If you are new to the Amazon Shipping API, refer to the latest version of <a href=\"https://developer-docs.amazon.com/amazon-shipping/docs/shipping-api-v2-reference\">Amazon Shipping API (v2)</a> on the <a href=\"https://developer-docs.amazon.com/amazon-shipping/\">Amazon Shipping Developer Documentation</a> site.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.shipping_api_model;

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
 * The label specification info.
 */
@ApiModel(description = "The label specification info.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:54:10.750-04:00")
public class LabelSpecification {
  /**
   * The format of the label. Enum of PNG only for now.
   */
  @JsonAdapter(LabelFormatEnum.Adapter.class)
  public enum LabelFormatEnum {
    PNG("PNG");

    private String value;

    LabelFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LabelFormatEnum fromValue(String text) {
      for (LabelFormatEnum b : LabelFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LabelFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LabelFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LabelFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LabelFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("labelFormat")
  private LabelFormatEnum labelFormat = null;

  /**
   * The label stock size specification in length and height. Enum of 4x6 only for now.
   */
  @JsonAdapter(LabelStockSizeEnum.Adapter.class)
  public enum LabelStockSizeEnum {
    _4X6("4x6");

    private String value;

    LabelStockSizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LabelStockSizeEnum fromValue(String text) {
      for (LabelStockSizeEnum b : LabelStockSizeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LabelStockSizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LabelStockSizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LabelStockSizeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LabelStockSizeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("labelStockSize")
  private LabelStockSizeEnum labelStockSize = null;

  public LabelSpecification labelFormat(LabelFormatEnum labelFormat) {
    this.labelFormat = labelFormat;
    return this;
  }

   /**
   * The format of the label. Enum of PNG only for now.
   * @return labelFormat
  **/
  @ApiModelProperty(required = true, value = "The format of the label. Enum of PNG only for now.")
  public LabelFormatEnum getLabelFormat() {
    return labelFormat;
  }

  public void setLabelFormat(LabelFormatEnum labelFormat) {
    this.labelFormat = labelFormat;
  }

  public LabelSpecification labelStockSize(LabelStockSizeEnum labelStockSize) {
    this.labelStockSize = labelStockSize;
    return this;
  }

   /**
   * The label stock size specification in length and height. Enum of 4x6 only for now.
   * @return labelStockSize
  **/
  @ApiModelProperty(required = true, value = "The label stock size specification in length and height. Enum of 4x6 only for now.")
  public LabelStockSizeEnum getLabelStockSize() {
    return labelStockSize;
  }

  public void setLabelStockSize(LabelStockSizeEnum labelStockSize) {
    this.labelStockSize = labelStockSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelSpecification labelSpecification = (LabelSpecification) o;
    return Objects.equals(this.labelFormat, labelSpecification.labelFormat) &&
        Objects.equals(this.labelStockSize, labelSpecification.labelStockSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelFormat, labelStockSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelSpecification {\n");
    
    sb.append("    labelFormat: ").append(toIndentedString(labelFormat)).append("\n");
    sb.append("    labelStockSize: ").append(toIndentedString(labelStockSize)).append("\n");
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

