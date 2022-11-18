package com.knyambe.cdfbackend.funding.communityProjects;

import com.knyambe.cdfbackend.funding.general.FundsRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommunityProjectsHandlerConfiguration {
    private final FundsRepository fundsRepository;

    public CommunityProjectsHandlerConfiguration(FundsRepository fundsRepository) {
        super();
        this.fundsRepository = fundsRepository;
    }

    @Bean
    public CommunityProjectsEventHandler communityProjectsEventHandler() {
        return new CommunityProjectsEventHandler(fundsRepository);
    }
}
