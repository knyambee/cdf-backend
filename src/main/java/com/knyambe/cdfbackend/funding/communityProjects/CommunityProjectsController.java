package com.knyambe.cdfbackend.funding.communityProjects;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CommunityProjectsController {
    private final CommunityProjectsRepository communityProjectsRepository;

    CommunityProjectsController(CommunityProjectsRepository communityProjectsRepository) {
        this.communityProjectsRepository = communityProjectsRepository;
    }

}
