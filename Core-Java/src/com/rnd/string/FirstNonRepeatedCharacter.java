package com.rnd.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author pranab
 *
 */
public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		System.out.println(FirstNonRepeatedCharacter.getfirstNonRepeatedCharacter("abcdefghija"));
		System.out.println(FirstNonRepeatedCharacter.getfirstNonRepeatedCharacterUsingMap("pranab"));
	}

	private static String getfirstNonRepeatedCharacter(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
				return String.valueOf(str.charAt(i));
		}
		return "_";
	}

	private static String getfirstNonRepeatedCharacterUsingMap(String str) {
		Map<Character, Integer> countsMap = new LinkedHashMap<>(str.length());

		for (char c : str.toCharArray()) {
			countsMap.put(c, countsMap.containsKey(c) ? countsMap.get(c) + 1 : 1);
		}

		for (Entry<Character, Integer> entry : countsMap.entrySet()) {
			if (entry.getValue() == 1) {
				return String.valueOf(entry.getKey());
			}
		}
		return "_";
	}

}
