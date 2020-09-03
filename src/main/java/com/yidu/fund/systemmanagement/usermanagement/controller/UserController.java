package com.yidu.fund.systemmanagement.usermanagement.controller;

import com.yidu.fund.systemmanagement.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有的用户信息
     * @return 用户信息集合
     */
    @RequestMapping("findall")
    public List<String> findAll() {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        return list;
    }

}
