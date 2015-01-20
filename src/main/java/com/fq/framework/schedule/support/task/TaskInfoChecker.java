package com.fq.framework.schedule.support.task;

import com.fq.framework.schedule.domain.TaskInfo;
import com.fq.framework.schedule.domain.TaskStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * @author wangxiaohong
 */
@Component
public class TaskInfoChecker {
    public void checkBeforeUpdate(TaskInfo taskInfo){
        if(taskInfo.getStatus()!=null&&!taskInfo.getStatus().equals(TaskStatus.PAUSED)){
              throw new RuntimeException("操作失败[请先暂停该任务]");
        }
    }
      public void checkBeforeDelete(TaskInfo taskInfo){
        TaskStatus taskStatus=taskInfo.getStatus();
        if(taskStatus!=null && !(TaskStatus.PAUSED.equals(taskStatus)
                || TaskStatus.DELETED.equals(taskStatus)
                || TaskStatus.ERROR.equals(taskStatus)
                || TaskStatus.PAUSED_BLOCKED.equals(taskStatus))){
            throw new RuntimeException("操作失败[请先暂停该任务]");
        }
    }

    public void checkBeforeStart(TaskInfo taskInfo){
       TaskStatus taskStatus=taskInfo.getStatus();
       if(taskStatus!=null &&!(TaskStatus.PAUSED.equals(taskStatus)
               || TaskStatus.DELETED.equals(taskStatus)
               || TaskStatus.ERROR.equals(taskStatus)
               || TaskStatus.PAUSED_BLOCKED.equals(taskStatus))){
            throw new RuntimeException("操作失败[该任务已启动]");
       }
    }
}
