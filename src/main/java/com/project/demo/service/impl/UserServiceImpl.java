package com.project.demo.service.impl;

import com.project.demo.mapper.UserMapper;
import com.project.demo.pojo.Cognizance;
import com.project.demo.pojo.Person;
import com.project.demo.pojo.User;
import com.project.demo.service.PersonService;
import com.project.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Yiwo
 * @name 王习诚
 * @time 2020/11/17 16:31
 */
@Service
public class UserServiceImpl implements UserService{
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

    @Override
    public void modifyPrivilege(Integer userId, Integer roleId) {
        userMapper.modifyPrivilege(userId,roleId);
    }

    @Override
    public User findByUsernameAndPassword(String userName, String password) {
        return userMapper.findByUsernameAndPassword(userName,password);
    }

    @Override
    public Integer findRoleId(Integer userId) {
        return userMapper.findRoleId(userId);
    }

    @Override
    public void userEditPassword(User user) {
        userMapper.modifyPassword(user);
    }


}
