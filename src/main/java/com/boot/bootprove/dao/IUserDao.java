package com.boot.bootprove.dao;

import com.boot.bootprove.entity.User;
import org.apache.ibatis.annotations.Insert;

public interface IUserDao {

    @Insert("insert into user values(null, #{name})")
    int addUser(User user);
}
