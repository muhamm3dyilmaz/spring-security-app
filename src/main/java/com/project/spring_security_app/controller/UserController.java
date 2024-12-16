package com.project.spring_security_app.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring_security_app.model.User;
import com.project.spring_security_app.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    

    @PostMapping("register")
    public User register(@RequestBody User user) {
        return userService.saveUser(user);
    }

}
