package com.knyambe.cdfbackend.workflow.ward;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class WardApproval implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("Approved: Moving to community development committee");
    }
}
