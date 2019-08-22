package com.noxjs.oauth2.server.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.noxjs.oauth2.server.mapper.RoleMapper;
import com.noxjs.oauth2.server.service.RoleService;
/**
* 
* @description: 
* @author: Nox
* @date: 2019-08-22
*/
@Service
public class RoleServiceImpl implements RoleService{

    @Resource
    private RoleMapper roleMapper;

}
