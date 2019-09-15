package com.boot.bootprove.controller;

import com.boot.bootprove.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("hi")
    public String hi() {
            return userService.getUser().getName();
    }
}
