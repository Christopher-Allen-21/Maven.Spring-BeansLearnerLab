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
        return null;
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors(){
        return null;
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

