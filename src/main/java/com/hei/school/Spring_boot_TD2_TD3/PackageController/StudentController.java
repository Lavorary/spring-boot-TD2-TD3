package com.hei.school.Spring_boot_TD2_TD3.PackageController;

import com.hei.school.Spring_boot_TD2_TD3.PackageService.StudentService;
import entity.Student;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Data

@RestController
public class StudentController {
    private final StudentService studentService;


    @PostMapping("/students")
    public String addStudents(@RequestBody  List<Student> newStudents) {
        List<Student> students = studentService.addStudents(newStudents);
        return students.stream()
                  .map(s -> s.getFirstName() + " " + s.getLastName())
                  .collect(Collectors.joining(", "));
    }
}
