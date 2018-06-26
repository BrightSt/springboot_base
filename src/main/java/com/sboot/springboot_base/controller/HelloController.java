package com.sboot.springboot_base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * web test
 */
@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello(HashMap<String,Object> map){
        map.put("hello","welcome html");
        return "/index";
    }


}
