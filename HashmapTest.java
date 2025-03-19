package com.app.map;

//import java.util.Set;
//import java.util.TreeMap;
//import java.util.Map;
//
//import java.util.HashMap;
//
//public class mapTest {
//
//    public static void main(String[] args) {
//
//
//        TreeMap hm = new TreeMap<>();
//        hm.put(1,"AKSHAY");
//        hm.put(7, "Nish");
//        hm.put(3,  "LALA");
//        hm.put(2, "krish");
//        hm.put(4,"Joy");
//
//        System.out.println(hm);
//
//        Set setKeys =hm.keySet();
//        for(Object object :setKeys){
//            int key =(int) object;
//            String value = (String) hm.get(key);
//            System.out.println(key + "=" + value);
//        }
//
//        Set set =hm.entrySet();
//        for (Object object : set){
//            Map.entry() me =(Map.entry()) object
//            System.out.println(me.getKey() + "=" + me.getValue());
//        }
//
//    }
//}


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashmapTest {




    public static void main(String[] args) {

        /* Map m=new HashMap<>(); */
        TreeMap hm = new TreeMap();
        hm.put(1, "abc");
        hm.put(10, null);
        hm.put(3, null);
        hm.put(2, "pqr");

        System.out.println(hm);

        Set setKeys = hm.keySet();
        for (Object object : setKeys) {
            int key = (int) object;
            String value = (String) hm.get(key);
            System.out.println(key + "=" + value);
        }

        Set set = hm.entrySet();
        for (Object object : set) {
            Map.Entry me = (Map.Entry) object;
            System.out.println(me.getKey() + "=" + me.getValue());
        }

    }

}