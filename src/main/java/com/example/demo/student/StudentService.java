package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(1L, "Elsdon", "elsdonc21@gmail.com", 19, LocalDate.of(2004, 11, 21)));
    }
}
