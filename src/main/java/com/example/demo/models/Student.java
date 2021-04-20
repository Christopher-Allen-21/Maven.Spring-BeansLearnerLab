package com.example.demo.models;

public class Student extends Person implements Learner{

    private double totalStudyTime = 0;

    public Student(Long id, String name) {
        super(id, name);
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }
}
