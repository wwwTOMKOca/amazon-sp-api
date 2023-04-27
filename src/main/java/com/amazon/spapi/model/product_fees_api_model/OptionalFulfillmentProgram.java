/*
 * Selling Partner API for Product Fees
 * The Selling Partner API for Product Fees lets you programmatically retrieve estimated fees for a product. You can then account for those fees in your pricing.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.product_fees_api_model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * An optional enrollment program to return the estimated fees when the offer is fulfilled by Amazon (IsAmazonFulfilled is set to true).
 */
@JsonAdapter(OptionalFulfillmentProgram.Adapter.class)
public enum OptionalFulfillmentProgram {
  
  CORE("FBA_CORE"),
  
  SNL("FBA_SNL"),
  
  EFN("FBA_EFN");

  private String value;

  OptionalFulfillmentProgram(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OptionalFulfillmentProgram fromValue(String text) {
    for (OptionalFulfillmentProgram b : OptionalFulfillmentProgram.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OptionalFulfillmentProgram> {
    @Override
    public void write(final JsonWriter jsonWriter, final OptionalFulfillmentProgram enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OptionalFulfillmentProgram read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OptionalFulfillmentProgram.fromValue(String.valueOf(value));
    }
  }
}
