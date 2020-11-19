package com.project.demo.service;

import com.project.demo.pojo.Privilege;

/**
 * @author Yiwo
 * @name 王习诚
 * @time 2020/11/19 15:03
 */
public interface PrivilegeService {
    /**
     * 添加一个权限
     * @param privilege 权限实体
     */
    void save(Privilege privilege);

    /**
     * 根据权限id删除权限
     * @param id 权限id
     */
    void delete(int id);

    /**
     * 根据id查找权限
     * @param id 权限id
     * @return 被查找的权限实体
     */
    Privilege findById(int id);

    /**
     * 修改权限
     * @param privilege 要被修改的权限实体
     */
    void update(Privilege privilege);
}
