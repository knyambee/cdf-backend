package com.knyambe.cdfbackend.funding.empowermentLoan.repository;

import com.knyambe.cdfbackend.funding.empowermentLoan.models.EmpowermentLoan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "empowermentloans")
@CrossOrigin(origins = "*")
public interface EmpowermentLoanRepository extends CrudRepository<EmpowermentLoan, Long> {
}
