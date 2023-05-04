/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders and manage their resources.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.services_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.services_api_model.AppointmentSlot;
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
import org.threeten.bp.OffsetDateTime;

/**
 * Availability information as per the service context queried.
 */
@ApiModel(description = "Availability information as per the service context queried.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-03T19:54:03.079-04:00")
public class AppointmentSlotReport {
  /**
   * Defines the type of slots.
   */
  @JsonAdapter(SchedulingTypeEnum.Adapter.class)
  public enum SchedulingTypeEnum {
    REAL_TIME_SCHEDULING("REAL_TIME_SCHEDULING"),
    
    NON_REAL_TIME_SCHEDULING("NON_REAL_TIME_SCHEDULING");

    private String value;

    SchedulingTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SchedulingTypeEnum fromValue(String text) {
      for (SchedulingTypeEnum b : SchedulingTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SchedulingTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SchedulingTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SchedulingTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SchedulingTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("schedulingType")
  private SchedulingTypeEnum schedulingType = null;

  @SerializedName("startTime")
  private OffsetDateTime startTime = null;

  @SerializedName("endTime")
  private OffsetDateTime endTime = null;

  @SerializedName("appointmentSlots")
  private List<AppointmentSlot> appointmentSlots = null;

  public AppointmentSlotReport schedulingType(SchedulingTypeEnum schedulingType) {
    this.schedulingType = schedulingType;
    return this;
  }

   /**
   * Defines the type of slots.
   * @return schedulingType
  **/
  @ApiModelProperty(value = "Defines the type of slots.")
  public SchedulingTypeEnum getSchedulingType() {
    return schedulingType;
  }

  public void setSchedulingType(SchedulingTypeEnum schedulingType) {
    this.schedulingType = schedulingType;
  }

  public AppointmentSlotReport startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Start Time from which the appointment slots are generated in ISO 8601 format.
   * @return startTime
  **/
  @ApiModelProperty(value = "Start Time from which the appointment slots are generated in ISO 8601 format.")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public AppointmentSlotReport endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * End Time up to which the appointment slots are generated in ISO 8601 format.
   * @return endTime
  **/
  @ApiModelProperty(value = "End Time up to which the appointment slots are generated in ISO 8601 format.")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public AppointmentSlotReport appointmentSlots(List<AppointmentSlot> appointmentSlots) {
    this.appointmentSlots = appointmentSlots;
    return this;
  }

  public AppointmentSlotReport addAppointmentSlotsItem(AppointmentSlot appointmentSlotsItem) {
    if (this.appointmentSlots == null) {
      this.appointmentSlots = new ArrayList<AppointmentSlot>();
    }
    this.appointmentSlots.add(appointmentSlotsItem);
    return this;
  }

   /**
   * A list of time windows along with associated capacity in which the service can be performed.
   * @return appointmentSlots
  **/
  @ApiModelProperty(value = "A list of time windows along with associated capacity in which the service can be performed.")
  public List<AppointmentSlot> getAppointmentSlots() {
    return appointmentSlots;
  }

  public void setAppointmentSlots(List<AppointmentSlot> appointmentSlots) {
    this.appointmentSlots = appointmentSlots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppointmentSlotReport appointmentSlotReport = (AppointmentSlotReport) o;
    return Objects.equals(this.schedulingType, appointmentSlotReport.schedulingType) &&
        Objects.equals(this.startTime, appointmentSlotReport.startTime) &&
        Objects.equals(this.endTime, appointmentSlotReport.endTime) &&
        Objects.equals(this.appointmentSlots, appointmentSlotReport.appointmentSlots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulingType, startTime, endTime, appointmentSlots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentSlotReport {\n");
    
    sb.append("    schedulingType: ").append(toIndentedString(schedulingType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    appointmentSlots: ").append(toIndentedString(appointmentSlots)).append("\n");
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

