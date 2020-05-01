package com.udemy;

public class Dog extends Animal{

    private int eye;
    private int leg;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight, int eye, int leg, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eye = eye;
        this.leg = leg;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("dog.chew()l called");
    }

    @Override
    public void getName() {
        super.getName();
    }w
}
