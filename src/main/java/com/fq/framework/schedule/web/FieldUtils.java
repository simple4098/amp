package com.fq.framework.schedule.web;


import com.fq.framework.schedule.support.EnumUtils;
import com.fq.framework.schedule.support.MessageSource;

import java.util.ArrayList;
import java.util.List;

/**
 * 字段工具类 ，用于封装字段 类型对象
 * @author wangxiaohong
 */
public abstract class FieldUtils {
    /**
     * 将枚举对象 转化为字段对象
     * @param enums 待转化的枚举对象
     */
    public static List<Field> convertToList(Enum[] enums) {
        List<Field> fieldList = new ArrayList<Field>();
        for (Enum e : enums) {
            fieldList.add(new Field(MessageSource.lan(EnumUtils.getFullName(e)),e.name()));
        }
        return fieldList;
    }
}
