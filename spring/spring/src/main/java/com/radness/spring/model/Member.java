package com.radness.spring.model;

import lombok.Data;

import javax.persistence.Entity;

//@Entity
@Data
public class Member {
    private Long id;
    private String name;
    private char gender;
    private int age;
    private String password;
    private String account;
}
