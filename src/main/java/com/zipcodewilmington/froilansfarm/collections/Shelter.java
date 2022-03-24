package com.zipcodewilmington.froilansfarm.collections;

import com.zipcodewilmington.froilansfarm.subclasses.Horse;

import java.util.ArrayList;
import java.util.List;

public abstract class Shelter <T> {


    List<T> residents = new ArrayList<T>();

    public void add(T animal){
        residents.add(animal);
    }

    public Boolean contains(T animal) {
        return residents.contains(animal);
    }


    public List<T> getResidents() {
        return residents;
    }
}
