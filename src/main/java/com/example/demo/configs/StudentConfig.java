package com.example.demo.configs;

import com.example.demo.models.Classroom;
import com.example.demo.models.Student;
import com.example.demo.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")    // a bean with no name attribute defaults to name of the method
    public Students currentStudents(){
        List<Student> studentList = new ArrayList<>();
        Student chrisA = new Student(1l,"Chris Allen"); studentList.add(chrisA);
        Student abeF = new Student(2l,"Abe Figueroa"); studentList.add(abeF);
        Student ashleyS = new Student(3l,"Ashley Smart"); studentList.add(ashleyS);
//        Student gregD = new Student(4l,"Greg Donnelly"); studentList.add(gregD);
//        Student hazelB = new Student(5l,"Hazel Becker"); studentList.add(hazelB);
//        Student jorgeT = new Student(6l,"Jorge Tapia"); studentList.add(jorgeT);
//        Student jBanks = new Student(7l,"Justin Banks"); studentList.add(jBanks);
//        Student kellyP = new Student(8l,"Kelly Porter"); studentList.add(kellyP);
//        Student mikeN = new Student(9l,"Mike Ninh"); studentList.add(mikeN);
//        Student monaliK = new Student(10l,"Monali Khandelwal"); studentList.add(monaliK);
//        Student ryanH = new Student(11l,"Ryan Hufford"); studentList.add(ryanH);
//        Student theresaM = new Student(12l,"Theresa Mashura"); studentList.add(theresaM);
//        Student xiongY = new Student(13l,"Xiong Yuan"); studentList.add(xiongY);
//        Student lenaL = new Student(14l,"Lena Litouka"); studentList.add(lenaL);

        return new Students(studentList);
    }

    @Bean
    public Students previousStudents(){
        List<Student> studentList = new ArrayList<>();
        Student placeHolder1 = new Student(1l,"Placeholder 1"); studentList.add(placeHolder1);
        Student placeHolder2 = new Student(2l,"Placeholder 2"); studentList.add(placeHolder2);
        Student placeHolder3 = new Student(3l,"Placeholder 3"); studentList.add(placeHolder3);
//        Student placeHolder4 = new Student(4l,"Placeholder 4"); studentList.add(placeHolder4);
//        Student placeHolder5 = new Student(5l,"Placeholder 5"); studentList.add(placeHolder5);

        return new Students(studentList);
    }
}
