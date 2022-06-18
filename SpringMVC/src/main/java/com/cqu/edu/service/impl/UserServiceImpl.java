package com.cqu.edu.service.impl;

import com.cqu.edu.domain.User;
import com.cqu.edu.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public void save(User user){System.out.println("user service...");}
}
