package com.project.demo.service;


import com.project.demo.pojo.*;
import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.PageInfo;
import com.project.demo.pojo.User;

import java.util.List;


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


    /**
     * 修改权限
     * @param
     */
    void modifyPrivilege(Integer userId,Integer roleId);

    /**
     * 根据用户账号察整改是否为空
     * @param userName
     * @return
     */
    User findByUserName(String userName);
    /**
     * 根据用户名和密码查询
     * @param userName
     * @param password
     * @return
     */
    User findByUsernameAndPassword(String userName,String password);
    /**
     * 通过用户名查找改用户的权限
     * @param userId
     * @return
     */
    Integer findRoleId(Integer userId);

    /**
     * 修改密码
     * @param user
     */
    void userEditPassword(User user);

    /**
     * 先进个人申报
     * @param person
     * @param cognizance
     */
//
    void declarePerson(@Param("person")Person person,  @Param("cognizance")Cognizance cognizance);

    //显示出所有user的信息
    List<User> findAll();

    //查找用户权限
    String findRole(int userId);

    //修改user的权限
    void modifyUserRole(UserRole userRole);

    //分页显示
    PageInfo<User> findAllPage(int pageNum, int pageSize);

}
