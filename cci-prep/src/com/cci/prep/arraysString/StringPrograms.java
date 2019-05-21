/**
 * 
 */
package com.cci.prep.arraysString;

import java.util.Arrays;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class StringPrograms {

	public static void main(String[] args) {
		System.out.println("Is Permutation string : "+permutation("god", "dog"));

	}

	/**
	 * @param firstString
	 * @param secondString
	 * @return true/false based on the input
	 *  If both string length different return false else shot the string and check for equals
	 */
	private static boolean permutation(String firstString, String secondString) {
		if (firstString.length() != secondString.length())
			return false;
		return sort(firstString).equals(sort(secondString));
	}

	/**
	 * @param str
	 * @return Sorted string based on the input String
	 */
	private static String sort(String str) {
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}
}
