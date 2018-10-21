package com.rnd.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRearrange {

	
	public static void main(String[] args) throws Exception {
		 Scanner in = new Scanner(new BufferedReader(new FileReader("input2.txt")));
		 int[] arr = null;
         while(in.hasNextLine()) {
             String line = in.nextLine().trim();
             String[] split = line.split(" ");
             if(split!= null && split.length>1){
            	 arr = new int[split.length];
            	 int numberToBeReplace = Integer.valueOf(in.nextLine().trim());
            	 for(int i =0;i<split.length;i++){
            		 int element = Integer.valueOf(split[i]);
            		 if(element == numberToBeReplace){
            			 arr[i] = 1;
            		 }else{
            			 arr[i] = element;
            		 }
            	 }
            	 Arrays.sort(arr);
            	 System.out.println(Arrays.toString(arr));
             }
         }
	}
}
