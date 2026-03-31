package com.hei.school.Spring_boot_TD2_TD3.controller;

import com.hei.school.Spring_boot_TD2_TD3.entity.Student;
import com.hei.school.Spring_boot_TD2_TD3.service.StudentService;
import com.hei.school.Spring_boot_TD2_TD3.validator.StudentValidator;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@RestController
public class WelcomeController {
    private final StudentService studentService;
    private final StudentValidator studentValidator;

    @PostMapping("/welcome")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        List<Student> students = studentService.getStudents();
        throw new RuntimeException("not implemented");

    }

}
