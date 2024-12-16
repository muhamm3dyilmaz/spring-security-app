package com.project.spring_security_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.spring_security_app.model.User;
import com.project.spring_security_app.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

}
