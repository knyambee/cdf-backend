package com.knyambe.cdfbackend.workflow;

import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class TasksController {
    @Autowired
    private WorkflowService workflowService;

    @GetMapping(value = "/tasks")
    public List<TaskRepresentation> getTasks(@RequestParam String assignee) {
        List<Task> tasks = workflowService.getTasks(assignee);
        List<TaskRepresentation> taskResults = new ArrayList<>();
        for (Task task : tasks) {
            taskResults.add(new TaskRepresentation(task.getId(), task.getName(), task.getCreateTime()));
        }
        return taskResults;
    }
}