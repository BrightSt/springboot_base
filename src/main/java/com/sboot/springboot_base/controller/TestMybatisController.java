package com.sboot.springboot_base.controller;

import com.sboot.springboot_base.entity.User;
import com.sboot.springboot_base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestMybatisController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public User getUser(User user){
        return  userService.getUserById(1);
    }
}
