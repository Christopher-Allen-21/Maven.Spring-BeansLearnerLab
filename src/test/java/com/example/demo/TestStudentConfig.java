package com.example.demo;

import com.example.demo.configs.StudentConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)    //enforces strategy junit should use to run tests
@SpringBootTest     //indicates this class is a SpringBoot test class
public class TestStudentConfig {

    @Autowired
    StudentConfig studentConfig;

    @Test
    public void testCurrentStudents(){
        studentConfig = new StudentConfig();

        String expected = "\nId: 1\tName: Chris Allen\nId: 2\tName: Abe Figueroa\nId: 3\tName: Ashley Smart";
        String actual = studentConfig.currentStudents().toString();

        Assert.assertEquals(expected,actual);

    }



}
