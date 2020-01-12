package com.rnd.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pranab
 *
 */
public class CountCharacters {

	public static void main(String[] args) {
		CountCharacters.countChar("I am an	Indian");
		CountCharacters.countCharUsingMap("I am an	Indian");
	}

	private static void countChar(String str) {
		char[] chArr;
		do {
			chArr = str.toCharArray();
			char ch = chArr[0];
			int count = 1;
			for (int i = 1; i < chArr.length; i++) {
				if (ch == chArr[i])
					count++;

			}
			// We don't need to count spaces
			if ((ch != ' ') && (ch != '	'))
				System.out.println(ch + "  -> " + count);

			// replace all occurrence of the character
			// which is already iterated and counted
			str = str.replace("" + ch, "");

		} while (chArr.length > 1);
	}

	private static void countCharUsingMap(String str) {
		Map<Character,Integer> countMap = new HashMap<>();
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == ' ' || ch == '	')
				continue;
			if(countMap.containsKey(ch))
				countMap.put(ch, countMap.get(ch)+1);
			else
				countMap.put(ch, 1);
		}
		countMap.forEach((k,v) -> System.out.println(k+ " -> "+v));
	}

}
