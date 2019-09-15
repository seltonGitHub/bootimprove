package com.boot.bootprove.dao;

import com.boot.bootprove.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserDao extends JpaRepository<User, Integer> {

    List<User> findByName(String name);
}
