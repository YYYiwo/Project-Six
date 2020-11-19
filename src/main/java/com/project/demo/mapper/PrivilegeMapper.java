package com.project.demo.mapper;

import com.project.demo.pojo.Privilege;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Yiwo
 * @name 王习诚
 * @time 2020/11/19 14:58
 */
@Mapper
@Repository
public interface PrivilegeMapper {
    /**
     * 添加一个权限
     * @param privilege 权限实体
     */
    void savePrivilege(Privilege privilege);

    /**
     * 根据权限id删除权限
     * @param id 权限id
     */
    void deleteByPrivilegeId(int id);

    /**
     * 根据id查找权限
     * @param id 权限id
     * @return 被查找的权限实体
     */
    Privilege findByPrivilegeId(int id);

    /**
     * 修改权限
     * @param privilege 要被修改的权限实体
     */
    void updatePrivilege(Privilege privilege);
}
