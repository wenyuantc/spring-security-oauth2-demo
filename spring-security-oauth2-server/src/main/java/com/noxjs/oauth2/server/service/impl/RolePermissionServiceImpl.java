package com.noxjs.oauth2.server.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.noxjs.oauth2.server.mapper.RolePermissionMapper;
import com.noxjs.oauth2.server.service.RolePermissionService;
/**
* 
* @description: 
* @author: Nox
* @date: 2019-08-22
*/
@Service
public class RolePermissionServiceImpl implements RolePermissionService{

    @Resource
    private RolePermissionMapper rolePermissionMapper;

}
