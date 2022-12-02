package com.knyambe.cdfbackend.funding.empowermentLoan;

import com.knyambe.cdfbackend.funding.general.Funds;
import com.knyambe.cdfbackend.funding.general.FundsRepository;
import com.knyambe.cdfbackend.security.User;
import com.knyambe.cdfbackend.security.keycloak.KeycloakAdminClientService;
import org.flowable.engine.RuntimeService;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import java.util.HashMap;
import java.util.Map;

@RepositoryEventHandler
public class EmpowermentLoanEventHandler {
    private final RuntimeService runtimeService;
    private final FundsRepository fundsRepository;
    private final KeycloakAdminClientService keycloakAdminClientService;

    public EmpowermentLoanEventHandler(RuntimeService runtimeService, FundsRepository fundsRepository, KeycloakAdminClientService keycloakAdminClientService) {
        this.runtimeService = runtimeService;
        this.fundsRepository = fundsRepository;
        this.keycloakAdminClientService = keycloakAdminClientService;
    }

    @HandleAfterCreate
    public void invokeWorkflow(EmpowermentLoan empowermentLoan ) {
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
        variables.put("empowermentLoan", empowermentLoan);

        runtimeService.startProcessInstanceByKey("empowermentLoanTask", variables);

        Funds newEntry = new Funds(empowermentLoan.getReferenceNo(), "Empowerment Loan", empowermentLoan.getLoanAmount(), empowermentLoan.getUserId());
        fundsRepository.save(newEntry);
    }
}
