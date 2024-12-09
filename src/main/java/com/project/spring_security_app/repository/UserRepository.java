package com.project.spring_security_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.spring_security_app.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
