package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    Instructors instructors;
    Students students;

    @Autowired
    public Alumni(Instructors instructors,Students students){
        this.students = students;
        this.instructors = instructors;
    }


    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }

    @PostConstruct  //denotes that this method must be executed before the class is put into an IoC
    public void executeBootcamp(){
        for(Student s : students.findAll()){
            s.learn(1200);
        }
    }
}
