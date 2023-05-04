/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.orders_api_model;

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
 * A field collected from the regulatory form.
 */
@ApiModel(description = "A field collected from the regulatory form.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:27:51.478-04:00")
public class RegulatedInformationField {
  @SerializedName("FieldId")
  private String fieldId = null;

  @SerializedName("FieldLabel")
  private String fieldLabel = null;

  /**
   * The type of field.
   */
  @JsonAdapter(FieldTypeEnum.Adapter.class)
  public enum FieldTypeEnum {
    TEXT("Text"),
    
    FILEATTACHMENT("FileAttachment");

    private String value;

    FieldTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FieldTypeEnum fromValue(String text) {
      for (FieldTypeEnum b : FieldTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FieldTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FieldTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FieldTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FieldTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("FieldType")
  private FieldTypeEnum fieldType = null;

  @SerializedName("FieldValue")
  private String fieldValue = null;

  public RegulatedInformationField fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * The unique identifier for the field.
   * @return fieldId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier for the field.")
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public RegulatedInformationField fieldLabel(String fieldLabel) {
    this.fieldLabel = fieldLabel;
    return this;
  }

   /**
   * The name for the field.
   * @return fieldLabel
  **/
  @ApiModelProperty(required = true, value = "The name for the field.")
  public String getFieldLabel() {
    return fieldLabel;
  }

  public void setFieldLabel(String fieldLabel) {
    this.fieldLabel = fieldLabel;
  }

  public RegulatedInformationField fieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * The type of field.
   * @return fieldType
  **/
  @ApiModelProperty(required = true, value = "The type of field.")
  public FieldTypeEnum getFieldType() {
    return fieldType;
  }

  public void setFieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
  }

  public RegulatedInformationField fieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

   /**
   * The content of the field as collected in regulatory form. Note that FileAttachment type fields will contain a URL to download the attachment here.
   * @return fieldValue
  **/
  @ApiModelProperty(required = true, value = "The content of the field as collected in regulatory form. Note that FileAttachment type fields will contain a URL to download the attachment here.")
  public String getFieldValue() {
    return fieldValue;
  }

  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegulatedInformationField regulatedInformationField = (RegulatedInformationField) o;
    return Objects.equals(this.fieldId, regulatedInformationField.fieldId) &&
        Objects.equals(this.fieldLabel, regulatedInformationField.fieldLabel) &&
        Objects.equals(this.fieldType, regulatedInformationField.fieldType) &&
        Objects.equals(this.fieldValue, regulatedInformationField.fieldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, fieldLabel, fieldType, fieldValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatedInformationField {\n");
    
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    fieldLabel: ").append(toIndentedString(fieldLabel)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
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

