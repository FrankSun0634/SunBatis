package com.ming.batis;

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


        return null;
    }
}
