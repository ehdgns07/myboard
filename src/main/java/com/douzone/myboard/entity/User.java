package com.douzone.myboard.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    Long userId;
    String username;
    String password;
    String name;
    Integer age;
}
