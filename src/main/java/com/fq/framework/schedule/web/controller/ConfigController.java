package com.fq.framework.schedule.web.controller;

import com.fq.framework.schedule.domain.JobType;
import com.fq.framework.schedule.web.ExtMessage;
import com.fq.framework.schedule.web.FieldUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/**
 * 通用配置  资源
 *
 * @author wangxiaohong
 */
@Controller
public class ConfigController extends BaseController {

    /**
     * 系统运行时 软件配置
     */
    @RequestMapping("/environment/init")
    public Model model(Model model, HttpServletRequest request) {
        model.addAttribute("contextPath", request.getContextPath());
        model.addAttribute("js", new ArrayList<String>());
        model.addAttribute("css", new ArrayList<String>());
        model.addAttribute("id", UUID.randomUUID().toString());
        return model;
    }

    /**
     * 支持 远程JOb 类型
     */
    @RequestMapping("/environment/jobTypeList")
    public ExtMessage getJobTypeList() {
        return extMessageBuilder.createResults(FieldUtils.convertToList(JobType.values()));
    }
}
