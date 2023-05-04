/*
 * Selling Partner API for FBA Inbound Eligibilty
 * With the FBA Inbound Eligibility API, you can build applications that let sellers get eligibility previews for items before shipping them to Amazon's fulfillment centers. With this API you can find out if an item is eligible for inbound shipment to Amazon's fulfillment centers in a specific marketplace. You can also find out if an item is eligible for using the manufacturer barcode for FBA inventory tracking. Sellers can use this information to inform their decisions about which items to ship Amazon's fulfillment centers.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fba_inbound_eligibility_api_model;

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
import java.util.ArrayList;
import java.util.List;

/**
 * The response object which contains the ASIN, marketplaceId if required, eligibility program, the eligibility status (boolean), and a list of ineligibility reason codes.
 */
@ApiModel(description = "The response object which contains the ASIN, marketplaceId if required, eligibility program, the eligibility status (boolean), and a list of ineligibility reason codes.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T23:27:56.369-04:00")
public class ItemEligibilityPreview {
  @SerializedName("asin")
  private String asin = null;

  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  /**
   * The program for which eligibility was determined.
   */
  @JsonAdapter(ProgramEnum.Adapter.class)
  public enum ProgramEnum {
    INBOUND("INBOUND"),
    
    COMMINGLING("COMMINGLING");

    private String value;

    ProgramEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProgramEnum fromValue(String text) {
      for (ProgramEnum b : ProgramEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProgramEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProgramEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProgramEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProgramEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("program")
  private ProgramEnum program = null;

  @SerializedName("isEligibleForProgram")
  private Boolean isEligibleForProgram = null;

  /**
   * Potential Ineligibility Reason Codes.
   */
  @JsonAdapter(IneligibilityReasonListEnum.Adapter.class)
  public enum IneligibilityReasonListEnum {
    FBA_INB_0004("FBA_INB_0004"),
    
    FBA_INB_0006("FBA_INB_0006"),
    
    FBA_INB_0007("FBA_INB_0007"),
    
    FBA_INB_0008("FBA_INB_0008"),
    
    FBA_INB_0009("FBA_INB_0009"),
    
    FBA_INB_0010("FBA_INB_0010"),
    
    FBA_INB_0011("FBA_INB_0011"),
    
    FBA_INB_0012("FBA_INB_0012"),
    
    FBA_INB_0013("FBA_INB_0013"),
    
    FBA_INB_0014("FBA_INB_0014"),
    
    FBA_INB_0015("FBA_INB_0015"),
    
    FBA_INB_0016("FBA_INB_0016"),
    
    FBA_INB_0017("FBA_INB_0017"),
    
    FBA_INB_0018("FBA_INB_0018"),
    
    FBA_INB_0019("FBA_INB_0019"),
    
    FBA_INB_0034("FBA_INB_0034"),
    
    FBA_INB_0035("FBA_INB_0035"),
    
    FBA_INB_0036("FBA_INB_0036"),
    
    FBA_INB_0037("FBA_INB_0037"),
    
    FBA_INB_0038("FBA_INB_0038"),
    
    FBA_INB_0050("FBA_INB_0050"),
    
    FBA_INB_0051("FBA_INB_0051"),
    
    FBA_INB_0053("FBA_INB_0053"),
    
    FBA_INB_0055("FBA_INB_0055"),
    
    FBA_INB_0056("FBA_INB_0056"),
    
    FBA_INB_0059("FBA_INB_0059"),
    
    FBA_INB_0065("FBA_INB_0065"),
    
    FBA_INB_0066("FBA_INB_0066"),
    
    FBA_INB_0067("FBA_INB_0067"),
    
    FBA_INB_0068("FBA_INB_0068"),
    
    FBA_INB_0095("FBA_INB_0095"),
    
    FBA_INB_0097("FBA_INB_0097"),
    
    FBA_INB_0098("FBA_INB_0098"),
    
    FBA_INB_0099("FBA_INB_0099"),
    
    FBA_INB_0100("FBA_INB_0100"),
    
    FBA_INB_0103("FBA_INB_0103"),
    
    FBA_INB_0104("FBA_INB_0104"),
    
    FBA_INB_0197("FBA_INB_0197"),
    
    UNKNOWN_INB_ERROR_CODE("UNKNOWN_INB_ERROR_CODE");

    private String value;

    IneligibilityReasonListEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IneligibilityReasonListEnum fromValue(String text) {
      for (IneligibilityReasonListEnum b : IneligibilityReasonListEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IneligibilityReasonListEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IneligibilityReasonListEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IneligibilityReasonListEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IneligibilityReasonListEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ineligibilityReasonList")
  private List<IneligibilityReasonListEnum> ineligibilityReasonList = null;

  public ItemEligibilityPreview asin(String asin) {
    this.asin = asin;
    return this;
  }

   /**
   * The ASIN for which eligibility was determined.
   * @return asin
  **/
  @ApiModelProperty(required = true, value = "The ASIN for which eligibility was determined.")
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public ItemEligibilityPreview marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * The marketplace for which eligibility was determined.
   * @return marketplaceId
  **/
  @ApiModelProperty(value = "The marketplace for which eligibility was determined.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public ItemEligibilityPreview program(ProgramEnum program) {
    this.program = program;
    return this;
  }

   /**
   * The program for which eligibility was determined.
   * @return program
  **/
  @ApiModelProperty(required = true, value = "The program for which eligibility was determined.")
  public ProgramEnum getProgram() {
    return program;
  }

  public void setProgram(ProgramEnum program) {
    this.program = program;
  }

  public ItemEligibilityPreview isEligibleForProgram(Boolean isEligibleForProgram) {
    this.isEligibleForProgram = isEligibleForProgram;
    return this;
  }

   /**
   * Indicates if the item is eligible for the program.
   * @return isEligibleForProgram
  **/
  @ApiModelProperty(required = true, value = "Indicates if the item is eligible for the program.")
  public Boolean isIsEligibleForProgram() {
    return isEligibleForProgram;
  }

  public void setIsEligibleForProgram(Boolean isEligibleForProgram) {
    this.isEligibleForProgram = isEligibleForProgram;
  }

  public ItemEligibilityPreview ineligibilityReasonList(List<IneligibilityReasonListEnum> ineligibilityReasonList) {
    this.ineligibilityReasonList = ineligibilityReasonList;
    return this;
  }

  public ItemEligibilityPreview addIneligibilityReasonListItem(IneligibilityReasonListEnum ineligibilityReasonListItem) {
    if (this.ineligibilityReasonList == null) {
      this.ineligibilityReasonList = new ArrayList<IneligibilityReasonListEnum>();
    }
    this.ineligibilityReasonList.add(ineligibilityReasonListItem);
    return this;
  }

   /**
   * Potential Ineligibility Reason Codes.
   * @return ineligibilityReasonList
  **/
  @ApiModelProperty(value = "Potential Ineligibility Reason Codes.")
  public List<IneligibilityReasonListEnum> getIneligibilityReasonList() {
    return ineligibilityReasonList;
  }

  public void setIneligibilityReasonList(List<IneligibilityReasonListEnum> ineligibilityReasonList) {
    this.ineligibilityReasonList = ineligibilityReasonList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemEligibilityPreview itemEligibilityPreview = (ItemEligibilityPreview) o;
    return Objects.equals(this.asin, itemEligibilityPreview.asin) &&
        Objects.equals(this.marketplaceId, itemEligibilityPreview.marketplaceId) &&
        Objects.equals(this.program, itemEligibilityPreview.program) &&
        Objects.equals(this.isEligibleForProgram, itemEligibilityPreview.isEligibleForProgram) &&
        Objects.equals(this.ineligibilityReasonList, itemEligibilityPreview.ineligibilityReasonList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asin, marketplaceId, program, isEligibleForProgram, ineligibilityReasonList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemEligibilityPreview {\n");
    
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    isEligibleForProgram: ").append(toIndentedString(isEligibleForProgram)).append("\n");
    sb.append("    ineligibilityReasonList: ").append(toIndentedString(ineligibilityReasonList)).append("\n");
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

