package com.example.demo;

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
public class TestInstructorConfig {

    @Autowired
    InstructorConfig instructorConfig;

    @Test
    public void testCurrentInstructors(){
        instructorConfig = new InstructorConfig();

        String expected = "\nId: 1\tName: Kris Younger\nId: 2\tName: Dolio Durant\nId: 3\tName: Chris Nobles";
        String actual = instructorConfig.zcwInstructors().toString();

        Assert.assertEquals(expected,actual);

    }
}
