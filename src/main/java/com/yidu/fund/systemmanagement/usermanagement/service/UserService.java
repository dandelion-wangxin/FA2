package com.yidu.fund.systemmanagement.usermanagement.service;

import com.yidu.fund.systemmanagement.usermanagement.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface UserService {
    @Service
    class UserServiceImpl implements UserService {

        @Autowired
        private UserMapper userMapper;
    }
}
