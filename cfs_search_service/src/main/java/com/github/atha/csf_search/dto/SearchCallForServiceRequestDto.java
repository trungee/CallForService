package com.github.atha.csf_search.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import lombok.Data;

@Data
@JsonAutoDetect
public class SearchCallForServiceRequestDto {

  private Instant startTime;

  private Instant endTime;

  private String orderBy;

  @JsonProperty(defaultValue = "20")
  private int size;

  private int pageNumber;

  @JsonProperty(defaultValue = "ASC")
  private String orderDirection;
}
