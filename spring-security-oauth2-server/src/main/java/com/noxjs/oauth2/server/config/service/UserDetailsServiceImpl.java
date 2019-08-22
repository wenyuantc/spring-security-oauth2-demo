package com.noxjs.oauth2.server.config.service;

import com.google.common.collect.Lists;
import com.noxjs.oauth2.server.entity.Permission;
import com.noxjs.oauth2.server.entity.User;
import com.noxjs.oauth2.server.service.PermissionService;
import com.noxjs.oauth2.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: Nox
 * @date: 2019-08-22
 */
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Autowired
	private PermissionService permissionService;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.getByUserName(username);
		if (user == null) {
			throw new UsernameNotFoundException("用户不存在");
		}

		List<Permission> permissions = permissionService.selectByUserId(user.getId());
		List<GrantedAuthority> authorities = permissions.stream()
				.map(item -> new SimpleGrantedAuthority(item.getEnname())).collect(Collectors.toList());

		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
	}
}
