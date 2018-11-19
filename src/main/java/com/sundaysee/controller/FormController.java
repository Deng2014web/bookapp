package com.sundaysee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
/**
 * 动态页面跳转控制器
 * 这个控制器在请求页面解析匹配不到时会调用
 */
@Controller
class FormController {

    @GetMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName) {
        return formName;
    }

}