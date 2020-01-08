package com.gdz;


import com.gdz.bean.User;
import com.gdz.mapper.UserMapper;
import com.gdz.sqlsession.SqlSession;

import java.sql.SQLException;

/**
 * @Author:
 * @Date: 2019/1/17 10:22
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        UserMapper userMapper = SqlSession.getUserMapper(UserMapper.class);
        User user = userMapper.queryUser(1L);
        //List<User> userList = userMapper.queryUserList();
        System.out.println("row:" + user);
    }


}
