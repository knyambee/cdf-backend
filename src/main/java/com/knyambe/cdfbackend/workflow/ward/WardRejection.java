package com.knyambe.cdfbackend.workflow.ward;

import org.springframework.stereotype.Service;

@Service
public class WardRejection {

    public void sendWardRejectionEmail() {
        System.out.println("Application rejected at ward level");
    }
}
