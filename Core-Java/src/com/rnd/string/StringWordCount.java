package com.rnd.string;

/**
 * @author pranab
 *
 */
public class StringWordCount {

	public static void main(String[] args) {
		System.out.println(StringWordCount.countWords("Hello	World	"));
		System.out.println(StringWordCount.countWordsUsingSplit("Hello	World	"));
	}
	
	private static int countWords(String str) {
		int count = 0;
		char ch[] = new char[str.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
			/**
             * if the character read is not a space or tab and the character read before the 
             * current char was either space or tab character that means one whole word is read so 
             * increment the count.  
             */
			if(((i > 0) && (ch[i] != ' ' && ch[i] != '\t') 
	                && (ch[i-1] == ' ' || ch[i-1] == '\t')) 
	                || ((ch[0] != ' ' && ch[0] != '\t') && (i == 0)))
				
	                  count++;
		}
		return count;
	}
	
	private static int countWordsUsingSplit(String str) {
		return str.trim().split("\\s+").length;
	}
}
