package com.zun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee(123, "Jane", "Jones");
        Employee employee2 = new Employee(4567, "John", "Doe");
        Employee employee3 = new Employee(22, "Mary", "Smith");
        Employee employee4 = new Employee(3245, "Mike", "Wilson");

        EmployeeLinkedList list = new EmployeeLinkedList();

        list.addToFront(employee1);
        list.addToFront(employee2);
        list.addToFront(employee3);
        list.addToFront(employee4);

        list.print();
        System.out.println("Size of EmployeeLinkedList is: " + list.getSize());
        list.removeFromFront();
        list.print();
        System.out.println("Size of EmployeeLinkedList is: " + list.getSize());

    }
}
