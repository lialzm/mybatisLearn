package com.catfish.dao;

import com.catfish.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

/**
 * Created by A on 2017/4/26.
 */
public interface UserDao {

    Integer insert(UserEntity user);

    UserEntity queryById(Long id);
    UserEntity queryById2(Long id);

    Integer del(UserEntity user);

    Integer update(UserEntity user);

    Integer update1(@Param("id")Integer id ,@Param("name")String name);

}
