package com.fq.framework.schedule.web;

import java.util.List;

/**
 * 消息封装类，用于常用消息体的封装
 * @author wangxiaohong
 */
public final class ExtMessageBuilder {
    private ExtMessage extMessage;


    public ExtMessageBuilder() {
        extMessage = new ExtMessage();
    }

    public static ExtMessageBuilder newMessageBuilder() {
        return new ExtMessageBuilder();
    }

    public ExtMessage createMessage(String message) {
        extMessage.setMsg(message);
        return extMessage;
    }
    public ExtMessage createResults(List list){
        extMessage.setResults(list);
        return extMessage;
    }

    public ExtMessage createResults(List appLogs, int totalCount) {
        extMessage.setTotalCount(totalCount);
        return createResults(appLogs);
    }
}
