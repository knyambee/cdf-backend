package com.knyambe.cdfbackend.funding.communityProjects.repository;

import com.knyambe.cdfbackend.funding.communityProjects.models.CommunityProjects;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "communityprojects")
@CrossOrigin(origins = "http://localhost:3000")
public interface CommunityProjectsRepository extends CrudRepository<CommunityProjects, Long> {
}
