package com.noxjs.oauth2.server.entity;

public class RoleWithUserRoleList extends Role {
    private java.util.List<UserRole> userRoleList;

    public java.util.List<UserRole> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(java.util.List<UserRole> userRoleList) {
        this.userRoleList = userRoleList;
    }
}
