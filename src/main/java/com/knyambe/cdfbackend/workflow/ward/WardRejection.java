package com.knyambe.cdfbackend.workflow.ward;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class WardRejection implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("Application rejected at ward level");
    }
}
