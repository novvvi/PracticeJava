package com.dojo;

public class Monster {

    private String name;
    private int health;
    private String type;
    private static int count;

    public Monster(String mName, int mHealth, String mType) {
        name = mName;
        health = mHealth;
        type = mType;
    }


    public void attack(Monster it) {
        it.health -= 10;
        System.out.println(it.getHealth());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount() {
        Monster.count += 1;
    }
}
