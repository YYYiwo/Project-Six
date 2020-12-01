package com.project.demo.mapper;

import com.github.pagehelper.PageInfo;
import com.project.demo.pojo.Role;
import com.project.demo.pojo.User;
import com.project.demo.pojo.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Yiwo
 * @name 王习诚
 * @time 2020/11/17 16:28
 */
@Mapper
@Repository
public interface UserMapper {

    /**
     * 添加一个用户
     * @param user 用户
     */
    void saveUser(User user);

    /**
     * 根据id查找用户
     * @param id 用户id
     * @return 用户信息
     */
    User findByUserId(int id);

    /**
     * 根据id删除用户
     * @param id 用户id
     */
    void deleteByUserId(int id);

    /**
     * 修改用户信息
     * @param user 用户信息
     */
    void updateUser(User user);


    /**
     * 修改权限
     * @param
     */
    void modifyPrivilege(@Param("userId") Integer userId,@Param("roleId") Integer roleId);

    /**
     * 根据用户账号查找是否为空
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
    User findByUsernameAndPassword(@Param("userName") String userName ,@Param("password") String password);

    /**
     * 查询全部
     * @return
     */
    List<User> findAll();

    /**
     * 通过用户名查找改用户的权限
     * @param userId
     * @return
     */
    Integer findRoleId(Integer userId);
    /**
     *
     */
    void modifyPassword(User user);

    //显示所有
    List<User> findAllUser();
    //修改权限角色信息
    void updateUserRole(UserRole userRole);


    //查找用户权限名
    String findRole(int userId);


}
