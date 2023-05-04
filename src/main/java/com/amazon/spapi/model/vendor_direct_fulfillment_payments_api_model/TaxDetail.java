/*
 * Selling Partner API for Direct Fulfillment Payments
 * The Selling Partner API for Direct Fulfillment Payments provides programmatic access to a direct fulfillment vendor's invoice data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.vendor_direct_fulfillment_payments_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.vendor_direct_fulfillment_payments_api_model.Money;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Details of tax amount applied.
 */
@ApiModel(description = "Details of tax amount applied.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:27:42.481-04:00")
public class TaxDetail {
  /**
   * Type of the tax applied.
   */
  @JsonAdapter(TaxTypeEnum.Adapter.class)
  public enum TaxTypeEnum {
    CGST("CGST"),
    
    SGST("SGST"),
    
    CESS("CESS"),
    
    UTGST("UTGST"),
    
    IGST("IGST"),
    
    MWST_("MwSt."),
    
    PST("PST"),
    
    TVA("TVA"),
    
    VAT("VAT"),
    
    GST("GST"),
    
    ST("ST"),
    
    CONSUMPTION("Consumption"),
    
    MUTUALLYDEFINED("MutuallyDefined"),
    
    DOMESTICVAT("DomesticVAT");

    private String value;

    TaxTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TaxTypeEnum fromValue(String text) {
      for (TaxTypeEnum b : TaxTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TaxTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaxTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TaxTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TaxTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("taxType")
  private TaxTypeEnum taxType = null;

  @SerializedName("taxRate")
  private String taxRate = null;

  @SerializedName("taxAmount")
  private Money taxAmount = null;

  @SerializedName("taxableAmount")
  private Money taxableAmount = null;

  public TaxDetail taxType(TaxTypeEnum taxType) {
    this.taxType = taxType;
    return this;
  }

   /**
   * Type of the tax applied.
   * @return taxType
  **/
  @ApiModelProperty(required = true, value = "Type of the tax applied.")
  public TaxTypeEnum getTaxType() {
    return taxType;
  }

  public void setTaxType(TaxTypeEnum taxType) {
    this.taxType = taxType;
  }

  public TaxDetail taxRate(String taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Tax percentage applied. Percentage must be expressed in decimal.
   * @return taxRate
  **/
  @ApiModelProperty(value = "Tax percentage applied. Percentage must be expressed in decimal.")
  public String getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(String taxRate) {
    this.taxRate = taxRate;
  }

  public TaxDetail taxAmount(Money taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Total tax amount applied on invoice total or an item total.
   * @return taxAmount
  **/
  @ApiModelProperty(required = true, value = "Total tax amount applied on invoice total or an item total.")
  public Money getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Money taxAmount) {
    this.taxAmount = taxAmount;
  }

  public TaxDetail taxableAmount(Money taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

   /**
   * This field will contain the invoice amount that is taxable at the rate specified in the tax rate field.
   * @return taxableAmount
  **/
  @ApiModelProperty(value = "This field will contain the invoice amount that is taxable at the rate specified in the tax rate field.")
  public Money getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(Money taxableAmount) {
    this.taxableAmount = taxableAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxDetail taxDetail = (TaxDetail) o;
    return Objects.equals(this.taxType, taxDetail.taxType) &&
        Objects.equals(this.taxRate, taxDetail.taxRate) &&
        Objects.equals(this.taxAmount, taxDetail.taxAmount) &&
        Objects.equals(this.taxableAmount, taxDetail.taxableAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxType, taxRate, taxAmount, taxableAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDetail {\n");
    
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
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

