package com.fq.framework.schedule.support.task;

import com.fq.framework.schedule.domain.TaskInfo;
import org.quartz.SchedulerException;

/**
 * @author wangxiaohong
 */
public interface ITaskEntityManager {
    /**
     * 整个调度器 容器启动
     *
     * @throws SchedulerException
     */
    public void startup() throws SchedulerException;

    //启动某个 任务
    public void startup(TaskInfo taskInfo);

    //暂停 某个 任务
    public void pause(TaskInfo taskInfo);

    //删除 某个 任务
    void delete(TaskInfo taskInfo);
}
