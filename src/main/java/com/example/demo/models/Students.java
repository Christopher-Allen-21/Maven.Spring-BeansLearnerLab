package com.example.demo.models;

import java.util.List;

public class Students extends People<Student>{


    public Students(List<Student> personList) {
        super(personList);
    }

    @Override
    public String toString(){
        String returnString = "";
        for(Student s : this.findAll()){
            returnString += "\nId: "+s.getId()+"\tName: "+s.getName();
        }
        return returnString;
    }

}
