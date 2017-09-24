package com.zZooper.service.impl;

import com.zZooper.mapper.UserMapper;
import com.zZooper.model.User;
import com.zZooper.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public User queryByUserName(String userName) {
        return userMapper.queryByUserName(userName);
    }
}
