package com.github.atha.csf.controller;

import com.github.atha.csf.dto.CreateCallForServiceRequestDto;
import com.github.atha.csf.dto.CreateCallForServiceResponseDto;
import com.github.atha.csf.service.CallForServiceService;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/call-for-service")
public class CfsController {

  private final CallForServiceService callForServiceService;

  public CfsController(CallForServiceService callForServiceService) {
    this.callForServiceService = callForServiceService;
  }

  @PostMapping
  public ResponseEntity<CreateCallForServiceResponseDto> create(@RequestBody
      CreateCallForServiceRequestDto createRequestDto) {
    return Optional.of(callForServiceService.create(createRequestDto))
        .map(cfs ->
            CreateCallForServiceResponseDto.builder()
                .agencyId(cfs.getAgencyId())
                .eventId(cfs.getEventId())
                .eventNumber(cfs.getEventNumber())
                .eventTime(cfs.getEventTime())
                .dispatchTime(cfs.getDispatchTime())
                .responderId(cfs.getResponderId())
                .build()
        ).map(cfs -> ResponseEntity.status(HttpStatus.CREATED).body(cfs))
        .get();
  }

}
