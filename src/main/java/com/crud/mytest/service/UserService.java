package com.crud.mytest.service;

import com.crud.mytest.entity.User;
import com.crud.mytest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> getUsers(){

        return userMapper.getUser();

    }

}
