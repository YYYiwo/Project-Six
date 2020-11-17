package com.project.demo.service;

import com.project.demo.pojo.User;

/**
 * @author Yiwo
 * @name 王习诚
 * @time 2020/11/17 16:29
 */
public interface UserService {
    User register(User user);

    User findById(int id);
}
