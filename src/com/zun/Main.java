package com.zun;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] arr = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void bucketSort(int[] arr){
        List<Integer>[] buckets = new List[10];

        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new LinkedList<>();
            // buckets[i] = new ArrayList<>();
        }

        for(int i = 0; i < arr.length; i++){
            buckets[hash(arr[i])].add(arr[i]);
        }

        for(List bucket: buckets){
            Collections.sort(bucket);
        }

        int j = 0;

        for(int i = 0; i < buckets.length; i++){
            for(int val : buckets[i]){
                arr[j++] = val;
            }
        }
    }

    private static int hash(int value){
        return value / (int) 10;
    }

}
