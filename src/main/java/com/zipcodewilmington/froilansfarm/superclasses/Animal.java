package com.zipcodewilmington.froilansfarm.superclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Noisemaker;

public abstract class Animal implements Eater, Noisemaker {

    String name;

    public Animal(){}

    public Animal(String name){
        this.name=name;
    }


}
