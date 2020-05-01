package com.dojo.human;

public class Human {
    private int strength;
    private int stealth;
    private int intelligence;
    private int health;

    public Human() {
        this.setHealth(100);
    }

    public void attack(Human who) {
        int currentHealth = this.getHealth()  - who.strength;
        this.setHealth(currentHealth);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }


}
