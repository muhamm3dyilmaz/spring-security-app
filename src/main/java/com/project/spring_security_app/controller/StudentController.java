package com.project.spring_security_app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.spring_security_app.model.Student;

import jakarta.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Muhammed", "Java"),
            new Student(2, "Yılmaz", "React")));

    @GetMapping("students")
    public List<Student> getSttudents() {
        return students;
    }

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
    

}
