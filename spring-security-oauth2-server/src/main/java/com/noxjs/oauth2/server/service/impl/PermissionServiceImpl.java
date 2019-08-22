package com.noxjs.oauth2.server.service.impl;
import java.util.List;
import com.noxjs.oauth2.server.entity.Permission;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.noxjs.oauth2.server.mapper.PermissionMapper;
import com.noxjs.oauth2.server.service.PermissionService;
/**
* 
* @description: 
* @author: Nox
* @date: 2019-08-22
*/
@Service
public class PermissionServiceImpl implements PermissionService{

	@Resource
	private PermissionMapper permissionMapper;

	@Override
	public List<Permission> selectByUserId(Long userId) {
		return permissionMapper.selectByUserId(userId);
	}
}
