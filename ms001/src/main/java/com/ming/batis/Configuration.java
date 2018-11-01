package com.ming.batis;

import com.ming.batis.executor.BatchExecutor;
import com.ming.batis.executor.Executor;
import com.ming.batis.executor.ReuseExecutor;
import com.ming.batis.executor.SimpleExecutor;

/**
 * Created by Sunshiming on 2018/11/1.
 */
public class Configuration {
    protected ExecutorType defaultExecutorType = ExecutorType.SIMPLE;

    public ExecutorType getExecuteType() {
        return defaultExecutorType;
    }

    public Executor newExecutor(ExecutorType executorType) {
        //region 原代码中使用三元表达式实现
        if(null == executorType){
            executorType = defaultExecutorType;
        }
        if(null == executorType){
            executorType = ExecutorType.SIMPLE;
        }
        //endregion

        Executor executor;
        if(ExecutorType.SIMPLE == executorType){
            executor = new SimpleExecutor(this);
        } else if(ExecutorType.REUSE == executorType){
            executor = new ReuseExecutor(this);
        } else {
            executor = new BatchExecutor(this);
        }

        return executor;
    }
}
