package com.wqy.springboot.controllers;

import com.wqy.springboot.entities.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/user")
    public User getUser(){
        return new User(1,"wqy");
    }

}
