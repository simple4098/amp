package com.fq.framework.schedule.dao;


import com.fq.framework.schedule.domain.TaskInfo;
import com.fq.framework.schedule.dto.TaskInfoDto;
import com.fq.framework.schedule.support.Pagination;

import java.util.List;

/**
 * @author wangxiaohong
 */
public interface ITaskEntityDao {
    public List<TaskInfoDto> findList(Pagination<TaskInfoDto> param);

    void create(TaskInfo taskInfo);

    TaskInfoDto findById(String taskId);

    void deleteBy(String id);

    void update(TaskInfo taskInfo);
}
