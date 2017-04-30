package com.catfish.dao;

import com.catfish.entity.UserEntity;

/**
 * Created by A on 2017/4/26.
 */
public interface UserDao {


    UserEntity queryByAge(Integer age);

    UserEntity queryByAge2(Integer age);

}
