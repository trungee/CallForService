package com.github.atha.csf.service;

import com.github.atha.csf.dto.CreateCallForServiceRequestDto;
import com.github.atha.csf.entity.CallForService;

public interface CallForServiceService {

  CallForService create(CreateCallForServiceRequestDto createRequestDto);
}
