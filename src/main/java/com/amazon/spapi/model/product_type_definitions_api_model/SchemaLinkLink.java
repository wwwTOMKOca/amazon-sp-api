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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Link to retrieve the schema.
 */
@ApiModel(description = "Link to retrieve the schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:30.313-04:00")
public class SchemaLinkLink {
  @SerializedName("resource")
  private String resource = null;

  /**
   * HTTP method for the link operation.
   */
  @JsonAdapter(VerbEnum.Adapter.class)
  public enum VerbEnum {
    GET("GET");

    private String value;

    VerbEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerbEnum fromValue(String text) {
      for (VerbEnum b : VerbEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VerbEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerbEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerbEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VerbEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("verb")
  private VerbEnum verb = null;

  public SchemaLinkLink resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * URI resource for the link.
   * @return resource
  **/
  @ApiModelProperty(required = true, value = "URI resource for the link.")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public SchemaLinkLink verb(VerbEnum verb) {
    this.verb = verb;
    return this;
  }

   /**
   * HTTP method for the link operation.
   * @return verb
  **/
  @ApiModelProperty(required = true, value = "HTTP method for the link operation.")
  public VerbEnum getVerb() {
    return verb;
  }

  public void setVerb(VerbEnum verb) {
    this.verb = verb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaLinkLink schemaLinkLink = (SchemaLinkLink) o;
    return Objects.equals(this.resource, schemaLinkLink.resource) &&
        Objects.equals(this.verb, schemaLinkLink.verb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, verb);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaLinkLink {\n");
    
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
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

