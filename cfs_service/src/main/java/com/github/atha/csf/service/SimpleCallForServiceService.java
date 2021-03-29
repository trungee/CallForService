package com.github.atha.csf.service;

import com.github.atha.csf.dto.CreateCallForServiceRequestDto;
import com.github.atha.csf.dto.CreateCallForServiceResponseDto;
import com.github.atha.csf.entity.CallForService;
import com.github.atha.csf.repository.CallForServiceRepository;
import java.time.Instant;
import org.springframework.stereotype.Service;

@Service
public class SimpleCallForServiceService implements CallForServiceService{

  private final CallForServiceRepository callForServiceRepository;

  public SimpleCallForServiceService(
      CallForServiceRepository callForServiceRepository) {
    this.callForServiceRepository = callForServiceRepository;
  }

  @Override
  public CallForService create(CreateCallForServiceRequestDto createRequestDto) {
    CallForService callForService = CallForService.builder()
        .agencyId(createRequestDto.getAgencyId())
        .eventId(createRequestDto.getEventId())
        .eventNumber(createRequestDto.getEventNumber())
        .eventType(createRequestDto.getEventType())
        .eventTime(Instant.now())
        .responderId(createRequestDto.getResponderId())
        .build();
    return callForServiceRepository.save(callForService);
  }

}
