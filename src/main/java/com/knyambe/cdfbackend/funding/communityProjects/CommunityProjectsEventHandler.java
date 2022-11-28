package com.knyambe.cdfbackend.funding.communityProjects;

import com.knyambe.cdfbackend.funding.general.Funds;
import com.knyambe.cdfbackend.funding.general.FundsRepository;
import com.knyambe.cdfbackend.security.User;
import com.knyambe.cdfbackend.security.UserRepository;
import org.flowable.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@RepositoryEventHandler
public class CommunityProjectsEventHandler {
    Logger logger = Logger.getLogger("Class CommunityProjectsEventHandler");
    @Autowired
    private RuntimeService runtimeService;
    private final FundsRepository fundsRepository;
    private final UserRepository userRepository;

    public CommunityProjectsEventHandler(FundsRepository fundsRepository, UserRepository userRepository) {
        this.fundsRepository = fundsRepository;
        this.userRepository = userRepository;
    }

    @HandleAfterCreate
    public void invokeWorkflow(CommunityProjects communityProjects) {
        logger.info("Invoking workflow for community project Reference no: " + communityProjects.getReferenceNo());

        Funds newEntry = new Funds(
                communityProjects.getReferenceNo(),
                "Community project",
                communityProjects.getStatus(),
                communityProjects.getEstimatedCost(),
                communityProjects.getUserId());
        fundsRepository.save(newEntry);

        // Find backend user to work on task.
        User wardCommittee = new User("2c1b8963-902d-49bb-91e6-ed28f515a967");
        if(!userRepository.existsById("2c1b8963-902d-49bb-91e6-ed28f515a967")) {
            userRepository.save(wardCommittee);
        }

        Map<String, Object> variables = new HashMap<>();
        variables.put("wardCommittee", wardCommittee);
        variables.put("communityProject", communityProjects);
        runtimeService.startProcessInstanceByKey("communityProjectTask", variables);
    }

}
