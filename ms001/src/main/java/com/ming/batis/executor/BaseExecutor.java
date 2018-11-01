package com.ming.batis.executor;

import com.ming.batis.Configuration;

/**
 * Created by Sunshiming on 2018/11/1.
 */
public abstract class BaseExecutor implements Executor {
    private Configuration configuration;

    private Executor wrapper;

    public BaseExecutor(Configuration configuration){
        this.configuration = configuration;
    }
}
