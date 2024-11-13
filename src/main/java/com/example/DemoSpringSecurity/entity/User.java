package com.example.DemoSpringSecurity.entity;

import lombok.Data;

@Data
public class User {
    private int id ;
    private String name;
    private int marks;

    public User(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
