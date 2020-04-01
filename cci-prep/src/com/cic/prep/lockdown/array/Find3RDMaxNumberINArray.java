package com.cic.prep.lockdown.array;

public class Find3RDMaxNumberINArray {

    public static void main(String[] args) {
        System.out.println(find3RdMaxNumberInArray(new int[]{1,2,3,4,5}));
    }

    public static Integer find3RdMaxNumberInArray(int arr[]){

        Integer max = null;
        Integer second_max = null;
        Integer third_max = null;
        for(Integer num : arr){
            if(num.equals(max)|| num.equals(second_max) || num.equals(third_max)){
                continue;
            }
            if(max == null || num>max){
                third_max = second_max;
                second_max = max;
                max = num;
            }else if(second_max == null || num>second_max){
                third_max = second_max;
                second_max = num;
            }else if(third_max == null || num>third_max){
                third_max = num;
            }
        }
        return third_max;
    }
}
