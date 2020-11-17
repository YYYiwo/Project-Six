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
    User save(User user);

    User findById(int id);
}
