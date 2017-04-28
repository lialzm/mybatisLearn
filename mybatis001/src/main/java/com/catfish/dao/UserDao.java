package com.catfish.dao;

import com.catfish.entity.UserEntity;

/**
 * Created by A on 2017/4/26.
 */
public interface UserDao {

    Integer insert(UserEntity user);

    UserEntity queryById(Long id);
    UserEntity queryById2(Long id);

    Integer del(UserEntity user);

    Integer update(UserEntity user);

}
