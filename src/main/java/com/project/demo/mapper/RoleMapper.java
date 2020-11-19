package com.project.demo.mapper;

import com.project.demo.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RoleMapper {
    /**
     * 添加一个角色名
     */
    void insert(Role role);
    /**
     * 删除一个角色名
     */
    void delete(int roleId);
    /**
     * 修改一个角色名
     */
    void modify(int roleId);
    /**
     * 查询一个角色id
     */
    Role findById(int roleId);

}
