package com.example.DemoSpringSecurity.DAO;

import com.example.DemoSpringSecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}


