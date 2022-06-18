package com.cqu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.cqu.controller")
@EnableWebMvc//json=>对象
public class SpringMvcConfig {
}
