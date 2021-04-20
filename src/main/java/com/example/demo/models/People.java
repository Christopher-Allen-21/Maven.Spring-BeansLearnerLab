package com.example.demo.models;

import java.util.Iterator;
import java.util.List;

public abstract class People<T extends Person> implements Iterable<Person>{
    private List<T> personList;

    public People(List<T> personList){
        this.personList = personList;
    }

    public void add(T person){
        personList.add(person);
    }

    public void remove(T person){
        personList.remove(person);
    }

    public int size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<T> persons){
        for(T person : persons){
            personList.add(person);
        }
    }

    public T findById(Long id){
        for(T person : personList){
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public List<T> findAll(){
        return personList;
    }

    public Iterator iterator(){
        CustomIterator<T> iterator = new CustomIterator<T>(personList);
        return iterator;
    }

    public class CustomIterator<T> implements Iterator<T>{
        int indexPosition = 0;
        List<T> internalList;

        public CustomIterator(List<T> internalList){
            this.internalList = internalList;
        }

        @Override
        public boolean hasNext() {
            if(internalList.size() > indexPosition){
                return true;
            }
            else{
                return false;
            }
        }

        @Override
        public T next() {
            T person = internalList.get(indexPosition);
            indexPosition++;
            return person;
        }
    }
}
