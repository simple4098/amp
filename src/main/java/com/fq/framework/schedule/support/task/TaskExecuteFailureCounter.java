package com.fq.framework.schedule.support.task;

import com.fq.framework.schedule.support.Counter;
import com.fq.framework.schedule.support.DefaultCounter;

import java.util.HashMap;
import java.util.Map;

/**
 * 调度失败 计数器
 *  @author wangxiaohong
 */
public class TaskExecuteFailureCounter {
    private Map<String, DefaultCounter> taskCounterMap = new HashMap<String, DefaultCounter>();

    public void increment(String taskId) {
        if (taskCounterMap.get(taskId) == null) {
            reset(taskId);
        } else {
            Counter counter = taskCounterMap.get(taskId);
            counter.increment(1);
        }

    }
    public boolean exist(String taskId){
        return  null!=taskCounterMap.get(taskId);
    }

    public long getIncrement(String taskId) {
        Counter counter = taskCounterMap.get(taskId);
        return counter.increment();
    }

    public void reset(String taskId) {
        taskCounterMap.put(taskId, new DefaultCounter());
    }
}
