package com.app.practical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class SolutionUsingMap {
    public static void main(String[] args) {
        ArrayList modernCollege = new ArrayList<>();
        modernCollege.add(new Student(101,"Amit") );
        modernCollege.add(new Student(102,"Ram"));

        ArrayList tssmCollege = new ArrayList<>();
        tssmCollege.add(new Student(103,"Shweta"));
        tssmCollege.add(new Student(104,"Ankita"));

        HashMap puneUni = new HashMap<>();
        puneUni.put("Modern College", modernCollege);
        puneUni.put("TSSM College", tssmCollege);

        ArrayList rajaramCollege = new ArrayList<>();
        rajaramCollege.add(new Student(101,"Rahul"));
        rajaramCollege.add(new Student(102,"Shubham"));

        ArrayList vivekanandCollege = new ArrayList<>();
        vivekanandCollege.add(new Student(103,"Wghmare"));
        vivekanandCollege.add(new Student(104,"Joy"));

        HashMap shivajiUni = new HashMap<>();
        shivajiUni.put("Rajaram College",rajaramCollege);
        shivajiUni.put("Vivekanand College", vivekanandCollege);

        HashMap university = new HashMap<>();
        university.put("Pune University", puneUni);
        university.put("Shivaji University", shivajiUni);


        System.out.println("+++++++++++++++++++++++++++++++++++");

        Set setOfUniversity = university.keySet();
        for(Object object : setOfUniversity){
            String universityKey = (String) object;
            System.out.println(universityKey);
            HashMap colleges =(HashMap) university.get(universityKey);
            Set setOfCollges = colleges.keySet();
            for (Object object2 : setOfCollges){
                String collegeskey =(String) object2;
                System.out.println("\t" + collegeskey);
                ArrayList students = (ArrayList) colleges.get(collegeskey);
                for (Object object3 : students){
                    Student student = (Student) object3;
                    System.out.println("\t\t" + student);
                }
            }
        }
    }
}
