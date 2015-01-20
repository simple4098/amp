package com.fq.framework.schedule.support.task;

import com.fq.framework.schedule.domain.JobType;

/**
 * task 上下文 二次封装,主要用于 task 与 job打交道
 *
 * @author wangxiaohong
 */
public class TaskJobContext {
    private String taskId;
    private String uri;
    private JobType type;


    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public JobType getType() {
        return type;
    }

    public void setType(JobType type) {
        this.type = type;
    }
}
