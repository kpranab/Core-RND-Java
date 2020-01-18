package com.rnd.string;

/**
 * @author pranab
 *
 */
public class StringReverse {

	public static void main(String[] args) {
		System.out.println(StringReverse.reverseString("Pranab"));
		System.out.println(StringReverse.reverseStringRecursive("abcdef"));
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

	// Using recursion
    private static String reverseStringRecursive(String str){
        // validation & base case
        if((str == null) || (str.length() <= 1)){
            return str;
        }
        // recursive call
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
