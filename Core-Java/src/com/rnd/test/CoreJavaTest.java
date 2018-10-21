package com.rnd.test;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

/**
 * @author Muna
 *
 */
public class CoreJavaTest implements Serializable{


	public static void main(String[] args) {
	
		int[] arr={7,5,6,1,4,2};
		
		findMissingNumberInArray(arr);
		
		//findSecondHighestElementFromArray(arr);
		

		
		
	}

	/**
	 * @param arr
	 */
	private static void findMissingNumberInArray(int[] arr) {
		int n = arr.length+1;
		int sum=n*(n+1)/2;
			for (int i = 0; i < arr.length; i++) {
				sum= sum-arr[i];
			}
			System.out.println(sum);
	}

	private static void findSecondHighestElementFromArray(int[] arr) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		for(int i =0 ; i<arr.length;i++){
			if(arr[i]> highest){
				secondHighest = highest;
				highest = arr[i];
			}else if(arr[i]>secondHighest){
				secondHighest = arr[i];
			}
		}
	}

	
	
	private static void splitListByIndex(List list) {
		int bucket = 11;
		List<List<Integer>> parts = new ArrayList<List<Integer>>();
		final int N = list.size();
		for (int i = 0; i < N; i = i+bucket) {
			parts.add(new ArrayList<Integer>(list.subList(i, Math.min(N, i + bucket))));
			
		}
		System.out.println(parts);
	}
	

}
