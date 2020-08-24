package com.zun;

public class Main {

    public static void main(String[] args) {
	    Employee employee = new Employee(1,"A","A");
	    Employee employee2 = new Employee(2,"B","B");
	    Employee employee3 = new Employee(3,"C","C");
	    Employee employee4 = new Employee(4,"D","D");
	    Employee employee5 = new Employee(5,"E","E");

	    SimpleHashtable ht = new SimpleHashtable();

	    ht.put("A", employee);
	    ht.put("B", employee2);
	    ht.put("C", employee3);
	    ht.put("D", employee4);
	    ht.put("E", employee5);

        System.out.println(ht.print());
    }
}
