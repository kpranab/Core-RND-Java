package com.rnd.numbers;

/**
 * @author pranab
 *
 */
public class ReverseNumber {

	public static void main(String[] args) {
		ReverseNumber.reverseNum(123);
		ReverseNumber.reverseRec(1234);
	}
	
	public static void reverseNum(int number) {
		int reverseNum = 0;
		while(number!=0) {
			int reminder = number%10;
			reverseNum = (reverseNum*10)+reminder;
			number = number/10;
		}
		System.out.println("Reverse is : "+reverseNum);
	}
	
	public static void reverseRec(int num) {
		if (num == 0)
			return;
		System.out.print(num%10);
		reverseRec(num/10);
	}
}
