package com.example.DemoSpringSecurity.controller;

import com.example.DemoSpringSecurity.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebController {
//
//    @Autowired
//    private DemoServices services;

    private List<User> students= new ArrayList<>(List.of(
            new User(1,"vansh",70),
            new User(2,"tushar",60)
    ));

    @GetMapping("/students")
    public List<User> getStduents(){
        return  students;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public User addStudent(@RequestBody User student){
        students.add(student);
        return student;
    }
}
