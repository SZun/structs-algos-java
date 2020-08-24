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

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(employee1);
        list.addToFront(employee2);
        list.addToFront(employee3);
        list.addToFront(employee4);

        getPrintout(list);

        Employee employee5 = new Employee(1, "Bill", "Nye");

        list.addToEnd(employee5);

        getPrintout(list);

        list.removeFromFront();

        getPrintout(list);

        list.removeFromEnd();

        getPrintout(list);
    }

    private static void getPrintout(EmployeeDoublyLinkedList list){
        list.print();
        System.out.println(list.getSize());

    }
}
