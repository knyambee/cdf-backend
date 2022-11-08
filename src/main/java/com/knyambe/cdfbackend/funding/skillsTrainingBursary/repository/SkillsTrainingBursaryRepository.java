package com.knyambe.cdfbackend.funding.skillsTrainingBursary.repository;

import com.knyambe.cdfbackend.funding.skillsTrainingBursary.models.SkillsTrainingBursary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path="skillstrainingbursary")
@CrossOrigin(origins = "*")
public interface SkillsTrainingBursaryRepository extends CrudRepository<SkillsTrainingBursary, Long> {
}
