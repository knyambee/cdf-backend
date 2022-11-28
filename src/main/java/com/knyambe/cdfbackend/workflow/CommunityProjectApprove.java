package com.knyambe.cdfbackend.workflow;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class CommunityProjectApprove implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("Community project application approved, it will now be passed to the community Development Committee");
    }
}
