package com.rnd.algo.searching;

/**
 * @author pranab
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9, 13, 15, 17, 20 };
		int element = 3;
		int start = 0;
		int end = arr.length - 1;
		System.out.println(BinarySearch.binarySearch(arr, start, end, element));

		System.out.println(BinarySearch.binarySearchRecurcive(arr, start, end, element));
	}

	private static int binarySearch(int arr[], int start, int end, int element) {

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == element)
				return mid;
			else if (element < arr[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}

	private static int binarySearchRecurcive(int arr[], int start, int end, int element) {
		if (start > end)
			return -1;
		int mid = (start + end) / 2;
		if (arr[mid] == element)
			return mid;
		if (element < arr[mid])
			return binarySearchRecurcive(arr, start, mid - 1, element);
		else
			return binarySearchRecurcive(arr, mid + 1, end, element);
	}

}
