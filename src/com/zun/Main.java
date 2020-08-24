package com.zun;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArr = {20, 35, -15, 7, 55, 1, -22};

        for (int gap = intArr.length / 2; gap > 0; gap /= 2) {


            for (int i = gap; i < intArr.length; i++) {
                int newElement = intArr[i];

                int j = i;

                while (j >= gap && intArr[j - gap] > newElement) {
                    intArr[j] = intArr[j - gap];
                    j -= gap;
                }

                intArr[j] = newElement;


            }

        }


        System.out.println(Arrays.toString(intArr));
    }

//    private static void mergeSort(int[] input, int start, int end){
//        if(end - start < 2){
//            return;
//        }
//
//        int mid = (start + end) / 2;
//
//        mergeSort(input, start, mid);
//        mergeSort(input, mid, end);
//        merge(input, start, mid, end);
//    }
//
//    private static void merge(int[] input, int start, int mid, int end) {
//        if(input[mid - 1] <= input[mid]) return;
//
//        int i = start;
//        int j = end;
//        int tempIndex = 0;
//
//        int[] temp = new int[end - start];
//        while(i < mid && j < end){
//            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
//        }
//
//        System.arraycopy(input, i, input, start + tempIndex, mid - i);
//        System.arraycopy(temp, 0, input, start, tempIndex);
//    }

}
