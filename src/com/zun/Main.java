package com.zun;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {-22, -15, 1, 7, 20, 35, 55};
        System.out.println(recursiveBinarySearch(arr, -15));
    }

    private static int iterativeBinSearch(int[] arr, int item){
        int start = 0;
        int end = arr.length;

        while (start < end){
            int midpoint = (start + end) / 2;

            if(arr[midpoint] == item) return midpoint;
            else if(arr[midpoint] < item) start = midpoint + 1;
            else end = midpoint;
        }

        return -1;
    }

    private static int linearSearch(int[] arr, int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value) return i;
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }

        int midpoint = (start + end) / 2;

        if (input[midpoint] == value) {
            return midpoint;
        }
        else if (input[midpoint] < value) {
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        }
        else {
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }
}
