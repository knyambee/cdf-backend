package com.knyambe.cdfbackend.workflow.localgovernment;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class LocalGovernmentApproval implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("Approved: Moving to the Minister");
    }
}
