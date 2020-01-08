package com.gdz.mapper;

import com.gdz.bean.User;
import com.gdz.annotation.GdzInsert;
import com.gdz.annotation.GdzParam;
import com.gdz.annotation.GdzQuery;

import java.util.List;

/**
 * @Author: guandezhi
 * @Date: 2019/1/17 10:37
 */
public interface UserMapper {

    @GdzQuery("select * from info where id=#{id}")
    User queryUser(@GdzParam("id") Long id);


    @GdzQuery("select * from info")
    List<User> queryUserList();


    @GdzInsert("insert into user(username, city) values(#{username}, #{city})")
    int insertUser(@GdzParam("username") String name, @GdzParam("city") String city);


}
