package com.cqu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.cqu.controller","com.cqu.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
