/**
 * 
 */
package com.rnd.algo.sorting;

import java.util.Arrays;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		int arr[] = {2,7,4,1,5,3};
		
		for (int i = 0; i < arr.length; i++) {
			
			boolean flag = false;
			
			for (int j = 0; j < arr.length-i-1; j++) {
				
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			
			if(!flag){
			break;
			}
				
		}
		Arrays.stream(arr).forEach(System.out::println);
	}

}
