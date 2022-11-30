package com.knyambe.cdfbackend.funding.skillsTrainingBursary;

import com.knyambe.cdfbackend.funding.general.Funds;
import com.knyambe.cdfbackend.funding.general.FundsRepository;
import com.knyambe.cdfbackend.security.User;
import com.knyambe.cdfbackend.security.UserRepository;
import org.flowable.engine.RuntimeService;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RepositoryEventHandler
public class SkillsTrainingBursaryEventHandler {

    private final RuntimeService runtimeService;
    private final UserRepository userRepository;
    private final FundsRepository fundsRepository;

    public SkillsTrainingBursaryEventHandler(RuntimeService runtimeService, UserRepository userRepository, FundsRepository fundsRepository) {
        this.runtimeService = runtimeService;
        this.userRepository = userRepository;
        this.fundsRepository = fundsRepository;
    }

    @HandleAfterCreate
    public void invokeWorkflow(SkillsTrainingBursary skillsTrainingBursary ) {
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
        variables.put("skillsTrainingBursary", skillsTrainingBursary);

        runtimeService.startProcessInstanceByKey("skillsDevelopmentBursaryTask", variables);

        Funds newEntry = new Funds(skillsTrainingBursary.getReferenceNo(), "Skills Development Bursary", new BigDecimal(0), skillsTrainingBursary.getUserId());
        fundsRepository.save(newEntry);
    }
}
