/*
 * Selling Partner API for Shipment Invoicing
 * The Selling Partner API for Shipment Invoicing helps you programmatically retrieve shipment invoice information in the Brazil marketplace for a selling partner’s Fulfillment by Amazon (FBA) orders.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.shipment_invoicing_api_model;

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
 * The request schema for the submitInvoice operation.
 */
@ApiModel(description = "The request schema for the submitInvoice operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:54:04.962-04:00")
public class SubmitInvoiceRequest {
  @SerializedName("InvoiceContent")
  private String invoiceContent = null;

  @SerializedName("MarketplaceId")
  private String marketplaceId = null;

  @SerializedName("ContentMD5Value")
  private String contentMD5Value = null;

  public SubmitInvoiceRequest invoiceContent(String invoiceContent) {
    this.invoiceContent = invoiceContent;
    return this;
  }

   /**
   * Get invoiceContent
   * @return invoiceContent
  **/
  @ApiModelProperty(required = true, value = "")
  public String getInvoiceContent() {
    return invoiceContent;
  }

  public void setInvoiceContent(String invoiceContent) {
    this.invoiceContent = invoiceContent;
  }

  public SubmitInvoiceRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * An Amazon marketplace identifier.
   * @return marketplaceId
  **/
  @ApiModelProperty(value = "An Amazon marketplace identifier.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public SubmitInvoiceRequest contentMD5Value(String contentMD5Value) {
    this.contentMD5Value = contentMD5Value;
    return this;
  }

   /**
   * MD5 sum for validating the invoice data. For more information about calculating this value, see [Working with Content-MD5 Checksums](https://docs.developer.amazonservices.com/en_US/dev_guide/DG_MD5.html).
   * @return contentMD5Value
  **/
  @ApiModelProperty(required = true, value = "MD5 sum for validating the invoice data. For more information about calculating this value, see [Working with Content-MD5 Checksums](https://docs.developer.amazonservices.com/en_US/dev_guide/DG_MD5.html).")
  public String getContentMD5Value() {
    return contentMD5Value;
  }

  public void setContentMD5Value(String contentMD5Value) {
    this.contentMD5Value = contentMD5Value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitInvoiceRequest submitInvoiceRequest = (SubmitInvoiceRequest) o;
    return Objects.equals(this.invoiceContent, submitInvoiceRequest.invoiceContent) &&
        Objects.equals(this.marketplaceId, submitInvoiceRequest.marketplaceId) &&
        Objects.equals(this.contentMD5Value, submitInvoiceRequest.contentMD5Value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceContent, marketplaceId, contentMD5Value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitInvoiceRequest {\n");
    
    sb.append("    invoiceContent: ").append(toIndentedString(invoiceContent)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    contentMD5Value: ").append(toIndentedString(contentMD5Value)).append("\n");
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

