package com.knyambe.cdfbackend.funding.empowermentLoan;

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

    public EmpowermentLoanEventHandler(UserRepository userRepository, RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
        this.userRepository =userRepository;
    }

    @HandleAfterCreate
    public void invokeWorkflow(EmpowermentLoan empowermentLoan ) {
        // Find backend user to work on task.
        User wardCommittee = new User("2c1b8963-902d-49bb-91e6-ed28f515a967");
        if(!userRepository.existsById("2c1b8963-902d-49bb-91e6-ed28f515a967")) {
            userRepository.save(wardCommittee);
        }

        Map<String, Object> variables = new HashMap<>();
        variables.put("wardCommittee", wardCommittee);
        variables.put("empowermentLoan", empowermentLoan);
        runtimeService.startProcessInstanceByKey("empowermentLoanTask", variables);
    }
}
