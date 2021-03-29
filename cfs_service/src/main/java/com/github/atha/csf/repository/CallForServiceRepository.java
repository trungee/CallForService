package com.github.atha.csf.repository;

import com.github.atha.csf.entity.CallForService;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface CallForServiceRepository extends CrudRepository<CallForService, UUID> {

}
