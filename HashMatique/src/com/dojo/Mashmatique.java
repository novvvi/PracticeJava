package com.dojo;

import java.util.HashMap;
import java.util.Set;

public class Mashmatique {

    public HashMap<String, String> create() {
        HashMap<String, String> mapofuser = new HashMap<String, String>();
        mapofuser.put("song1", "this is song1");
        mapofuser.put("song2", "this is song2");
        mapofuser.put("song3", "this is song3");
        mapofuser.put("song4", "this is song4");
        return mapofuser;
    }

    public void putSong(HashMap<String, String> hMap) {
        Set<String> keys = hMap.keySet();
        for (String key : keys) {
            System.out.println(String.format("Track: %s , Lyrics: %s",key, hMap.get(key)));
        }
    }

    public void putSong(HashMap<String, String> hMap, String title) {
        System.out.println(hMap.get(title));
    }
}
