package com.knyambe.cdfbackend.funding.communityProjects;

import com.knyambe.cdfbackend.funding.general.FundsRepository;
import com.knyambe.cdfbackend.security.keycloak.KeycloakAdminClientService;
import com.knyambe.cdfbackend.workflow.WorkflowService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommunityProjectsHandlerConfiguration {
    private final KeycloakAdminClientService keycloakAdminClientService;
    private final FundsRepository fundsRepository;
    private final WorkflowService workflowService;

    public CommunityProjectsHandlerConfiguration(KeycloakAdminClientService keycloakAdminClientService, FundsRepository fundsRepository, WorkflowService workflowService) {
        super();
        this.keycloakAdminClientService = keycloakAdminClientService;
        this.fundsRepository = fundsRepository;
        this.workflowService = workflowService;
    }

    @Bean
    public CommunityProjectsEventHandler communityProjectsEventHandler() {
        return new CommunityProjectsEventHandler(fundsRepository, workflowService, keycloakAdminClientService);
    }
}
