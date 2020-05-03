package com.dojo.human;

public class Samurai extends Human{

    private static int numberOfSamurai = 0;

    public Samurai() {
        this.setHealth(200);
        numberOfSamurai ++;
    }

    public void deathBlow(Human who) {
        int health = this.getHealth() / 2;
        System.out.println("a la la heal");
        this.setHealth(health);
        who.setHealth(0);
    }

    public void meditate() {
        int health = this.getHealth() + this.getHealth() / 2;
        System.out.println("be a stone");
        this.setHealth(health);
    }

    public void howMany() {
        int health = this.getHealth() + this.getHealth() / 2;
        System.out.println("be a stone");
    }

    public int getNumberOfSamurai() {
        return numberOfSamurai;
    }

    public void addNumberOfSamurai(int numberOfSamurai) {
        this.numberOfSamurai += numberOfSamurai;
    }

    public void setNumberOfSamurai(int numberOfSamurai) {
        this.numberOfSamurai = numberOfSamurai;
    }
}
