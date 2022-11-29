package com.knyambe.cdfbackend.funding.empowermentGrant;

import com.knyambe.cdfbackend.security.UserRepository;
import org.flowable.engine.RuntimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpowermentGrantHandlerConfiguration {

    private final UserRepository userRepository;
    private final RuntimeService runtimeService;

    public EmpowermentGrantHandlerConfiguration(UserRepository userRepository, RuntimeService runtimeService) {
        super();
        this.userRepository = userRepository;
        this.runtimeService = runtimeService;
    }

    @Bean
    EmpowermentGrantEventHandler empowermentGrantEventHandler () {
        return new EmpowermentGrantEventHandler (runtimeService, userRepository);
    }
}
