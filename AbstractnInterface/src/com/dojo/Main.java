package com.dojo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MonsterCollection book = new MonsterCollection();
        Monster firstmon = book.createMonster("us", 40, "water");
        Monster secondmon = book.createMonster("them", 50, "ground");

        book.listMonster();
    }
}
