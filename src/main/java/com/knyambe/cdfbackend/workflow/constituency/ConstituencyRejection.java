package com.knyambe.cdfbackend.workflow.constituency;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class ConstituencyRejection implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("Application rejected by CDC");
    }
}
