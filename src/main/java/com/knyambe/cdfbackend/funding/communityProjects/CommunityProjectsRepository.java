package com.knyambe.cdfbackend.funding.communityProjects;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "communityprojects")
@CrossOrigin
public interface CommunityProjectsRepository extends CrudRepository<CommunityProjects, Long> {
    List<CommunityProjects> findByUserId(String userId);
}
