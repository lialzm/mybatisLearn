package com.catfish.dao;

import com.catfish.entity.UserEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by A on 2017/4/26.
 */
public class UserDaoTest {


    @Test
    public void queryByAgeTest() {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("age", 2);
        UserEntity userEntity = userMapper.queryByAge(map);
        System.out.println(userEntity);
    }

    @Test
    public void queryByAge2Test() {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "test");
        UserEntity userEntity = userMapper.queryByAge2(map);
        System.out.println(userEntity);
    }

    @Test
    public void queryByAge3Test() {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "test");
        map.put("age", 2);
        UserEntity userEntity = userMapper.queryByAge3(map);
        System.out.println(userEntity);
    }

    @Test
    public void queryByAge4Test() {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserDao userMapper = sqlSession.getMapper(UserDao.class);
        Map<String, Object> map = new HashMap<String, Object>();
        List<Integer> ages=new ArrayList<Integer>();
        ages.add(2);
        ages.add(1);
        map.put("ages", ages);
        UserEntity userEntity = userMapper.queryByAge4(map);
        System.out.println(userEntity);
    }

@Test
public void updateTest(){
    SqlSession sqlSession = getSessionFactory().openSession();
    UserDao userMapper = sqlSession.getMapper(UserDao.class);
    Integer i= userMapper.update(2, "111");
    sqlSession.commit(true);
    System.out.println(i);
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
