package com.catfish.dao;

import com.catfish.entity.UserEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by A on 2017/4/26.
 */
public class UserDaoTest {


    @Test
    public void queryByAgeTest() {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        UserEntity userEntity = userMapper.queryByAge(2);
        System.out.println(userEntity);
    }

    @Test
    public void queryByAge2Test() {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        UserEntity userEntity = userMapper.queryByAge2(2);
        System.out.println(userEntity);
    }



    //Mybatis 通过SqlSessionFactory获取SqlSession, 然后才能通过SqlSession与数据库进行交互
    private static SqlSessionFactory getSessionFactory() {
        SqlSessionFactory sessionFactory = null;
        String resource = "mybatis-config.xml";
        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources
                    .getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }

}
