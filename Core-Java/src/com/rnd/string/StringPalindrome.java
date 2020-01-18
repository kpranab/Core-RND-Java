package com.rnd.string;

/**
 * @author pranab
 *
 */
public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println(StringPalindrome.isPalindrome("civic"));
	}

	private static boolean isPalindrome(String str) {
		for (int i = 0; i < (str.length() / 2) + 1; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1))
				return false;
		}
		return true;
	}

}
