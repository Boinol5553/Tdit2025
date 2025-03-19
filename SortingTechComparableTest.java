package com.app.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingTechComparableTest {
    public static void main(String[] args) {
        List <Vendor> vendors = new ArrayList<>();
        vendors.add(new Vendor(105,"Rakesh"));
        vendors.add(new Vendor(112,"Mukesh"));
        vendors.add(new Vendor(107,"Kamlesh"));
        vendors.add(new Vendor(103,"Monghlesh"));
        vendors.add(new Vendor(109,"Ronit"));
        vendors.add(new Vendor(101,"Mohit"));
        vendors.stream().forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++");
        Collections.sort(vendors);
        vendors.stream().forEach(System.out::println);


    }
}
