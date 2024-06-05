package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(new Student(1L, "Elsdon", "elsdonc21@gmail.com", 19, LocalDate.of(2004, 11, 21)));
    }
}
