package com.hei.school.Spring_boot_TD2_TD3.validator;

import com.hei.school.Spring_boot_TD2_TD3.entity.Student;
import com.hei.school.Spring_boot_TD2_TD3.exception.BadRequestException;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Locale;

@Component
public class StudentValidator {
    public void validate(List<Student> students) {
        StringBuilder test =  new StringBuilder();
        for (Student student : students) {
            if (student.getReference() == null || student.getReference().isBlank()) {
                 test.append("Student.reference cannot be null");
            }
            if (student.getFirstName() == null || student.getFirstName().isBlank()) {
                test.append("Student.firstName cannot be null");
            }
            if (student.getLastName() == null || student.getLastName().isBlank()) {
                test.append("Student.lastName cannot be null");
            }
        }
    }
}