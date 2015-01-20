package com.fq.framework.schedule.support;

/**
 * User: Administrator
 * Date: 14-1-24
 * Time: 下午1:24
 */
public interface Counter {
    long increment(long amount);

    long increment();
}
