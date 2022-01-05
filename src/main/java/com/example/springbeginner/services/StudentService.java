package com.example.springbeginner.services;

import com.example.springbeginner.model.Student;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1,
                        "Mariam",
                        "maria@gmail.com",
                        23,
                        LocalDate.of(2022, Month.JANUARY, 23)

                )
        );
    }
}
