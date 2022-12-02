package com.knyambe.cdfbackend.funding.communityProjects;

import com.knyambe.cdfbackend.funding.general.Funds;
import com.knyambe.cdfbackend.funding.general.FundsRepository;
import com.knyambe.cdfbackend.security.User;
import com.knyambe.cdfbackend.security.keycloak.KeycloakAdminClientService;
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
    private final KeycloakAdminClientService keycloakAdminClientService;

    public CommunityProjectsEventHandler(FundsRepository fundsRepository, KeycloakAdminClientService keycloakAdminClientService) {
        this.keycloakAdminClientService = keycloakAdminClientService;
        this.fundsRepository = fundsRepository;
    }

    @HandleAfterCreate
    public void invokeWorkflow(CommunityProjects communityProjects) {
        logger.info("Invoking workflow for community project Reference no: " + communityProjects.getReferenceNo());

        // Find backend users to work on task.
        User wardCommittee = keycloakAdminClientService.getUser("ward");
        User constituencyCommittee = keycloakAdminClientService.getUser("constituency");
        User localGov = keycloakAdminClientService.getUser("local_authority");
        User minister = keycloakAdminClientService.getUser("minister");

        Map<String, Object> variables = new HashMap<>();
        variables.put("wardCommittee", wardCommittee);
        variables.put("constituencyCommittee", constituencyCommittee);
        variables.put("localGov", localGov);
        variables.put("minister", minister);

        variables.put("communityProject", communityProjects);

        runtimeService.startProcessInstanceByKey("communityProjectTask", variables);

        Funds newEntry = new Funds(communityProjects.getReferenceNo(), "Community Project", communityProjects.getEstimatedCost(), communityProjects.getUserId());
        fundsRepository.save(newEntry);
    }

}
