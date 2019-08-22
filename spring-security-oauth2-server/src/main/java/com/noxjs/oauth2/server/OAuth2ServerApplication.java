package com.noxjs.oauth2.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @description:
 * @author: Nox
 * @date: 2019/8/15
 */
@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = "com.noxjs.oauth2.server.mapper")
public class OAuth2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2ServerApplication.class, args);
	}
}
