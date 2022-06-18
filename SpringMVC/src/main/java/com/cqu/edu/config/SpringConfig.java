package com.cqu.edu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.cqu.edu.service","com.cqu.edu.dao"})
public class SpringConfig {
}
