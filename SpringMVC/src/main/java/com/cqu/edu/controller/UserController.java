package com.cqu.edu.controller;

import com.cqu.edu.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
    //日期参数
    @RequestMapping("/DateParam")
    @ResponseBody
    public String DateParam(Date date,@DateTimeFormat(pattern = "yyyy-MM-dd") Date date1 , @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date date2){
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
        return "{'module':'DateParam'}";
    }

    //响应页面/跳转页面
    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        System.out.println("跳转页面");
//        return "src/main/webapp/page.html";
        return "page.jsp";
    }
    //响应文本数据
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("响应文本数据");
        return "response text";
    }
    //响应POJO对象
    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPOJO(){
        System.out.println("toJsonPOJO");
        User user = new User();
        user.setName("dingyi");
        user.setAge(21);
        return user;
    }
    //响应pojo集合对象
    @RequestMapping("/toJsonPojoList")
    @ResponseBody
    public List<User> toJsonPOJOList(){
        System.out.println("toJsonPojoList");
        User user1 = new User();
        user1.setName("dingyi");
        user1.setAge(21);
        User user2 = new User();
        user2.setName("qinghaoting");
        user2.setAge(21);
        List<User> users=new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        return users;
    }
}
