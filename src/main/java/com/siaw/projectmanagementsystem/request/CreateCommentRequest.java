package com.siaw.projectmanagementsystem.request;

import lombok.Data;

@Data
public class CreateCommentRequest {

    private Long issueId;
    private String content;
}
