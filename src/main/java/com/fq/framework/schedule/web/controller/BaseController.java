package com.fq.framework.schedule.web.controller;


import com.fq.framework.schedule.web.ExtMessageBuilder;

/**
 * 控制器基类
 * @author wangxiaohong
 */
public class BaseController {
    //消息构建
    protected ExtMessageBuilder extMessageBuilder = ExtMessageBuilder.newMessageBuilder();
}
