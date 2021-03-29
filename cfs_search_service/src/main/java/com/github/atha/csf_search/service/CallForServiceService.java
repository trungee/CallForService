package com.github.atha.csf_search.service;

import com.github.atha.csf_search.dto.SearchCallForServiceRequestDto;
import com.github.atha.csf_search.entity.CallForService;
import java.util.List;

public interface CallForServiceService {

  List<CallForService> search(SearchCallForServiceRequestDto createRequestDto);
}
