package com.hei.school.Spring_boot_TD2_TD3.controller;

import com.hei.school.Spring_boot_TD2_TD3.entity.Student;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> studentsInMemory = new ArrayList<>();

    @PostMapping("/students")
    public ResponseEntity<?> createStudents(
            @RequestBody List<Student> newStudents) {
        for (Student newStudent : newStudents) {
            if (newStudent.getReference() == null || newStudent.getReference().isBlank()) {
                return ResponseEntity
                        .status(HttpStatus.BAD_REQUEST)
                        .header("Content-Type", "text/plain")
                        .body("NewStudent.reference cannot be null");
            }

            if (newStudent.getFirstName() == null || newStudent.getFirstName().isBlank()) {
                return ResponseEntity
                        .status(HttpStatus.BAD_REQUEST)
                        .header("Content-Type", "text/plain")
                        .body("NewStudent.firstName cannot be null");
            }

            if (newStudent.getLastName() == null || newStudent.getLastName().isBlank()) {
                return ResponseEntity
                        .status(HttpStatus.BAD_REQUEST)
                        .header("Content-Type", "text/plain")
                        .body("NewStudent.lastName cannot be null");
            }
        }

        studentsInMemory.addAll(newStudents);

        return ResponseEntity
                .status(HttpStatus.OK)
                .header("Content-Type", "application/json")
                .body(studentsInMemory);
    }
}