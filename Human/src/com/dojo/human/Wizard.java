package com.dojo.human;

public class Wizard extends Human{

    public Wizard() {
        this.setHealth(50);
        this.setIntelligence(10);
    }

    public void heal(Human who) {
        int heal = who.getHealth() + this.getIntelligence();
        System.out.println("a la la heal");
        who.setHealth(heal);
    }

    public void fireBall(Human who) {
        int health = who.getHealth() - this.getIntelligence() * 3;
        System.out.println("all you get");
        who.setHealth(health);
    }


}
