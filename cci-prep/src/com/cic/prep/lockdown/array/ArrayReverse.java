package com.cic.prep.lockdown.array;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        reverseArray(new int[]{1,2,3,4,5});
    }

    public static void reverseArray(int[] arr){
        for(int i = 0; i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
