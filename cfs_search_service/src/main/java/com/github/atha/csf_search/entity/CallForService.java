package com.github.atha.csf_search.entity;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Table(name = "tbl_call_for_service")
@Data
@Builder
public class CallForService {

  @Id
  private String id;

  @Column(name = "agency_id")
  private String agencyId;

  @Column(name = "event_id")
  private String eventId;

  @Column(name = "event_number")
  private String eventNumber;

  @Column(name = "event_type")
  private EventType eventType;

  @Column(name = "event_time")
  private Instant eventTime;

  @Column(name = "dispatch_time")
  private Instant dispatchTime;

  @Column(name = "responder_id")
  private String responderId;
}
