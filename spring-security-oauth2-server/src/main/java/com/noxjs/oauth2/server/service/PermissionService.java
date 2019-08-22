package com.noxjs.oauth2.server.service;

import com.noxjs.oauth2.server.entity.Permission;

import java.util.List;

/**
 * @description:
 * @author: Nox
 * @date: 2019-08-22
 */
public interface PermissionService {


	List<Permission> selectByUserId(Long userId);


}
