package com.knyambe.cdfbackend.workflow;

import com.knyambe.cdfbackend.funding.communityProjects.CommunityProjects;
import com.knyambe.cdfbackend.security.User;
import lombok.Data;

import java.util.Date;

@Data
public class FundingTask {
    String taskId;
    String taskName;
    Date dateCreated;
    CommunityProjects taskDetails;
    User approver;

    public FundingTask(String id, String name, Date dateCreated, CommunityProjects communityProject, User approver) {
        this.taskId = id;
        this.taskName = name;
        this.dateCreated = dateCreated;
        this.taskDetails = communityProject;
        this.approver = approver;
    }
}
