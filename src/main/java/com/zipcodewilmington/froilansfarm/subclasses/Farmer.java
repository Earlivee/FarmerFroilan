package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.interfaces.*;
import com.zipcodewilmington.froilansfarm.superclasses.*;

public class Farmer extends Person implements Botanist, Rider {
    @Override
    public <T extends Crop> Boolean plant(T typeOfCrop) {
        return null;
    }


    @Override
    public void Eat(Edible food) {

    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public void mount() {

    }

    @Override
    public void dismount() {

    }
}
