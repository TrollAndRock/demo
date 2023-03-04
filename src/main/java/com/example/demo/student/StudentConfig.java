package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student miriam = new Student("Miriam", "miriam@fmail.com", LocalDate.of(2000, 1, 5));
            Student alex = new Student( "alex", "alex@fmail.com", LocalDate.of(2004, 1, 5));
        repository.saveAll(List.of(miriam,alex));
        };

    }
}
