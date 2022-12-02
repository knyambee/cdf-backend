package com.knyambe.cdfbackend.funding.communityProjects;

import com.knyambe.cdfbackend.funding.general.FundsRepository;
import com.knyambe.cdfbackend.security.keycloak.KeycloakAdminClientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommunityProjectsHandlerConfiguration {
    private final KeycloakAdminClientService keycloakAdminClientService;
    private final FundsRepository fundsRepository;

    public CommunityProjectsHandlerConfiguration(KeycloakAdminClientService keycloakAdminClientService, FundsRepository fundsRepository) {
        super();
        this.keycloakAdminClientService = keycloakAdminClientService;
        this.fundsRepository = fundsRepository;
    }

    @Bean
    public CommunityProjectsEventHandler communityProjectsEventHandler() {
        return new CommunityProjectsEventHandler(fundsRepository, keycloakAdminClientService);
    }
}
