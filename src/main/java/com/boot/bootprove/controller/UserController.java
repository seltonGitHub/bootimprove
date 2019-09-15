package com.boot.bootprove.controller;

import com.boot.bootprove.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("user")
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("hi")
    public String hi() {
        return userService.getUser().getName();
    }
}
