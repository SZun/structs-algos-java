package com.zun;

import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
		Employee employee = new Employee(123, "Jane", "Jones");
		Employee employee1 = new Employee(4567, "John", "Doe");
		Employee employee2 = new Employee(22, "Mary", "Smith");
		Employee employee3 = new Employee(3245, "Mike", "Wilson");
		Employee employee4 = new Employee(78, "Bill", "Nye");

		LinkedStack stack = new LinkedStack();

		stack.push(employee);
		stack.push(employee1);
		stack.push(employee2);
		stack.push(employee3);
		stack.push(employee4);

//	    stack.print();

		System.out.println(stack.peek());

		System.out.println("Popped: " + stack.pop());
//
		System.out.println(stack.peek());
    }

    public static boolean checkIsPalindrom(String s){
		Stack stack = new Stack();
		String res = "";
    	for(String i : s.split("")){
    		stack.push(i);
		}
		Iterator iterator = stack.iterator();
    	while(iterator.hasNext()){
    		res += iterator.next();
		}
    	return s.equals(res);
	}
}
