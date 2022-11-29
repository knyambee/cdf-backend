package com.knyambe.cdfbackend.funding.skillsTrainingBursary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path="skillstrainingbursary")
@CrossOrigin
public interface SkillsTrainingBursaryRepository extends CrudRepository<SkillsTrainingBursary, Long> {
}
