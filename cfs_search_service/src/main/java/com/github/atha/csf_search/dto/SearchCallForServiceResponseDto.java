package com.github.atha.csf_search.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.atha.csf_search.entity.EventType;
import java.time.Instant;
import lombok.Builder;
import lombok.Data;

@Data
@JsonAutoDetect
@Builder
public class SearchCallForServiceResponseDto {

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
