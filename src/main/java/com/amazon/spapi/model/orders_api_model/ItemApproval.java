/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.orders_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.orders_api_model.ItemApprovalAction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Generic item approval. Check the applicable restrictions at the specific approval type schemas.
 */
@ApiModel(description = "Generic item approval. Check the applicable restrictions at the specific approval type schemas.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T00:26:28.341-04:00")
public class ItemApproval {
  @SerializedName("SequenceId")
  private Integer sequenceId = null;

  @SerializedName("Timestamp")
  private String timestamp = null;

  /**
   * High level actors involved in the approval process.
   */
  @JsonAdapter(ActorEnum.Adapter.class)
  public enum ActorEnum {
    SELLING_PARTNER("SELLING_PARTNER"),
    
    AMAZON("AMAZON");

    private String value;

    ActorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActorEnum fromValue(String text) {
      for (ActorEnum b : ActorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActorEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Actor")
  private ActorEnum actor = null;

  @SerializedName("Approver")
  private String approver = null;

  @SerializedName("ApprovalAction")
  private ItemApprovalAction approvalAction = null;

  /**
   * Status of approval action.
   */
  @JsonAdapter(ApprovalActionProcessStatusEnum.Adapter.class)
  public enum ApprovalActionProcessStatusEnum {
    PROCESSING("PROCESSING"),
    
    SUCCESS("SUCCESS"),
    
    ERROR("ERROR");

    private String value;

    ApprovalActionProcessStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApprovalActionProcessStatusEnum fromValue(String text) {
      for (ApprovalActionProcessStatusEnum b : ApprovalActionProcessStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ApprovalActionProcessStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApprovalActionProcessStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApprovalActionProcessStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ApprovalActionProcessStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ApprovalActionProcessStatus")
  private ApprovalActionProcessStatusEnum approvalActionProcessStatus = null;

  @SerializedName("ApprovalActionProcessStatusMessage")
  private String approvalActionProcessStatusMessage = null;

  public ItemApproval sequenceId(Integer sequenceId) {
    this.sequenceId = sequenceId;
    return this;
  }

   /**
   * Sequence number of the item approval. Each ItemApproval gets its sequenceId automatically from a monotonic increasing function.
   * @return sequenceId
  **/
  @ApiModelProperty(required = true, value = "Sequence number of the item approval. Each ItemApproval gets its sequenceId automatically from a monotonic increasing function.")
  public Integer getSequenceId() {
    return sequenceId;
  }

  public void setSequenceId(Integer sequenceId) {
    this.sequenceId = sequenceId;
  }

  public ItemApproval timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp when the ItemApproval was recorded by Amazon&#39;s internal order approvals system. In ISO 8601 date time format.
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "Timestamp when the ItemApproval was recorded by Amazon's internal order approvals system. In ISO 8601 date time format.")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public ItemApproval actor(ActorEnum actor) {
    this.actor = actor;
    return this;
  }

   /**
   * High level actors involved in the approval process.
   * @return actor
  **/
  @ApiModelProperty(required = true, value = "High level actors involved in the approval process.")
  public ActorEnum getActor() {
    return actor;
  }

  public void setActor(ActorEnum actor) {
    this.actor = actor;
  }

  public ItemApproval approver(String approver) {
    this.approver = approver;
    return this;
  }

   /**
   * Person or system that triggers the approval actions on behalf of the actor.
   * @return approver
  **/
  @ApiModelProperty(value = "Person or system that triggers the approval actions on behalf of the actor.")
  public String getApprover() {
    return approver;
  }

  public void setApprover(String approver) {
    this.approver = approver;
  }

  public ItemApproval approvalAction(ItemApprovalAction approvalAction) {
    this.approvalAction = approvalAction;
    return this;
  }

   /**
   * Approval action that defines the behavior of the ItemApproval.
   * @return approvalAction
  **/
  @ApiModelProperty(required = true, value = "Approval action that defines the behavior of the ItemApproval.")
  public ItemApprovalAction getApprovalAction() {
    return approvalAction;
  }

  public void setApprovalAction(ItemApprovalAction approvalAction) {
    this.approvalAction = approvalAction;
  }

  public ItemApproval approvalActionProcessStatus(ApprovalActionProcessStatusEnum approvalActionProcessStatus) {
    this.approvalActionProcessStatus = approvalActionProcessStatus;
    return this;
  }

   /**
   * Status of approval action.
   * @return approvalActionProcessStatus
  **/
  @ApiModelProperty(required = true, value = "Status of approval action.")
  public ApprovalActionProcessStatusEnum getApprovalActionProcessStatus() {
    return approvalActionProcessStatus;
  }

  public void setApprovalActionProcessStatus(ApprovalActionProcessStatusEnum approvalActionProcessStatus) {
    this.approvalActionProcessStatus = approvalActionProcessStatus;
  }

  public ItemApproval approvalActionProcessStatusMessage(String approvalActionProcessStatusMessage) {
    this.approvalActionProcessStatusMessage = approvalActionProcessStatusMessage;
    return this;
  }

   /**
   * Optional message to communicate optional additional context about the current status of the approval action.
   * @return approvalActionProcessStatusMessage
  **/
  @ApiModelProperty(value = "Optional message to communicate optional additional context about the current status of the approval action.")
  public String getApprovalActionProcessStatusMessage() {
    return approvalActionProcessStatusMessage;
  }

  public void setApprovalActionProcessStatusMessage(String approvalActionProcessStatusMessage) {
    this.approvalActionProcessStatusMessage = approvalActionProcessStatusMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemApproval itemApproval = (ItemApproval) o;
    return Objects.equals(this.sequenceId, itemApproval.sequenceId) &&
        Objects.equals(this.timestamp, itemApproval.timestamp) &&
        Objects.equals(this.actor, itemApproval.actor) &&
        Objects.equals(this.approver, itemApproval.approver) &&
        Objects.equals(this.approvalAction, itemApproval.approvalAction) &&
        Objects.equals(this.approvalActionProcessStatus, itemApproval.approvalActionProcessStatus) &&
        Objects.equals(this.approvalActionProcessStatusMessage, itemApproval.approvalActionProcessStatusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequenceId, timestamp, actor, approver, approvalAction, approvalActionProcessStatus, approvalActionProcessStatusMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemApproval {\n");
    
    sb.append("    sequenceId: ").append(toIndentedString(sequenceId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
    sb.append("    approvalAction: ").append(toIndentedString(approvalAction)).append("\n");
    sb.append("    approvalActionProcessStatus: ").append(toIndentedString(approvalActionProcessStatus)).append("\n");
    sb.append("    approvalActionProcessStatusMessage: ").append(toIndentedString(approvalActionProcessStatusMessage)).append("\n");
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
