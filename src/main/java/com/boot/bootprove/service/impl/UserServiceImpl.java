package com.boot.bootprove.service.impl;

import com.boot.bootprove.dao.IUserDao;
import com.boot.bootprove.entity.User;
import com.boot.bootprove.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public User getUser() {
        String username = "xiaoming";
        log.info("UserServiceImpl getuser will delete a user named {}", username);


        userDao.save(new User("xiaolin"));

        List<User> xiaolin = userDao.findByName("xiaolin");
        System.out.println("xiaolin = " + xiaolin.size());

        return new User("xiaoming");
    }
}
