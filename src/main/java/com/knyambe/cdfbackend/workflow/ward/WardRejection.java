package com.knyambe.cdfbackend.workflow.ward;

import com.knyambe.cdfbackend.workflow.WorkflowService;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;

public class WardRejection implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {

        System.out.println("Application rejected at ward level");
    }
}
