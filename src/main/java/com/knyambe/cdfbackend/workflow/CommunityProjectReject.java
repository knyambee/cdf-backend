package com.knyambe.cdfbackend.workflow;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class CommunityProjectReject implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("Community project application rejected. See comments for details!");
    }
}
