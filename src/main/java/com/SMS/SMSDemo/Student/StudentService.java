package com.SMS.SMSDemo.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRep;
    public StudentService(StudentRepository studentRep){
        this.studentRep=studentRep;
    }

    public List<Student> getStudent(){
        return null;
    }
}
