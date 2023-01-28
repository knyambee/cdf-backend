package com.knyambe.cdfbackend.funding.general;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource(path = "recentapplications")
@CrossOrigin
public interface FundsRepository extends CrudRepository<Funds, Long> {
    List<Funds> findByUserId(String userId);

    Funds findByTaskId(String taskId);
}
