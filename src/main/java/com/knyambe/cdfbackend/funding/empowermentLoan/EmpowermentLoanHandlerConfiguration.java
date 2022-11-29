package com.knyambe.cdfbackend.funding.empowermentLoan;

import com.knyambe.cdfbackend.security.UserRepository;
import org.flowable.engine.RuntimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpowermentLoanHandlerConfiguration {
    private final UserRepository userRepository;
    private final RuntimeService runtimeService;

    public EmpowermentLoanHandlerConfiguration(UserRepository userRepository, RuntimeService runtimeService) {
        super();
        this.userRepository = userRepository;
        this.runtimeService = runtimeService;
    }

    @Bean
    EmpowermentLoanEventHandler empowermentLoanEventHandler() {
        return new EmpowermentLoanEventHandler(userRepository, runtimeService);
    }
}
