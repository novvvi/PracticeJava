package com.dojo;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Mashmatique obj = new Mashmatique();
        HashMap<String, String> songtrack = obj.create();
        obj.putSong(songtrack);
        obj.putSong(songtrack, "song1");
    }
}


