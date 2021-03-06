package com.zipcodewilmington.froilansfarm.superclasses;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {
    boolean isHarvested;
    boolean isFertalized = false;

    public void fertalizeMe(){
        isFertalized = true;
    }

    public boolean isHarvested() {
        return isHarvested;
    }

    public void setHarvested(boolean harvested) {
        isHarvested = harvested;
    }

    public boolean fertalizeStatus() {
        return isFertalized;
    }
}
