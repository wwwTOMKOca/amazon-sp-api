/*
 * Selling Partner API for Product Type Definitions
 * The Selling Partner API for Product Type Definitions provides programmatic access to attribute and data requirements for product types in the Amazon catalog. Use this API to return the JSON Schema for a product type that you can then use with other Selling Partner APIs, such as the Selling Partner API for Listings Items, the Selling Partner API for Catalog Items, and the Selling Partner API for Feeds (for JSON-based listing feeds).  For more information, see the [Product Type Definitions API Use Case Guide](doc:product-type-api-use-case-guide).
 *
 * OpenAPI spec version: 2020-09-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.product_type_definitions_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.product_type_definitions_api_model.ProductType;
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
 * A list of Amazon product types with definitions available.
 */
@ApiModel(description = "A list of Amazon product types with definitions available.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:30.313-04:00")
public class ProductTypeList {
  @SerializedName("productTypes")
  private List<ProductType> productTypes = new ArrayList<ProductType>();

  public ProductTypeList productTypes(List<ProductType> productTypes) {
    this.productTypes = productTypes;
    return this;
  }

  public ProductTypeList addProductTypesItem(ProductType productTypesItem) {
    this.productTypes.add(productTypesItem);
    return this;
  }

   /**
   * Get productTypes
   * @return productTypes
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ProductType> getProductTypes() {
    return productTypes;
  }

  public void setProductTypes(List<ProductType> productTypes) {
    this.productTypes = productTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductTypeList productTypeList = (ProductTypeList) o;
    return Objects.equals(this.productTypes, productTypeList.productTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTypeList {\n");
    
    sb.append("    productTypes: ").append(toIndentedString(productTypes)).append("\n");
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

