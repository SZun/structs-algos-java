package com.zun;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("not a palindrome"));
    }

    private static boolean isPalindrome(String s){
        LinkedList<Character> stack = new LinkedList();
        LinkedList<Character> queue = new LinkedList();

        for(char i : s.toLowerCase().toCharArray()){
            queue.addLast(i);
            stack.push(i);
        }

        return stack.equals(queue);
    }
}
