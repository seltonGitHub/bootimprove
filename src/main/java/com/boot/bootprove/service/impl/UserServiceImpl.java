package com.boot.bootprove.service.impl;

import com.boot.bootprove.dao.IUserDao;
import com.boot.bootprove.entity.User;
import com.boot.bootprove.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public User getUser() {
        System.out.println("UserServiceImpl.getUser");
        userDao.addUser(new User("xiaoming"));
        return new User("xiaoming");
    }
}
