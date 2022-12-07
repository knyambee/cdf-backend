package com.knyambe.cdfbackend.workflow;

import com.knyambe.cdfbackend.funding.communityProjects.CommunityProjects;
import com.knyambe.cdfbackend.funding.empowermentGrant.EmpowermentGrant;
import com.knyambe.cdfbackend.funding.empowermentLoan.EmpowermentLoan;
import com.knyambe.cdfbackend.funding.skillsTrainingBursary.SkillsTrainingBursary;
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

    @GetMapping("/tasks")
    public List<FundingTask> getTasks(@RequestParam String assignee) {
        List<Task> tasks = workflowService.getTasks(assignee);
        List<FundingTask> pendingTasks = new ArrayList<>();
        for (Task task : tasks) {
            Map<String, Object> processVariables = taskService.getVariables(task.getId());
            if (task.getName().contains("Community")) {
                pendingTasks.add(new FundingTask(task.getId(), task.getName(), task.getCreateTime(), (CommunityProjects) processVariables.get("communityProject"), (User) processVariables.get("wardCommittee")));
            } else if (task.getName().contains("Grant")) {
                pendingTasks.add(new FundingTask(task.getId(), task.getName(), task.getCreateTime(), (EmpowermentGrant) processVariables.get("empowermentGrant"), (User) processVariables.get("wardCommittee")));
            } else if (task.getName().contains("Loan")) {
                pendingTasks.add(new FundingTask(task.getId(), task.getName(), task.getCreateTime(),  (EmpowermentLoan) processVariables.get("empowermentLoan"), (User) processVariables.get("wardCommittee")));
            } else if (task.getName().contains("Skills")) {
                pendingTasks.add(new FundingTask(task.getId(), task.getName(), task.getCreateTime(), (SkillsTrainingBursary) processVariables.get("skillsTrainingBursary"), (User) processVariables.get("wardCommittee")));
            }
        }
        return pendingTasks;
    }

    @PostMapping("/approve")
    public void approveFundingApplication(@RequestBody Approval approval) {
        Task ongoingTask = workflowService.getTask(approval.getId());
        taskService.addComment(approval.getId(), ongoingTask.getProcessInstanceId(), approval.getComment());
        workflowService.submitApproval(approval);
    }

}