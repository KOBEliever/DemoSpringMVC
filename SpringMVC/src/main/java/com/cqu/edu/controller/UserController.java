package com.cqu.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//2.定义Controller
//2.1使用@Controller定义bean
@Controller
@RequestMapping("/user")
public class UserController {
    //2.2设置当前操作的访问路径
    @RequestMapping("/save")
    //2.3设置当前操作的返回值类型
    @ResponseBody
    public String save(String name, int age){
        System.out.println("user save..."+name);
        System.out.println("user save..."+age);
        return "{'module':'user save'}";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("user delete...");
        return "{'module':'user delete'}";
    }
}
