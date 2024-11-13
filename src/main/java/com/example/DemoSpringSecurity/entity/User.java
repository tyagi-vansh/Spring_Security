package com.example.DemoSpringSecurity.entity;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

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

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();
}
