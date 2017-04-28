package com.catfish.dao;

import com.catfish.entity.UserCard;
import com.catfish.entity.UserEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by A on 2017/4/26.
 */
public interface UserDao {

    Map queryByAge(Integer age);

    List<UserEntity> queryByAge2(Integer age);

    UserEntity queryByAge3(Integer age);

    UserEntity queryByAge4(Integer age);

    UserCard queryByUserId(Long userId);

}
