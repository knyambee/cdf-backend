package com.knyambe.cdfbackend.workflow.minister;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class MinisterRejection implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("Rejected by the minister");
    }
}
