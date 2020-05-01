package com.dojo;

public class Mammal {

    private int energyLevel;

    public Mammal() {
        this.energyLevel = 10;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int displayEnergy() {
        System.out.println(this.energyLevel);
        return this.energyLevel;
    }


}
