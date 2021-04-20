package com.example.demo.models;

import java.util.Collection;
import java.util.Collections;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int count = 0;

//        BELOW WOULD ONLY WORK IF learners WAS A COLLECTION
//        if(learners instanceof Collections){
//            count = ((Collection<?>)learners).size();
//        }

        for(Learner learner : learners){
            count++;
        }

        for(Learner learner : learners){
            learner.learn(numberOfHours/count);
        }
    }
}
