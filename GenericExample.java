package com.app.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GenericExample {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(23);
        num.add(43);
        num.add(54);
        num.add(65);

        for (Integer integer : num){
            System.out.println(integer);
        }

        HashSet<String> str = new HashSet<>();
        str.add("ram");
        str.add("sham");
        str.add("nikk");
        str.add("loki");
        str.add("chiku");

        for (String string : str){
            System.out.println(string);
        }

        HashMap <Integer,String> student = new HashMap<>();
        student.put(1,"kim");
        student.put(2,"rim");
        student.put(3,"yung");
        student.put(4,"joy");
        student.put(5,"venky");

        Set<Integer> setOfKeys = student.keySet();
        for (Integer key : setOfKeys) {
            String value = student.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
