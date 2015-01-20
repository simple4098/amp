package com.fq.framework.schedule.support;

/**
 * User: Administrator
 * Date: 14-1-27
 * Time: 上午10:04
 */
public class EnumUtils {
    public static String getFullName(Enum e) {
        StringBuilder stringBuilder = new StringBuilder(e.getClass().getName());
        stringBuilder.append(".").append(e.name());
        return stringBuilder.toString();
    }
}
