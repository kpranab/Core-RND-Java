package com.cci.prep.arraysString;

import java.util.HashSet;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class UniqueCharacters {
	
	public static void main(String[] args) {
		String str = "pranab";
		System.out.println("Result : "+isUniqueChars(str));
		System.out.println("Result : "+isUniqueChars1(str));
	}

	/**
	 * @param str
	 * @return true/false based on the input
	 *  Create a HashSet of character type , Iterate through loop and add to the HashSet
	 *  It will identify if there is already an existing character for the array in the set
	 */
	private static boolean isUniqueChars(String str) {
		HashSet<Character> set = new HashSet<Character>();
		boolean flag = true;
		for(int i= 0;i<str.length();i++){
			if(!set.add(str.charAt(i))){
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	/**
	 * @param str
	 * @return true/false based on the input
	 *  As we know we can't form a string of character more than 128 character alphabet.
	 *  It's also okay to assume 256 characters in case of extended ASCII
	 *  Create a boolean array of 128 character iterate the string through loop for each character
	 *  if character is present return false else mark as true for the unique character in the array
	 */
	private static boolean isUniqueChars1(String str){
		if(str.length() > 128)
			return false;
		boolean[] char_set = new boolean[128];
		for(int i = 0; i<str.length();i++){
			int val = str.charAt(i);
			if(char_set[val])
				return false;
			char_set[val] = true;
		}
		return true;
	}
	
}
