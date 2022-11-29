package com.knyambe.cdfbackend.workflow.localgovernment;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class LocalGovernmentRejection implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("Rejected at Local government");
    }
}
