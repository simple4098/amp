package com.fq.framework.schedule.support.job;

import com.fq.framework.schedule.support.task.TaskJobContext;
import org.quartz.JobExecutionContext;

/**
 * @author wangxiaohong
 */
public interface TaskJobHandler {
    boolean supports(TaskJobContext meta);

    void handle(JobExecutionContext context, TaskJobContext meta) throws Exception;
}
