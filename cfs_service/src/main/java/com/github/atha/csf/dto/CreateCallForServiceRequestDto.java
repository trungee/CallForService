package com.github.atha.csf.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.atha.csf.entity.EventType;
import java.time.Instant;
import java.util.UUID;
import lombok.Data;

@Data
@JsonAutoDetect
public class CreateCallForServiceRequestDto {

  private String id;

  private String agencyId;

  private String eventId;

  private String eventNumber;

  @JsonProperty("eventTypeCode")
  private EventType eventType;

  private Instant eventTime;

  private Instant dispatchTime;

  private String responderId;
}
