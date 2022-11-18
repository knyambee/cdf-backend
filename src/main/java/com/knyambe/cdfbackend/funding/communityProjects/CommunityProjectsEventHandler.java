package com.knyambe.cdfbackend.funding.communityProjects;

import com.knyambe.cdfbackend.funding.general.Funds;
import com.knyambe.cdfbackend.funding.general.FundsRepository;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import java.util.Date;
import java.util.logging.Logger;

@RepositoryEventHandler
public class CommunityProjectsEventHandler {
    Logger logger = Logger.getLogger("Class CommunityProjectsEventHandler");
    private final FundsRepository fundsRepository;

    public CommunityProjectsEventHandler(FundsRepository fundsRepository) {
        this.fundsRepository = fundsRepository;
    }


    @HandleAfterCreate
    public void postToGeneralFunds(CommunityProjects communityProjects) {
        logger.info("Persist to funds.");
        Funds funds = new Funds();
        funds.setStatus(0);
        funds.setReferenceNo(communityProjects.getReferenceNo());
        funds.setFundType("Community project");
        funds.setUserId(communityProjects.getUserId());
        funds.setDateSubmitted(new Date());
        funds.setAmount(communityProjects.getEstimatedCost());

        fundsRepository.save(funds);
    }
}
