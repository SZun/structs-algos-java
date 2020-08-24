package com.zun;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArr = {20,35,-15,7,1,-22};

        for(int i = intArr.length -1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(intArr[j] > intArr[j+1]){
                    swap(intArr, j, j+1);
                }
            }
        }

        System.out.println(Arrays.toString(intArr));

    }

    private static void swap(int[] arr, int i, int j){
        if(i == j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
