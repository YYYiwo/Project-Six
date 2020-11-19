package com.project.demo.service.impl;

import com.project.demo.mapper.PrivilegeMapper;
import com.project.demo.pojo.Privilege;
import com.project.demo.service.PrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yiwo
 * @name 王习诚
 * @time 2020/11/19 15:05
 */
@Service
public class PrivilegeServiceImpl implements PrivilegeService {

    @Autowired private PrivilegeMapper privilegeMapper;

    @Override
    public void save(Privilege privilege) {
        privilegeMapper.savePrivilege(privilege);
    }

    @Override
    public void delete(int id) {
        privilegeMapper.deleteByPrivilegeId(id);
        System.out.println("删除成功");
    }

    @Override
    public Privilege findById(int id) {
        return privilegeMapper.findByPrivilegeId(id);
    }

    @Override
    public void update(Privilege privilege) {
        privilegeMapper.updatePrivilege(privilege);
    }
}
