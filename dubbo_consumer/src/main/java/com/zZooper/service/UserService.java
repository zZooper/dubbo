package com.zZooper.service;

import com.zZooper.model.User;

/**
 * Created by zhph on 2017/8/17.
 */
public interface UserService {
    public User queryByUserName(String userName);
}
