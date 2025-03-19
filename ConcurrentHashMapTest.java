package com.app.map;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> cm = new ConcurrentHashMap<>();
        cm.put("one", 1);
        cm.put("two", 2);
        cm.put("three",3);
        cm.put("one five", 15);
        cm.put("ten", 10);
        cm.put("two three",23);

        System.out.println(cm);
        ConcurrentHashMap<String, Integer> cm1= new ConcurrentHashMap<>();
        cm1.put("Four", 4);

        Set <String> set = cm1.keySet();
        for (String key : set){
            Integer value = cm1.get(key);
            System.out.println(key + " " + value);
        }

        System.out.println(cm +" "+ cm1);

        Set set1 = cm.entrySet();
        for (Object object: set1){
            Map.Entry me = (Map.Entry) object;
            System.out.println(me.getKey() + " " +me.getValue());
        }

    }
}