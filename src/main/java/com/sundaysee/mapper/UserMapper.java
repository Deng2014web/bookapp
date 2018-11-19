package com.sundaysee.mapper;

import com.sundaysee.entity.User;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    /**
     * 根据登录名喝密码查询用户
     * @param loginname
     * @param password
     * @return 找到返回User对象，找不到返回null
     */
    @Select("select * from tb_user where loginname = #{loginname} and password = #{password}")
    User findWithLoginnameAndPassword(@Param("loginname") String loginname,@Param("password") String password);
}