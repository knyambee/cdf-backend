package com.knyambe.cdfbackend.funding.skillsTrainingBursary;

import com.knyambe.cdfbackend.security.User;
import com.knyambe.cdfbackend.security.UserRepository;
import org.flowable.engine.RuntimeService;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import java.util.HashMap;
import java.util.Map;

@RepositoryEventHandler
public class SkillsTrainingBursaryEventHandler {

    private final RuntimeService runtimeService;
    private final UserRepository userRepository;

    public SkillsTrainingBursaryEventHandler(RuntimeService runtimeService, UserRepository userRepository) {
        this.runtimeService = runtimeService;
        this.userRepository = userRepository;
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
    }
}
