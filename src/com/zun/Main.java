package com.zun;

import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
		System.out.println(checkIsPalindrom("racecar"));
		System.out.println(checkIsPalindrom("I am not a palindrome"));
    }

    public static boolean checkIsPalindrom(String s){
		Stack stack = new Stack();
		String res = "";
    	for(String i : s.split("")){
    		stack.push(i);
		}
		Iterator iterator = stack.iterator();
    	while(iterator.hasNext()){
    		res += stack.pop();
		}
    	return s.equals(res);
	}
}
