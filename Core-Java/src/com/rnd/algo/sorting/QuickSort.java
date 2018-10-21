/**
 * 
 */
package com.rnd.algo.sorting;

import java.util.Arrays;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class QuickSort {
	
	public static void main(String[] args) {
		int arr[] = {7,2,1,6,8,5,3,4};
		
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	private static void quickSort(int[] arr, int start, int end) {

		if(start < end){
			//Find the partition index
			int pIndex = partition(arr,start,end);
			quickSort(arr, start, pIndex-1);
			quickSort(arr, pIndex+1, end);
		}
	}
	private static int partition(int[] arr, int start, int end) {
		//Consider last element as pivot 
		int pivot = arr[end];
		int pIndex = start;
		for(int i=start;i<end;i++){
			//If arr[i] less than pivot then swap with pIndex
			if(arr[i]<=pivot){
				swap(arr,i,pIndex);
				pIndex++;
			}
		}
		//at last swap pIndex value with pivot element 
		swap(arr, pIndex, end);
		//return pivot index
		return pIndex;
	}
	private static void swap(int[] arr, int i, int pIndex) {

		int temp = arr[i];
		arr[i] = arr[pIndex];
		arr[pIndex] = temp;
	}

}
