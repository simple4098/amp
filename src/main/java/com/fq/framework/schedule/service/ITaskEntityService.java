package com.fq.framework.schedule.service;

import com.fq.framework.schedule.domain.TaskInfo;
import com.fq.framework.schedule.dto.TaskInfoDto;
import com.fq.framework.schedule.support.Pagination;

import java.util.List;

/**
 * @author wangxiaohong
 */
public interface ITaskEntityService {
    List<TaskInfoDto> findList(Pagination<TaskInfoDto> param);

    void create(TaskInfo taskInfo);

    TaskInfo findById(String taskId);

    void startup(String id);

    void pause(String id);

    void delete(String id);

    void update(TaskInfo taskInfo);
}
