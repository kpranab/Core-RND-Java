package com.cci.prep.arraysString;

import java.util.HashSet;

/**
 * @author Muna
 *
 */
public class UniqueCharacters {
	
	public static void main(String[] args) {
		String str = "pranab";
		System.out.println("Result : "+isUniqueChar(str));
	}

	private static boolean isUniqueChar(String str) {
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
	
	

}
