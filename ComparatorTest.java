package com.app.comparetor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(23, "Amit", 25, 35000));
		employees.add(new Employee(1, "Mahesh", 30, 44000));
		employees.add(new Employee(45, "Sagar", 32, 66000));
		employees.add(new Employee(20, "Vivek", 34, 33000));
		employees.add(new Employee(5, "Akshay", 25, 20000));
		employees.add(new Employee(3, "Omkar", 31, 15000));
		employees.add(new Employee(15, "Amar", 28, 10000));
		employees.add(new Employee(19, "Jitu", 18, 5000));
		employees.add(new Employee(5, "Krishna", 22, 5000));

		employees.forEach(System.out::println);
		System.out.println("+++++++++++++NAME+++++++++++++++++++++++++");
		Collections.sort(employees, new NameWiseSorting());
		employees.forEach(System.out::println);
		System.out.println("+++++++++++++AGE+++++++++++++++++++++++++");
		Collections.sort(employees, new AgeWiseSorting());
		employees.forEach(System.out::println);
		System.out.println("+++++++++++++Salary+++++++++++++++++++++++++");
		Collections.sort(employees, new SalaryWiseSorting());
		employees.forEach(System.out::println);

	}

}