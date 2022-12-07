package com.knyambe.cdfbackend.workflow;

import org.flowable.engine.HistoryService;
import org.flowable.engine.TaskService;
import org.flowable.engine.history.HistoricActivityInstance;
import org.flowable.task.api.Task;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class WorkflowService {

    private final TaskService taskService;
    private final HistoryService historyService;

    public WorkflowService(TaskService taskService, HistoryService historyService) {
        this.taskService = taskService;
        this.historyService = historyService;
    }

    public List<Task> getTasks(String assignee) {
        return taskService.createTaskQuery().taskAssignee(assignee).list();
    }


    public void submitApproval(Approval approval) {
        Map<String, Object> variables = new HashMap<>();
        variables.put("approved", approval.isStatus());
        taskService.complete(approval.getId(), variables);
    }

    public Task getTask(String taskId) {
        return taskService.createTaskQuery()
                .taskId(taskId).singleResult();
    }
}
