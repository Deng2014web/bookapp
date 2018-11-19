package com.sundaysee.service.impl;

import com.sundaysee.entity.User;
import com.sundaysee.mapper.UserMapper;
import com.sundaysee.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * User服务层接口实现类
 * @Service("userService")用于将当前类注释为一个Spring的bean，名为userService
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    /**
     * 自动注入UserMapper
     */
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String loginname, String password) {
        return userMapper.findWithLoginnameAndPassword(loginname, password);
	}


}