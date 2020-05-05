package com.dojo;

public abstract class AbstractMonster implements MonsterInterface {
    public Monster createMonster(String mName, int mHealth, String mType) {
        Monster newMonster = new Monster(mName, mHealth, mType);
        return newMonster;
    }

    public String monsterInfo(Monster it) {
        return String.format("Name: %s, Health: %s, Type: %s", it.getName(), it.getHealth(), it.getType());
    }

}
