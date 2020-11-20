package com.project.demo.service.impl;

import com.project.demo.mapper.RoleMapper;
import com.project.demo.pojo.Role;
import com.project.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired private RoleMapper roleMapper;
    @Override
    public void insert(Role role) { roleMapper.insert(role);
    }

    @Override
    public void delete(int roleId) { roleMapper.delete(roleId);
    }

    @Override
    public void modify(int roleId) { roleMapper.modify(roleId);
    }

    @Override
    public Role findById(int roleId) {
        System.out.println("1");
        return roleMapper.findById(roleId);
    }
}
