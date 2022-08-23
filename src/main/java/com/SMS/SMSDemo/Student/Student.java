package com.SMS.SMSDemo.Student;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.persistence.GeneratedValue;

import java.time.LocalDate;
@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Student {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    public Long Id;
    public String name;

    public String email;
    public LocalDate dob;
    public int age;


    public Student(){
    }
    public Student( String name,String email,LocalDate dob,int age) {

        this.name = name;
        this.email=email;
        this.age = age;
        this.dob = dob;

    }

    public Student(Long id, String name, String email, LocalDate dob,int age) {
        Id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age='" + age + '\'' +
                ", dob=" + dob +
                '}';
    }
}
