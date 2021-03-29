package com.github.atha.csf_search.controller;

import com.github.atha.csf_search.dto.SearchCallForServiceRequestDto;
import com.github.atha.csf_search.dto.SearchCallForServiceResponseDto;
import com.github.atha.csf_search.service.CallForServiceService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/call-for-service/search")
public class CfsSearchController {

  private final CallForServiceService callForServiceService;

  public CfsSearchController(CallForServiceService callForServiceService) {
    this.callForServiceService = callForServiceService;
  }

  @PostMapping
  public ResponseEntity<List<SearchCallForServiceResponseDto>> search(@RequestBody
      SearchCallForServiceRequestDto searchRequestDto) {
    List<SearchCallForServiceResponseDto> result = callForServiceService.search(searchRequestDto).stream()
        .map(cfs ->
            SearchCallForServiceResponseDto.builder()
                .agencyId(cfs.getAgencyId())
                .eventId(cfs.getEventId())
                .eventNumber(cfs.getEventNumber())
                .eventTime(cfs.getEventTime())
                .dispatchTime(cfs.getDispatchTime())
                .responderId(cfs.getResponderId())
                .build()
        ).collect(Collectors.toList());
    return ResponseEntity.ok(result);
  }

}
