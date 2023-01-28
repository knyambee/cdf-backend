package com.knyambe.cdfbackend.funding.communityProjects;

import com.knyambe.cdfbackend.funding.general.Funds;
import com.knyambe.cdfbackend.funding.general.FundsRepository;
import com.knyambe.cdfbackend.security.User;
import com.knyambe.cdfbackend.security.keycloak.KeycloakAdminClientService;
import com.knyambe.cdfbackend.workflow.WorkflowService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.history.HistoricProcessInstance;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
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
    private final WorkflowService workflowService;
    private final KeycloakAdminClientService keycloakAdminClientService;

    public CommunityProjectsEventHandler(FundsRepository fundsRepository, WorkflowService workflowService, KeycloakAdminClientService keycloakAdminClientService) {
        this.workflowService = workflowService;
        this.keycloakAdminClientService = keycloakAdminClientService;
        this.fundsRepository = fundsRepository;
    }

    @HandleAfterCreate
    public void postToGeneralFunds(CommunityProjects communityProjects) {
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
        variables.put("referenceNo", communityProjects.getReferenceNo());

        runtimeService.startProcessInstanceByKey("communityProjectTask", variables);

        // find created task and save with the new reference number.
        HistoricProcessInstance newCommunityProjectTask = workflowService.getTaskByReferenceNumber(communityProjects.getReferenceNo());
        Funds newEntry = new Funds(communityProjects.getReferenceNo(), "Community Project", communityProjects.getEstimatedCost(), communityProjects.getUserId(), newCommunityProjectTask.getSuperProcessInstanceId());
        fundsRepository.save(newEntry);
    }

}
