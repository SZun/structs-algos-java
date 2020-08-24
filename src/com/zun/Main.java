package com.zun;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArr = {20,35,-15,7,1,-22};

        for(int i = 1; i < intArr.length; i++){
            int elNew = intArr[i];
            int j;

            for(j = i; j > 0 && intArr[j - 1] > elNew; j--){
                intArr[j] = intArr[j - 1];
            }

            intArr[j] = elNew;
        }

        System.out.println(Arrays.toString(intArr));
    }

}
