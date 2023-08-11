package com.douzone.prosync.task.dto;

import com.douzone.prosync.status.TaskStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

public class TaskResponse {

    @Getter
    @Setter
    @NoArgsConstructor
    public static class GetTaskResponse {
        private Integer taskId;
        private String classification;
        private String title;
        private String detail;
        private String startDate;
        private String endDate;
        private TaskStatus taskStatus;

        private LocalDateTime createdAt;
        private LocalDateTime modifiedAt;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    public static class GetTasksResponse {
        private Integer taskId;
        private String classification;
        private String title;
        private String startDate;
        private String endDate;
        private TaskStatus taskStatus;
        private LocalDateTime modifiedAt;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    public static class SimpleResponse {
        private Integer taskId;
    }
}
