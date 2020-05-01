package com.dojo;

public class Gorilla extends Mammal{

    public void throwSomething() {
        int totalEnergy = this.getEnergyLevel() - 5;
        this.setEnergyLevel(totalEnergy);
    }

    public void eatBananas() {
        int totalEnergy = this.getEnergyLevel() + 10;
        this.setEnergyLevel(totalEnergy);
    }

    public void climb() {
        int totalEnergy = this.getEnergyLevel() - 10;
        this.setEnergyLevel(totalEnergy);
    }
}
