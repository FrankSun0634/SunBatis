package com.ming.batis;

import java.io.Closeable;

/**
 * Created by Sunshiming on 2018/11/1.
 */
public interface SqlSession extends Closeable {

    <T> T selectOne(String statement);

    Configuration getConfiguration();

    <T> T getMapper(Class<T> clazz);
}
