package com.knyambe.cdfbackend.workflow;

import com.knyambe.cdfbackend.funding.communityProjects.CommunityProjects;
import com.knyambe.cdfbackend.security.User;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class TasksController {
    private final WorkflowService workflowService;

    private final TaskService taskService;

    public TasksController(WorkflowService workflowService, TaskService taskService) {
        this.workflowService = workflowService;
        this.taskService = taskService;
    }

    @GetMapping( "/tasks")
    public List<FundingTask> getTasks(@RequestParam String assignee) {
        List<Task> tasks = workflowService.getTasks(assignee);
        List<FundingTask> dtos = new ArrayList<>();
        for (Task task : tasks) {
            Map<String, Object> processVariables = taskService.getVariables(task.getId());
            dtos.add(new FundingTask(task.getId(), task.getName(), task.getCreateTime(), (CommunityProjects) processVariables.get("communityProject"), (User) processVariables.get("wardCommittee")));
        }
        return dtos;
    }
    @PostMapping("/approve")
    public void approveHolidayRequest(@RequestBody Approval approval) {
        workflowService.submitApproval(approval);
    }

}