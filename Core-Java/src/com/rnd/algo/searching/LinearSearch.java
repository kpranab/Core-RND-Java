package com.rnd.algo.searching;

/**
 * @author pranab
 *
 */
public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 12, 34, 39, 45, 67 };
		int element = 12;
		System.out.println(LinearSearch.linearSearch(arr, element));

		System.out.println(LinearSearch.linearSearchRecursive(arr, 0, arr.length - 1, element));
	}

	public static int linearSearch(int arr[], int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element)
				return i;
		}
		return -1;
	}

	private static int linearSearchRecursive(int arr[], int index, int length, int element) {

		if (index > length)
			return -1;
		if (arr[index] == element)
			return index;
		return linearSearchRecursive(arr, index + 1, length, element);
	}
}
