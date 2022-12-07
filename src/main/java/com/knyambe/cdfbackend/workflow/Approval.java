package com.knyambe.cdfbackend.workflow;

import lombok.Data;

@Data
public class Approval {
    private String id;
    private boolean status;
    private String comment;
    private String processesInstanceId;
}
