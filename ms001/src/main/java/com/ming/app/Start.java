package com.ming.app;

import com.ming.batis.SqlSession;
import com.ming.batis.SqlSessionFactory;
import com.ming.batis.SqlSessionFactoryBuild;
import com.ming.dao.UserDao;

import java.io.InputStream;

/**
 * Created by Sunshiming on 2018/11/1.
 */
public class Start {

    public static void main(String[] args){
        //TODO 读取配置文件
        InputStream inputStream = null;
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuild().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        String name = userDao.getUserName("1");
        System.out.println(name);
    }
}
