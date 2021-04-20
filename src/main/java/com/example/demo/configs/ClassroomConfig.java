package com.example.demo.configs;

import com.example.demo.models.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassroomConfig {

    InstructorConfig instructorConfig;
    StudentConfig studentConfig;

    @Bean(name = "currentCohort")
    public Classroom currentCohort(){
        return new Classroom(instructorConfig.zcwInstructors(),studentConfig.currentStudents());
    }

    @Bean(name = "previousCohort")
    public Classroom previousCohort(){
        return new Classroom(instructorConfig.zcwInstructors(), studentConfig.previousStudents());
    }
}
