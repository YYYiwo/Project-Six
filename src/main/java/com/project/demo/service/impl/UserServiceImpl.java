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
    public void register(User user) {
        userMapper.saveUser(user);
    }

    @Override
    public User findById(int id) {
        return userMapper.findByUserId(id);
    }

    @Override
    public void delete(int id) {
        userMapper.deleteByUserId(id);
        System.out.println("信息删除成功");
    }

    @Override
    public void modify(User user) {
        userMapper.updateUser(user);
    }
}
