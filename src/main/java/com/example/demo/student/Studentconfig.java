package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class Studentconfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student miriam = new Student(
                    "Miriam",
                    "miriam@gmail.com",
                    LocalDate.of(2000, 2, 17)
            );

            Student elisha = new Student(
                    "Elisha",
                    "elisha@gmail.com",
                    LocalDate.of(2000, 2, 17)
            );

            repository.saveAll(
                    List.of(miriam, elisha)
            );
        };
    }
}
