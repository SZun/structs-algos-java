package com.zun;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        int[] intArr = {20, 35, -15, 7, 55, 1, -22};

        int[] intArr = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArr, 1, 10);

        System.out.println(Arrays.toString(intArr));
    }

    public static void countingSort(int[] input, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }

    }

}
