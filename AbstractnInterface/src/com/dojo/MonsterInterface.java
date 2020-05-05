package com.dojo;

public interface MonsterInterface {
    Monster createMonster(String name, int health, String type);
    String monsterInfo(Monster it);
    void listMonster();
}
