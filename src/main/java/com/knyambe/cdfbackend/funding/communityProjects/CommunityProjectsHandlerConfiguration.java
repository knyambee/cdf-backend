package com.knyambe.cdfbackend.funding.communityProjects;

import com.knyambe.cdfbackend.funding.general.FundsRepository;
import com.knyambe.cdfbackend.security.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommunityProjectsHandlerConfiguration {
    private final FundsRepository fundsRepository;
    private final UserRepository userRepository;

    public CommunityProjectsHandlerConfiguration(FundsRepository fundsRepository, UserRepository userRepository) {
        super();
        this.fundsRepository = fundsRepository;
        this.userRepository = userRepository;
    }

    @Bean
    public CommunityProjectsEventHandler communityProjectsEventHandler() {
        return new CommunityProjectsEventHandler(fundsRepository, userRepository);
    }
}
