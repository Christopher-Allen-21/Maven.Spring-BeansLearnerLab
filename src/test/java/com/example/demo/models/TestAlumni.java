package com.example.demo.models;

import com.example.demo.configs.InstructorConfig;
import com.example.demo.configs.StudentConfig;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class TestAlumni {

    @Autowired
    StudentConfig studentConfig;
    @Autowired
    InstructorConfig instructorConfig;

    @Test
    public void testAlumniHaveBeenTaught1200Hours(){
        studentConfig = new StudentConfig();
        instructorConfig = new InstructorConfig();
        Alumni alumni = new Alumni(instructorConfig.zcwInstructors(),studentConfig.previousStudents());

        alumni.executeBootcamp();

        double expected1 = 1200;
        double actual1 = alumni.getStudents().findById(1l).getTotalStudyTime();

        double expected2 = 1200;
        double actual2 = alumni.getStudents().findById(2l).getTotalStudyTime();

        double expected3 = 1200;
        double actual3 = alumni.getStudents().findById(3l).getTotalStudyTime();

        Assert.assertEquals(expected1,actual1,0);
        Assert.assertEquals(expected2,actual2,0);
        Assert.assertEquals(expected3,actual3,0);

    }
}