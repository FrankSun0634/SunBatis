package com.ming.batis;

import com.ming.batis.executor.Executor;

/**
 * Created by Sunshiming on 2018/11/1.
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration){
        this.configuration = configuration;
    }

    public SqlSession openSession() {
        return openSessionFromDataSource(configuration.getExecuteType(), false);
    }

    private SqlSession openSessionFromDataSource(ExecutorType execType, boolean autoCommit){

        Executor executor = configuration.newExecutor(execType);

        return new DefaultSqlSession(configuration, executor, false);
    }
}
