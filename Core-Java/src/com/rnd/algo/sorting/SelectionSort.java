/**
 * 
 */
package com.rnd.algo.sorting;

import java.util.Arrays;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {2,7,4,1,5,3};
		
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for(int j = i+1;j<arr.length;j++){
				//find min
				if(arr[j]<arr[min]){
					min = j;
				}
			}
			//Swap
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		Arrays.stream(arr).forEach(System.out::println);
	}

}
