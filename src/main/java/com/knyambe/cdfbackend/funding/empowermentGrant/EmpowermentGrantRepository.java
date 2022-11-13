package com.knyambe.cdfbackend.funding.empowermentGrant;

import com.knyambe.cdfbackend.funding.empowermentGrant.EmpowermentGrant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "empowermentgrants")
@CrossOrigin
public interface EmpowermentGrantRepository extends CrudRepository<EmpowermentGrant, Long> {
}
