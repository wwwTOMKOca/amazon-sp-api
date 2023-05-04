/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillment_inbound_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.fulfillment_inbound_api_model.ASINPrepInstructionsList;
import com.amazon.spapi.model.fulfillment_inbound_api_model.InvalidASINList;
import com.amazon.spapi.model.fulfillment_inbound_api_model.InvalidSKUList;
import com.amazon.spapi.model.fulfillment_inbound_api_model.SKUPrepInstructionsList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetPrepInstructionsResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:53:54.337-04:00")
public class GetPrepInstructionsResult {
  @SerializedName("SKUPrepInstructionsList")
  private SKUPrepInstructionsList skUPrepInstructionsList = null;

  @SerializedName("InvalidSKUList")
  private InvalidSKUList invalidSKUList = null;

  @SerializedName("ASINPrepInstructionsList")
  private ASINPrepInstructionsList asINPrepInstructionsList = null;

  @SerializedName("InvalidASINList")
  private InvalidASINList invalidASINList = null;

  public GetPrepInstructionsResult skUPrepInstructionsList(SKUPrepInstructionsList skUPrepInstructionsList) {
    this.skUPrepInstructionsList = skUPrepInstructionsList;
    return this;
  }

   /**
   * Get skUPrepInstructionsList
   * @return skUPrepInstructionsList
  **/
  @ApiModelProperty(value = "")
  public SKUPrepInstructionsList getSkUPrepInstructionsList() {
    return skUPrepInstructionsList;
  }

  public void setSkUPrepInstructionsList(SKUPrepInstructionsList skUPrepInstructionsList) {
    this.skUPrepInstructionsList = skUPrepInstructionsList;
  }

  public GetPrepInstructionsResult invalidSKUList(InvalidSKUList invalidSKUList) {
    this.invalidSKUList = invalidSKUList;
    return this;
  }

   /**
   * Get invalidSKUList
   * @return invalidSKUList
  **/
  @ApiModelProperty(value = "")
  public InvalidSKUList getInvalidSKUList() {
    return invalidSKUList;
  }

  public void setInvalidSKUList(InvalidSKUList invalidSKUList) {
    this.invalidSKUList = invalidSKUList;
  }

  public GetPrepInstructionsResult asINPrepInstructionsList(ASINPrepInstructionsList asINPrepInstructionsList) {
    this.asINPrepInstructionsList = asINPrepInstructionsList;
    return this;
  }

   /**
   * Get asINPrepInstructionsList
   * @return asINPrepInstructionsList
  **/
  @ApiModelProperty(value = "")
  public ASINPrepInstructionsList getAsINPrepInstructionsList() {
    return asINPrepInstructionsList;
  }

  public void setAsINPrepInstructionsList(ASINPrepInstructionsList asINPrepInstructionsList) {
    this.asINPrepInstructionsList = asINPrepInstructionsList;
  }

  public GetPrepInstructionsResult invalidASINList(InvalidASINList invalidASINList) {
    this.invalidASINList = invalidASINList;
    return this;
  }

   /**
   * Get invalidASINList
   * @return invalidASINList
  **/
  @ApiModelProperty(value = "")
  public InvalidASINList getInvalidASINList() {
    return invalidASINList;
  }

  public void setInvalidASINList(InvalidASINList invalidASINList) {
    this.invalidASINList = invalidASINList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPrepInstructionsResult getPrepInstructionsResult = (GetPrepInstructionsResult) o;
    return Objects.equals(this.skUPrepInstructionsList, getPrepInstructionsResult.skUPrepInstructionsList) &&
        Objects.equals(this.invalidSKUList, getPrepInstructionsResult.invalidSKUList) &&
        Objects.equals(this.asINPrepInstructionsList, getPrepInstructionsResult.asINPrepInstructionsList) &&
        Objects.equals(this.invalidASINList, getPrepInstructionsResult.invalidASINList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skUPrepInstructionsList, invalidSKUList, asINPrepInstructionsList, invalidASINList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPrepInstructionsResult {\n");
    
    sb.append("    skUPrepInstructionsList: ").append(toIndentedString(skUPrepInstructionsList)).append("\n");
    sb.append("    invalidSKUList: ").append(toIndentedString(invalidSKUList)).append("\n");
    sb.append("    asINPrepInstructionsList: ").append(toIndentedString(asINPrepInstructionsList)).append("\n");
    sb.append("    invalidASINList: ").append(toIndentedString(invalidASINList)).append("\n");
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

