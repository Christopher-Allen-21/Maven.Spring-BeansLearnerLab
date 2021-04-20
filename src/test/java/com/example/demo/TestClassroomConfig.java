package com.example.demo;

import com.example.demo.configs.ClassroomConfig;
import com.example.demo.configs.InstructorConfig;
import com.example.demo.configs.StudentConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassroomConfig {

    @Autowired
    ClassroomConfig classroomConfig;
    @Autowired
    InstructorConfig instructorConfig;
    @Autowired
    StudentConfig studentConfig;

    @Test
    public void testClassroomStudents(){
        instructorConfig = new InstructorConfig();
        studentConfig = new StudentConfig();
        classroomConfig = new ClassroomConfig(instructorConfig,studentConfig);

        String expected = "\nId: 1\tName: Chris Allen\nId: 2\tName: Abe Figueroa\nId: 3\tName: Ashley Smart";
        String actual = classroomConfig.currentCohort().getStudents().toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testClassroomInstructors(){
        instructorConfig = new InstructorConfig();
        studentConfig = new StudentConfig();
        classroomConfig = new ClassroomConfig(instructorConfig,studentConfig);

        String expected = "\nId: 1\tName: Kris Younger\nId: 2\tName: Dolio Durant\nId: 3\tName: Chris Nobles";
        String actual = classroomConfig.currentCohort().getInstructors().toString();

        Assert.assertEquals(expected,actual);

    }
}
