package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student student1 = new Student("student1", "student1@gmail.com", 19, LocalDate.of(2000, Month.NOVEMBER, 2));
            Student student2 = new Student("student2", "student2@gmail.com", 18, LocalDate.of(2002, Month.NOVEMBER, 5));
            repository.saveAll(List.of(student1, student2));
        };
    }
}
