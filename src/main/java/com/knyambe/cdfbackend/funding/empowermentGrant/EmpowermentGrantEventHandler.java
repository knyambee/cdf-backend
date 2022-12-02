package com.knyambe.cdfbackend.funding.empowermentGrant;

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
public class EmpowermentGrantEventHandler {
    private final RuntimeService runtimeService;
    private final KeycloakAdminClientService keycloakAdminClientService;
    private final FundsRepository fundsRepository;

    public EmpowermentGrantEventHandler(RuntimeService runtimeService, KeycloakAdminClientService keycloakAdminClientService, FundsRepository fundsRepository) {
        this.runtimeService = runtimeService;
        this.keycloakAdminClientService = keycloakAdminClientService;
        this.fundsRepository = fundsRepository;
    }

    @HandleAfterCreate
    public void invokeWorkflow(EmpowermentGrant empowermentGrant ) {

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
        variables.put("empowermentGrant", empowermentGrant);

        runtimeService.startProcessInstanceByKey("empowermentGrantTask", variables);

        Funds newEntry = new Funds(empowermentGrant.getReferenceNo(), "Empowerment Grant", new BigDecimal(0), empowermentGrant.getUserId());
        fundsRepository.save(newEntry);
    }
}
