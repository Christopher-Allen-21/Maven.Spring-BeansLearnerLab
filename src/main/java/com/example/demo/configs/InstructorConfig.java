package com.example.demo.configs;


import com.example.demo.models.Instructor;
import com.example.demo.models.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorConfig {

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors(){
        List<Instructor> instructorList = new ArrayList<>();
        Instructor ph1 = new Instructor(1l,"US Placeholder 1"); instructorList.add(ph1);
        Instructor ph2 = new Instructor(2l,"US Placeholder 2"); instructorList.add(ph2);
        Instructor ph3 = new Instructor(3l,"US Placeholder 3"); instructorList.add(ph3);

        return new Instructors(instructorList);
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors(){
        List<Instructor> instructorList = new ArrayList<>();
        Instructor ph1 = new Instructor(1l,"UK Placeholder 1"); instructorList.add(ph1);
        Instructor ph2 = new Instructor(2l,"UK Placeholder 2"); instructorList.add(ph2);
        Instructor ph3 = new Instructor(3l,"UK Placeholder 3"); instructorList.add(ph3);

        return new Instructors(instructorList);
    }

    @Bean(name = "instructors")
    @Primary    // @Primary annotation ensures Spring will inject this bean in the case that an @Autowire annotation is not supplied w/ a @Qualifier annotation
    public Instructors zcwInstructors (){
        List<Instructor> instructorList = new ArrayList<>();
        Instructor krisY = new Instructor(1l,"Kris Younger"); instructorList.add(krisY);
        Instructor dolioD = new Instructor(2l,"Dolio Durant"); instructorList.add(dolioD);
        Instructor chrisN = new Instructor(3l,"Chris Nobles"); instructorList.add(chrisN);

        return new Instructors(instructorList);
    }

}

