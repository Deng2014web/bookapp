package com.sundaysee.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private Integer id;     //id
    private String loginname;   //登录名
    private String password;    //登录密码
    private String username;    //用户名
    private String phone;       //电话
    private String address;     //地址
    
}