package com.boot.bootprove.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 50)
    private String name;

    public User(String name) {
        this.name = name;
    }
}
