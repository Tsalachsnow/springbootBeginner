package com.example.springbeginner.config;

import com.example.springbeginner.model.Student;
import com.example.springbeginner.repositories.StudentRepository;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;

@Configuration
public class StudentConfig {

    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository) {
        return args -> {
                  Student mariam =  new Student(
                            1L,
                            "Mariam",
                            "maria@gmail.com",
                            23,
                            LocalDate.of(2022, Month.JANUARY, 23)

                    );
                            Student alex = new Student(
                                    2L,
                                    "Alex",
                                    "alex@gmail.com",
                                    25,
                                    LocalDate.of(2021, Month.JANUARY, 23)

                            );

                            studentRepository.saveAll(
                                    List.of(mariam, alex)
                            );
        };
    }
}
