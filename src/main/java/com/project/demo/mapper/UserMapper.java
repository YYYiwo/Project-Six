package com.project.demo.mapper;

import com.project.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
}
