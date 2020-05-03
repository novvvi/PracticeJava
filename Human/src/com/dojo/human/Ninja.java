package com.dojo.human;

public class Ninja extends Human{

    public Ninja() {
        super();
        this.setStealth(10);
    }

    public void steal(Human who) {
        int heal = who.getHealth() - this.getStealth();
        int health = this.getHealth() + this.getStealth();
        System.out.println("steallller");
        who.setHealth(heal);
        this.setStealth(health);
    }

    public void runAway() {
        int health = this.getHealth() - 10;
        System.out.println("naroto run");
        this.setHealth(health);
    }


}
