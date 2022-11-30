package com.knyambe.cdfbackend.funding.empowermentLoan;

import com.knyambe.cdfbackend.funding.general.Funds;
import com.knyambe.cdfbackend.funding.general.FundsRepository;
import com.knyambe.cdfbackend.security.User;
import com.knyambe.cdfbackend.security.UserRepository;
import org.flowable.engine.RuntimeService;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import java.util.HashMap;
import java.util.Map;

@RepositoryEventHandler
public class EmpowermentLoanEventHandler {
    private final RuntimeService runtimeService;
    private final UserRepository userRepository;
    private final FundsRepository fundsRepository;

    public EmpowermentLoanEventHandler(UserRepository userRepository, RuntimeService runtimeService, FundsRepository fundsRepository) {
        this.runtimeService = runtimeService;
        this.userRepository =userRepository;
        this.fundsRepository = fundsRepository;
    }

    @HandleAfterCreate
    public void invokeWorkflow(EmpowermentLoan empowermentLoan ) {
        // Find backend users to work on task.
        User wardCommittee = userRepository.findByUsername("wardCommittee");
        User constituencyCommittee = userRepository.findByUsername("constituencyCommittee");
        User localGov = userRepository.findByUsername("localGov");
        User minister = userRepository.findByUsername("minister");

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