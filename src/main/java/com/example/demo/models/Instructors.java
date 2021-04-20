package com.example.demo.models;

import java.util.List;

public class Instructors extends People<Instructor>{

    public Instructors(List<Instructor> personList) {
        super(personList);
    }

    @Override
    public String toString(){
        String returnString = "";
        for(Instructor s : this.findAll()){
            returnString += "\nId: "+s.getId()+"\tName: "+s.getName();
        }
        return returnString;
    }
}
