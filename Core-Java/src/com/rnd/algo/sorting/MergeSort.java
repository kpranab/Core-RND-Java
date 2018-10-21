/**
 * 
 */
package com.rnd.algo.sorting;

import java.util.Arrays;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class MergeSort {
	
	public static void main(String[] args) {
	
		int arr[] = {2,4,1,6,8,5,3,7};
		mergeSort(arr);

		Arrays.stream(arr).forEach(System.out::println);
	}
	
	public static void mergeSort(int arr[]){
		int length = arr.length;
		//if array having less than 2 element then break
		if(length<2)
			return ;

		int mid = length/2;
		
		int left[] = new int[mid];
		int right[] = new int[length-mid];
		
		for(int i=0;i<mid;i++)
			left[i] = arr[i];
		
		for(int i=mid;i<length;i++)
			right[i-mid] = arr[i];
		
		//recursive call to divide in to sub array
		mergeSort(left);
		mergeSort(right);
		
		//merge sub arrays
		merge(left,right,arr);
		
	}

	
	private static void merge(int[] left, int[] right, int[] arr) {
		int nL = left.length;
		int nR = right.length;
		
		int i = 0,j = 0,k=0;
		
		while(i < nL && j < nR){
			if(left[i] < right[j]){
				arr[k] = left[i];
				i++;
			}else{
				arr[k] = right[j];
				j++;
			}
			k++;//final array index
		}
		//merge left array remaining element
		while(i < nL){
			arr[k] = left[i];
			i++;
			k++;
		}
		//merge right array remaining element
		while(j < nR){
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	
	
	

}
