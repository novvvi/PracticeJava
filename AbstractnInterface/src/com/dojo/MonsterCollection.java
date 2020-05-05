package com.dojo;

import java.util.ArrayList;
import java.util.Arrays;

public class MonsterCollection extends AbstractMonster {

    public ArrayList<Monster> monsters = new ArrayList<Monster>();

    @Override
    public Monster createMonster(String mName, int mHealth, String mType) {
        Monster created = super.createMonster(mName, mHealth, mType);
        monsters.add(created);
        Monster.setCount();
        return created;
    }



    public void listMonster() {
        for(Monster mon: monsters) {
            String output = this.monsterInfo(mon);
            System.out.println(output);
        }
    }
}
