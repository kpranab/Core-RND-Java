package com.rnd.string;

/**
 * @author pranab
 *
 */
public class CountCharacters {

	public static void main(String[] args) {
		CountCharacters.countChar("I am an Indian");
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

}
