package com.github.atha.csf_search.repository;

import com.github.atha.csf_search.entity.CallForService;
import java.time.Instant;
import java.util.List;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CallForServiceRepository extends PagingAndSortingRepository<CallForService, String> {

  List<CallForService> findAllByEventTimeBetween(Instant startDate, Instant endDate, PageRequest pageRequest);

}
