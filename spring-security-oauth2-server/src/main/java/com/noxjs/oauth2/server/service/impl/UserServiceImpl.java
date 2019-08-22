package com.noxjs.oauth2.server.service.impl;

import com.noxjs.oauth2.server.entity.User;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.noxjs.oauth2.server.mapper.UserMapper;
import com.noxjs.oauth2.server.service.UserService;
import tk.mybatis.mapper.entity.Example;

/**
* 
* @description: 
* @author: Nox
* @date: 2019-08-22
*/
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User getByUserName(String username) {
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("username", username);
        return userMapper.selectOneByExample(example);
    }
}
