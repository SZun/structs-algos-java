package com.zun;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee(123, "Jane", "Jones");
        Employee employee2 = new Employee(4567, "John", "Doe");
        Employee employee3 = new Employee(22, "Mary", "Smith");
        Employee employee4 = new Employee(3245, "Mike", "Wilson");
        Employee employee5 = new Employee(2345, "Bill", "Nye");

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(employee1);
        list.addFirst(employee2);
        list.addFirst(employee3);
        list.addFirst(employee4);

        printList(list);

        list.add(employee5);

        printList(list);

        list.removeFirst();

        printList(list);

        list.removeLast();

        printList(list);

        //        for(Employee i : list) System.out.println(i);
    }

    private static void printList(LinkedList list){
        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while(iter.hasNext()){
            System.out.print(iter.next() + " <=> ");
        }
        System.out.println("null");

        System.out.println("List size is now " + list.size());
    }

}
