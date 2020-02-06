package com.rnd.string;

/**
 * @author pranab
 *
 */
public class FirstNonRepeatedCharacter {
	
	public static void main(String[] args) {
		System.out.println(FirstNonRepeatedCharacter.getfirstNonRepeatedCharacter("abcdefghija"));
		System.out.println(FirstNonRepeatedCharacter.getfirstNonRepeatedCharacter("pranab"));
	}
	
	private static String getfirstNonRepeatedCharacter(String str) {
		
		for(int i = 0; i<str.length();i++) {
			if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
				return String.valueOf(str.charAt(i));
		}
		return "_";
	}

}
