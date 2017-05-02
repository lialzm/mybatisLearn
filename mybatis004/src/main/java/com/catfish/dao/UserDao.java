package com.catfish.dao;

import com.catfish.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Created by A on 2017/4/26.
 */
public interface UserDao {


    UserEntity queryByAge(Map<String, Object> map);

    UserEntity queryByAge2(Map<String, Object> map);

    UserEntity queryByAge3(Map<String, Object> map);

    UserEntity queryByAge4(Map<String, Object> map);

    Integer update(@Param("id")Integer id,@Param("name")String name);

}
