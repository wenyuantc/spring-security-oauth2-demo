package com.noxjs.oauth2.server.mapper;

import com.noxjs.oauth2.server.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
* 
* @description: 
* @author: Nox
* @date: 2019-08-22
*/
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {
}