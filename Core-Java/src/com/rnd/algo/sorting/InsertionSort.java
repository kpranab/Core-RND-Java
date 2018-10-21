/**
 * 
 */
package com.rnd.algo.sorting;

import java.util.Arrays;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {2,7,4,1,5,3};
		
		for (int i= 1; i < arr.length; i++) {
			int value = arr[i];
			int key = i;
			while(key > 0 && arr[key-1]>value){
				arr[key] = arr[key-1];
				key = key-1;
			}
			arr[key] = value;
		}
		Arrays.stream(arr).forEach(System.out::println);
	}
}
