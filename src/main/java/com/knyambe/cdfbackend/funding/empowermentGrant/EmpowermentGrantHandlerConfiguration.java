package com.knyambe.cdfbackend.funding.empowermentGrant;

import com.knyambe.cdfbackend.funding.general.FundsRepository;
import com.knyambe.cdfbackend.security.UserRepository;
import org.flowable.engine.RuntimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpowermentGrantHandlerConfiguration {

    private final UserRepository userRepository;
    private final RuntimeService runtimeService;
    private final FundsRepository fundsRepository;

    public EmpowermentGrantHandlerConfiguration(UserRepository userRepository, RuntimeService runtimeService, FundsRepository fundsRepository) {
        super();
        this.userRepository = userRepository;
        this.runtimeService = runtimeService;
        this.fundsRepository = fundsRepository;
    }

    @Bean
    EmpowermentGrantEventHandler empowermentGrantEventHandler () {
        return new EmpowermentGrantEventHandler (runtimeService, userRepository, fundsRepository);
    }
}
