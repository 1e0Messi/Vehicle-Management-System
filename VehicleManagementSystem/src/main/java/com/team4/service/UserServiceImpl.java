package com.team4.service;

import com.team4.dao.UserMapper;
import com.team4.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }
}
