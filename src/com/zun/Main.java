package com.zun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(123, "Jane", "Jones"));
        employeeList.add(new Employee(4567, "John", "Doe"));
        employeeList.add(new Employee(22, "Mary", "Smith"));
        employeeList.add(new Employee(3245, "Mike", "Wilson"));

        employeeList.add(3, new Employee(4567, "John", "Doe"));

//        employeeList.forEach(System.out::println);
//        System.out.println(employeeList.get(1));

        Employee[] employees = employeeList.toArray(Employee[]::new);
        System.out.println(Arrays.toString(employees));
    }
}
