package com.knyambe.cdfbackend.funding.communityProjects;

import com.knyambe.cdfbackend.funding.general.FundsRepository;
import com.knyambe.cdfbackend.security.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommunityProjectsHandlerConfiguration {
    private final UserRepository userRepository;
    private final FundsRepository fundsRepository;

    public CommunityProjectsHandlerConfiguration(UserRepository userRepository, FundsRepository fundsRepository) {
        super();
        this.userRepository = userRepository;
        this.fundsRepository = fundsRepository;
    }

    @Bean
    public CommunityProjectsEventHandler communityProjectsEventHandler() {
        return new CommunityProjectsEventHandler(userRepository, fundsRepository);
    }
}
