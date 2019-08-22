package com.noxjs.oauth2.server.service;

import com.noxjs.oauth2.server.entity.User;

/**
 * @description:
 * @author: Nox
 * @date: 2019-08-22
 */
public interface UserService {

	/**
	 * 通过用户名查询用户信息
	 *
	 * @param username
	 * @return
	 */
	User getByUserName(String username);

}
