package com.hei.school.Spring_boot_TD2_TD3.validator;

import com.hei.school.Spring_boot_TD2_TD3.entity.Student;
import com.hei.school.Spring_boot_TD2_TD3.exception.BadRequestException;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class StudentValidator {
    public void validate(List<Student> students) {
        for (Student s : students) {
            if (s.getReference() == null || s.getReference().isBlank()) {
                throw new BadRequestException("Student.reference cannot be null");
            }
            if (s.getFirstName() == null || s.getFirstName().isBlank()) {
                throw new BadRequestException("Student.firstName cannot be null");
            }
            if (s.getLastName() == null || s.getLastName().isBlank()) {
                throw new BadRequestException("Student.lastName cannot be null");
            }
        }
    }
}