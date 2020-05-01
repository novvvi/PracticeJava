package com.dojo;

public class Bat extends Mammal{

    public Bat () {
        super();
        this.setEnergyLevel(300);
    }


    public void fly() {
        System.out.println("batman batman!");
        int totalEnergy = this.getEnergyLevel() - 50;
        this.setEnergyLevel(totalEnergy);
    }

    public void eatHumans() {
        System.out.println("sucky sucky 5dollars");
        int totalEnergy = this.getEnergyLevel() + 25;
        this.setEnergyLevel(totalEnergy);
    }

    public void attackTown() {
        System.out.println("bomb");
        int totalEnergy = this.getEnergyLevel() - 100;
        this.setEnergyLevel(totalEnergy);
    }
}
