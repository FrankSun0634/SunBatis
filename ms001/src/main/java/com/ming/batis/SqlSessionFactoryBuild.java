package com.ming.batis;

import java.io.InputStream;

/**
 * Created by Sunshiming on 2018/11/1.
 */
public class SqlSessionFactoryBuild {

    public SqlSessionFactory build(InputStream inputStream){
        //TODO 解析配置文件，生成Configuration对象
        Configuration configuration = new Configuration();
        return build(configuration);
    }

    public SqlSessionFactory build(Configuration configuration){
        return new DefaultSqlSessionFactory(configuration);
    }
}
