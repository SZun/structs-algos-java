package com.zun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee(123, "Jane", "Jones"));
        employeeList.add(new Employee(4567, "John", "Doe"));
        employeeList.add(new Employee(22, "Mary", "Smith"));
        employeeList.add(new Employee(3245, "Mike", "Wilson"));
    }
}
