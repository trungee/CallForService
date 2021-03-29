package com.github.atha.csf_search.service;

import com.github.atha.csf_search.dto.SearchCallForServiceRequestDto;
import com.github.atha.csf_search.entity.CallForService;
import com.github.atha.csf_search.repository.CallForServiceRepository;
import java.time.Instant;
import java.util.List;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class SimpleCallForServiceService implements CallForServiceService {

  private final CallForServiceRepository callForServiceRepository;

  public SimpleCallForServiceService(
      CallForServiceRepository callForServiceRepository) {
    this.callForServiceRepository = callForServiceRepository;
  }

  @Override
  public List<CallForService> search(SearchCallForServiceRequestDto searchRequestDto) {
    PageRequest pageRequest = PageRequest
        .of((searchRequestDto.getPageNumber() - 1) * searchRequestDto.getSize(),
            searchRequestDto.getPageNumber() * searchRequestDto.getSize(),
            Sort.by("eventTime"));
    return callForServiceRepository
        .findAllByEventTimeBetween(searchRequestDto.getStartTime(), searchRequestDto.getEndTime(),
            pageRequest);
  }

}
