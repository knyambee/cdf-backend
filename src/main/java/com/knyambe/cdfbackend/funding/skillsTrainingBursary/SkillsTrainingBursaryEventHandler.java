package com.knyambe.cdfbackend.funding.skillsTrainingBursary;

import com.knyambe.cdfbackend.funding.general.Funds;
import com.knyambe.cdfbackend.funding.general.FundsRepository;
import com.knyambe.cdfbackend.security.User;
import com.knyambe.cdfbackend.security.keycloak.KeycloakAdminClientService;
import org.flowable.engine.RuntimeService;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RepositoryEventHandler
public class SkillsTrainingBursaryEventHandler {

    private final RuntimeService runtimeService;
    private final FundsRepository fundsRepository;
    private final KeycloakAdminClientService keycloakAdminClientService;


    public SkillsTrainingBursaryEventHandler(RuntimeService runtimeService, FundsRepository fundsRepository, KeycloakAdminClientService keycloakAdminClientService) {
        this.runtimeService = runtimeService;
        this.keycloakAdminClientService = keycloakAdminClientService;
        this.fundsRepository = fundsRepository;
    }

    @HandleAfterCreate
    public void invokeWorkflow(SkillsTrainingBursary skillsTrainingBursary ) {
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
        variables.put("skillsTrainingBursary", skillsTrainingBursary);

        runtimeService.startProcessInstanceByKey("skillsDevelopmentBursaryTask", variables);

//        Funds newEntry = new Funds(skillsTrainingBursary.getReferenceNo(), "Skills Development Bursary", new BigDecimal(0), skillsTrainingBursary.getUserId());
//        fundsRepository.save(newEntry);
    }
}
