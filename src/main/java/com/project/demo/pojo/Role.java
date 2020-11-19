package com.project.demo.pojo;


import org.apache.ibatis.annotations.Property;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.stereotype.Component;

@Component
public class Role {

    private int roleId;
    /**
     * 角色ID
     */

    private String roleName;
    /**
     * 用户名
     */
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
