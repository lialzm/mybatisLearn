package com.catfish.dao;

import com.catfish.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Created by A on 2017/4/26.
 */
public interface UserDao {

    Integer insert(UserEntity user);

    Integer insertMap(Map<String,Object> map);

    UserEntity queryById(Long id);
    UserEntity queryById2(Long id);

    Integer del(UserEntity user);

    Integer update(UserEntity user);

    Integer update1(@Param("id")Integer id ,@Param("name")String name);

}
