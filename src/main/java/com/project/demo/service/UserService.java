package com.project.demo.service;

import com.project.demo.pojo.User;

/**
 * @author Yiwo
 * @name 王习诚
 * @time 2020/11/17 16:29
 */
public interface UserService {
    /**
     * 注册用户信息
     * @param user 用户信息
     */
    void register(User user);

    /**
     * 根据id查找用户
     * @param id 用户id
     * @return 用户信息
     */
    User findById(int id);

    /**
     * 根据id删除用户
     * @param id 用户ID
     */
    void delete(int id);

    /**
     * 修改用户信息
     * @param user 用户
     */
    void modify(User user);
}
