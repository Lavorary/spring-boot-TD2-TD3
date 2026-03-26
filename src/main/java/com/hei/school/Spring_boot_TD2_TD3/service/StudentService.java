package com.hei.school.Spring_boot_TD2_TD3.service;

import com.hei.school.Spring_boot_TD2_TD3.entity.Student;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> studentsInMemory = new ArrayList<>();

    public List<Student> addStudents(List<Student> newStudents) {
        studentsInMemory.addAll(newStudents);
        return studentsInMemory;
    }

    public List<Student> getStudents() {
        return studentsInMemory;
    }
}