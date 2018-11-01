package com.ming.batis;

import com.ming.batis.executor.Executor;

import java.io.IOException;

/**
 * Created by Sunshiming on 2018/11/1.
 */
public class DefaultSqlSession implements SqlSession {
    private Configuration configuration;
    private Executor executor;
    private boolean autoCommit;

    public DefaultSqlSession(Configuration configuration, Executor executor, boolean autoCommit){
        this.configuration = configuration;
        this.executor = executor;
        this.autoCommit = autoCommit;
    }

    public <T> T selectOne(String statement) {
        return null;
    }

    public Configuration getConfiguration() {
        return null;
    }

    public <T> T getMapper(Class<T> clazz) {
        return null;
    }

    public void close() throws IOException {

    }
}
