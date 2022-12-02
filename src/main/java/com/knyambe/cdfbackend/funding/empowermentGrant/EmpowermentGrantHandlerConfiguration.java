package com.knyambe.cdfbackend.funding.empowermentGrant;

import com.knyambe.cdfbackend.funding.general.FundsRepository;
import com.knyambe.cdfbackend.security.keycloak.KeycloakAdminClientService;
import org.flowable.engine.RuntimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpowermentGrantHandlerConfiguration {

    private final RuntimeService runtimeService;
    private final FundsRepository fundsRepository;
    private final KeycloakAdminClientService keycloakAdminClientService;

    public EmpowermentGrantHandlerConfiguration(RuntimeService runtimeService, FundsRepository fundsRepository, KeycloakAdminClientService keycloakAdminClientService) {
        super();
        this.keycloakAdminClientService = keycloakAdminClientService;
        this.runtimeService = runtimeService;
        this.fundsRepository = fundsRepository;
    }

    @Bean
    EmpowermentGrantEventHandler empowermentGrantEventHandler () {
        return new EmpowermentGrantEventHandler (runtimeService, keycloakAdminClientService, fundsRepository);
    }
}
