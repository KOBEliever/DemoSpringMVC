package com.cqu.edu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//3.创建SpringMVC的配置文件，加载Controller对应的bean
@Configuration
@ComponentScan("com.cqu.edu.controller")
@EnableWebMvc//json=>对象
public class SpringMvcConfig {
}
