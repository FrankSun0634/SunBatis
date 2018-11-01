package com.ming.batis;

/**
 * Created by Sunshiming on 2018/11/1.
 */
public class Configuration {
    protected ExecutorType defaultExecutorType = ExecutorType.SIMPLE;

    public ExecutorType getExecuteType() {
        return defaultExecutorType;
    }
}
