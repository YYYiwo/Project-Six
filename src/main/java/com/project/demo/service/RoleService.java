package com.project.demo.service;

import com.project.demo.pojo.Role;

/**
 * 角色业务接口
 */
public interface RoleService {
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
