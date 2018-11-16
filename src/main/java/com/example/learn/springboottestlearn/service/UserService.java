package com.example.learn.springboottestlearn.service;

import com.example.learn.springboottestlearn.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserService() {
        System.out.println("UserService is created");
    }

    public void add(User user) {
        System.out.println("add user, userName=" + user.getName());
    }

}
