package com.catfish;

import com.catfish.dao.UserDao;
import com.catfish.entity.UserEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by A on 2017/4/26.
 */
public class UserDaoTest {

    @Test
    public void insert() {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        UserEntity userEntity = new UserEntity();
        userEntity.setName("test");
        Integer id = userMapper.insert(userEntity);
        System.out.println(id);
        sqlSession.commit();
    }

    @Test
    public void queryById() {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        UserEntity userEntity = userMapper.queryById(7L);
        Assert.assertEquals("test", userEntity.getName());
    }

    @Test
    public void queryById2() {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        UserEntity userEntity = userMapper.queryById2(9L);
        Assert.assertEquals("test", userEntity.getName());
    }

    @Test
    public void del() {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        UserEntity userEntity = new UserEntity();
        userEntity.setName("test");
        userMapper.del(userEntity);
    }

    @Test
    public void update() {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        UserEntity userEntity = new UserEntity();
        userEntity.setName("test1");
        userEntity.setId(2L);
        userMapper.update(userEntity);
        sqlSession.commit();
    }

    @Test
    public void update1() {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        userMapper.update1(1,"1122");
        sqlSession.commit();
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
