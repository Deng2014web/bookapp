package com.sundaysee.service;

import com.sundaysee.entity.User;

public interface UserService {

    /**
     * 判断用户登陆
     * @param loginname
     * @param password
     * @return 找到返回User对象，找不到返回null
     */
    User login(String loginname,String password);
}