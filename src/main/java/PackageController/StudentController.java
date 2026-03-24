package PackageController;

import PackageService.StudentService;
import com.fasterxml.jackson.annotation.JsonFormat;
import entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping("/students")
    public String addStudents(@RequestBody  List<Student> newStudents) {
        List<Student> students = studentService.addStudents(newStudents);
        return students.stream()
                  .map(s -> s.getFirstName() + " " + s.getLastName())
                  .collect(Collectors.joining(", "));
    }
}
