package com.noxjs.oauth2.server.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.noxjs.oauth2.server.mapper.UserRoleMapper;
import com.noxjs.oauth2.server.service.UserRoleService;
/**
* 
* @description: 
* @author: Nox
* @date: 2019-08-22
*/
@Service
public class UserRoleServiceImpl implements UserRoleService{

    @Resource
    private UserRoleMapper userRoleMapper;

}
