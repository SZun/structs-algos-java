package com.zun;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArr = {20, 35, -15, 7, 55, 1, -22};

        Arrays.sort(intArr); // for smaller arrays
        Arrays.parallelSort(intArr); // for larger data sets

        System.out.println(Arrays.toString(intArr));
    }

}
