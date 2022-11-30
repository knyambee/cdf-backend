package com.knyambe.cdfbackend.funding.communityProjects;

import com.knyambe.cdfbackend.security.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommunityProjectsHandlerConfiguration {
    private final UserRepository userRepository;

    public CommunityProjectsHandlerConfiguration(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Bean
    public CommunityProjectsEventHandler communityProjectsEventHandler() {
        return new CommunityProjectsEventHandler(userRepository);
    }
}
