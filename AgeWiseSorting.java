package com.app.comparetor;

import java.util.Comparator;

public class AgeWiseSorting implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getAge() == o2.getAge())
        return 0;
        else if (o1.getAge()>o2.getAge())
            return 1;
        else
            return -1;


    }
}
