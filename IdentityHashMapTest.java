package com.app.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapTest {
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();
        hm.put("java", 1);
        hm.put(new String("java"), 2);
        System.out.println(hm);

        IdentityHashMap hm1 = new IdentityHashMap<>();
        hm1.put("java",1);
        hm1.put(new String("java"),2);
        System.out.println(hm1);
    }
}
