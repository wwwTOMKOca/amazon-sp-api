/*
 * Selling Partner API for Retail Procurement Shipments
 * The Selling Partner API for Retail Procurement Shipments provides programmatic access to retail shipping data for vendors.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_shipments_api_model;

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
 * ContainerIdentification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:54:08.878-04:00")
public class ContainerIdentification {
  /**
   * The container identification type.
   */
  @JsonAdapter(ContainerIdentificationTypeEnum.Adapter.class)
  public enum ContainerIdentificationTypeEnum {
    SSCC("SSCC"),
    
    AMZNCC("AMZNCC"),
    
    GTIN("GTIN"),
    
    BPS("BPS"),
    
    CID("CID");

    private String value;

    ContainerIdentificationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContainerIdentificationTypeEnum fromValue(String text) {
      for (ContainerIdentificationTypeEnum b : ContainerIdentificationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ContainerIdentificationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContainerIdentificationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContainerIdentificationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ContainerIdentificationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("containerIdentificationType")
  private ContainerIdentificationTypeEnum containerIdentificationType = null;

  @SerializedName("containerIdentificationNumber")
  private String containerIdentificationNumber = null;

  public ContainerIdentification containerIdentificationType(ContainerIdentificationTypeEnum containerIdentificationType) {
    this.containerIdentificationType = containerIdentificationType;
    return this;
  }

   /**
   * The container identification type.
   * @return containerIdentificationType
  **/
  @ApiModelProperty(required = true, value = "The container identification type.")
  public ContainerIdentificationTypeEnum getContainerIdentificationType() {
    return containerIdentificationType;
  }

  public void setContainerIdentificationType(ContainerIdentificationTypeEnum containerIdentificationType) {
    this.containerIdentificationType = containerIdentificationType;
  }

  public ContainerIdentification containerIdentificationNumber(String containerIdentificationNumber) {
    this.containerIdentificationNumber = containerIdentificationNumber;
    return this;
  }

   /**
   * Container identification number that adheres to the definition of the container identification type.
   * @return containerIdentificationNumber
  **/
  @ApiModelProperty(required = true, value = "Container identification number that adheres to the definition of the container identification type.")
  public String getContainerIdentificationNumber() {
    return containerIdentificationNumber;
  }

  public void setContainerIdentificationNumber(String containerIdentificationNumber) {
    this.containerIdentificationNumber = containerIdentificationNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerIdentification containerIdentification = (ContainerIdentification) o;
    return Objects.equals(this.containerIdentificationType, containerIdentification.containerIdentificationType) &&
        Objects.equals(this.containerIdentificationNumber, containerIdentification.containerIdentificationNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerIdentificationType, containerIdentificationNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerIdentification {\n");
    
    sb.append("    containerIdentificationType: ").append(toIndentedString(containerIdentificationType)).append("\n");
    sb.append("    containerIdentificationNumber: ").append(toIndentedString(containerIdentificationNumber)).append("\n");
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

