package com.fq.framework.schedule.support.job;
import com.fq.framework.schedule.support.task.TaskJobContext;
import org.quartz.JobExecutionContext;

/**
 * User: Administrator
 * Date: 14-1-28
 * Time: 上午10:15
 */
public interface TaskJobHandler {
    public boolean supports(TaskJobContext meta);
    public void handle(JobExecutionContext context, TaskJobContext meta) throws Exception;
}
