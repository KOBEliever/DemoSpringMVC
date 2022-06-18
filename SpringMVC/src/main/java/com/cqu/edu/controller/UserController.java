package com.cqu.edu.controller;

import com.cqu.edu.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

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
    //参数不同名传递 @RequestParam("")
    @RequestMapping("/commonDifferentParam")
    @ResponseBody
    public String commonDifferentParam(@RequestParam("name") String userName,int age){
        System.out.println(userName);
        System.out.println(age);
        return "{'module':'commonDifferentParam'}";
    }
    //pojo参数
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println(user);
        return "{'module':'pojoParam'}";
    }
    //pojo嵌套参数
    @RequestMapping("/pojoContainParam")
    @ResponseBody
    public String pojoContainParam(User user){
        System.out.println(user);
        return "{'module':'pojoContainParam'}";
    }
    //数组参数
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] like){
        System.out.println(Arrays.toString(like));
        return "{'module':'arrayParam'}";
    }

    //集合参数
    @RequestMapping("/ListParam")
    @ResponseBody
    public String ListParam(@RequestParam List<String> like){
        System.out.println(like);
        return "{'module':'ListParam'}";
    }
    //集合参数,json
    @RequestMapping("/ListParamForJson")
    @ResponseBody
    public String ListParamForJason(@RequestBody List<String> like){
        System.out.println(like);
        return "{'module':'ListParamForJson'}";
    }
    //pojo参数 json
    @RequestMapping("/PojoParamForJson")
    @ResponseBody
    public String PojoParamForJason(@RequestBody User user){
        System.out.println(user);
        return "{'module':'PojoParamForJson'}";
    }
    //集合参数 json
    @RequestMapping("/ListPojoParamForJson")
    @ResponseBody
    public String ListPojoParamForJson(@RequestBody List<User> users){
        System.out.println(users);
        return "{'module':'ListPojoParamForJson'}";
    }
}
