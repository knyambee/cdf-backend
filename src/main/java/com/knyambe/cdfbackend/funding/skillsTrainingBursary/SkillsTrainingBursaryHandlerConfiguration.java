package com.knyambe.cdfbackend.funding.skillsTrainingBursary;

import com.knyambe.cdfbackend.security.UserRepository;
import org.flowable.engine.RuntimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SkillsTrainingBursaryHandlerConfiguration {

    private final UserRepository userRepository;
    private final RuntimeService runtimeService;

    public SkillsTrainingBursaryHandlerConfiguration(UserRepository userRepository, RuntimeService runtimeService) {
        super();
        this.userRepository = userRepository;
        this.runtimeService = runtimeService;
    }

    @Bean
    SkillsTrainingBursaryEventHandler skillsTrainingBursaryEventHandler() {
        return new SkillsTrainingBursaryEventHandler(runtimeService, userRepository);
    }
}
