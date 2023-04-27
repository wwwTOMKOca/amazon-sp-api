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
import com.amazon.spapi.model.vendor_direct_fulfillment_payments_api_model.InvoiceDetail;
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
 * The request schema for the submitInvoice operation.
 */
@ApiModel(description = "The request schema for the submitInvoice operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:22.306-04:00")
public class SubmitInvoiceRequest {
  @SerializedName("invoices")
  private List<InvoiceDetail> invoices = null;

  public SubmitInvoiceRequest invoices(List<InvoiceDetail> invoices) {
    this.invoices = invoices;
    return this;
  }

  public SubmitInvoiceRequest addInvoicesItem(InvoiceDetail invoicesItem) {
    if (this.invoices == null) {
      this.invoices = new ArrayList<InvoiceDetail>();
    }
    this.invoices.add(invoicesItem);
    return this;
  }

   /**
   * Get invoices
   * @return invoices
  **/
  @ApiModelProperty(value = "")
  public List<InvoiceDetail> getInvoices() {
    return invoices;
  }

  public void setInvoices(List<InvoiceDetail> invoices) {
    this.invoices = invoices;
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
    return Objects.equals(this.invoices, submitInvoiceRequest.invoices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitInvoiceRequest {\n");
    
    sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
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

