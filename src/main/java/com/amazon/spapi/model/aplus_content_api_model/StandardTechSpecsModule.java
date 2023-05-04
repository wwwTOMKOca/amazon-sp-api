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
import com.amazon.spapi.model.aplus_content_api_model.StandardTextPairBlock;
import com.amazon.spapi.model.aplus_content_api_model.TextComponent;
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
 * The standard table of technical feature names and definitions.
 */
@ApiModel(description = "The standard table of technical feature names and definitions.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:54:03.792-04:00")
public class StandardTechSpecsModule {
  @SerializedName("headline")
  private TextComponent headline = null;

  @SerializedName("specificationList")
  private List<StandardTextPairBlock> specificationList = new ArrayList<StandardTextPairBlock>();

  @SerializedName("tableCount")
  private Integer tableCount = null;

  public StandardTechSpecsModule headline(TextComponent headline) {
    this.headline = headline;
    return this;
  }

   /**
   * Get headline
   * @return headline
  **/
  @ApiModelProperty(value = "")
  public TextComponent getHeadline() {
    return headline;
  }

  public void setHeadline(TextComponent headline) {
    this.headline = headline;
  }

  public StandardTechSpecsModule specificationList(List<StandardTextPairBlock> specificationList) {
    this.specificationList = specificationList;
    return this;
  }

  public StandardTechSpecsModule addSpecificationListItem(StandardTextPairBlock specificationListItem) {
    this.specificationList.add(specificationListItem);
    return this;
  }

   /**
   * The specification list.
   * @return specificationList
  **/
  @ApiModelProperty(required = true, value = "The specification list.")
  public List<StandardTextPairBlock> getSpecificationList() {
    return specificationList;
  }

  public void setSpecificationList(List<StandardTextPairBlock> specificationList) {
    this.specificationList = specificationList;
  }

  public StandardTechSpecsModule tableCount(Integer tableCount) {
    this.tableCount = tableCount;
    return this;
  }

   /**
   * The number of tables to present. Features are evenly divided between the tables.
   * minimum: 1
   * maximum: 2
   * @return tableCount
  **/
  @ApiModelProperty(value = "The number of tables to present. Features are evenly divided between the tables.")
  public Integer getTableCount() {
    return tableCount;
  }

  public void setTableCount(Integer tableCount) {
    this.tableCount = tableCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardTechSpecsModule standardTechSpecsModule = (StandardTechSpecsModule) o;
    return Objects.equals(this.headline, standardTechSpecsModule.headline) &&
        Objects.equals(this.specificationList, standardTechSpecsModule.specificationList) &&
        Objects.equals(this.tableCount, standardTechSpecsModule.tableCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headline, specificationList, tableCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardTechSpecsModule {\n");
    
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    specificationList: ").append(toIndentedString(specificationList)).append("\n");
    sb.append("    tableCount: ").append(toIndentedString(tableCount)).append("\n");
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

