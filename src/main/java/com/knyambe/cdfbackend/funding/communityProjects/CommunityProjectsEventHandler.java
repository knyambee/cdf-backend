package com.knyambe.cdfbackend.funding.communityProjects;

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
    private final UserRepository userRepository;

    public CommunityProjectsEventHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @HandleAfterCreate
    public void invokeWorkflow(CommunityProjects communityProjects) {
        logger.info("Invoking workflow for community project Reference no: " + communityProjects.getReferenceNo());

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

        variables.put("communityProject", communityProjects);

        runtimeService.startProcessInstanceByKey("communityProjectTask", variables);
    }

}
