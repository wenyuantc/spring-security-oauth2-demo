package com.noxjs.oauth2.server.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

/**
 * @description: 认证服务器配置
 * @author: Nox
 * @date: 2019/8/15
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

	private final PasswordEncoder passwordEncoder;

	private final DataSource dataSource;

	public AuthorizationServerConfiguration(PasswordEncoder passwordEncoder, @Qualifier("dataSource") DataSource dataSource) {
		this.passwordEncoder = passwordEncoder;
		this.dataSource = dataSource;
	}


	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		// 设置客服端信息认证服务
		clients.withClientDetails(clientDetailService());
	}

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		// 设置token存储方式
		endpoints.tokenStore(tokenStore());
	}

	@Bean
	public ClientDetailsService clientDetailService() {
		return new JdbcClientDetailsService(dataSource);
	}

	@Bean
	public TokenStore tokenStore() {
		return new JdbcTokenStore(dataSource);
	}




}
