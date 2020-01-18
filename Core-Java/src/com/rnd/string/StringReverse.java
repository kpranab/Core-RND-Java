package com.rnd.string;

/**
 * @author pranab
 *
 */
public class StringReverse {

	public static void main(String[] args) {
		System.out.println(StringReverse.reverseString("Pranab"));
	}

	private static String reverseString(String str) {
		// Validation
		if ((str == null) || (str.length() <= 1)) {
			return str;
		}
		String reverseString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString = reverseString + str.charAt(i);
		}
		return reverseString;
	}

}
