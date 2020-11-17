package com.project.demo.service.impl;

import com.project.demo.mapper.UserMapper;
import com.project.demo.pojo.User;
import com.project.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Yiwo
 * @name 王习诚
 * @time 2020/11/17 16:31
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired private UserMapper userMapper;

    @Override
    public User register(User user) {
        return userMapper.save(user);
    }

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }
}
