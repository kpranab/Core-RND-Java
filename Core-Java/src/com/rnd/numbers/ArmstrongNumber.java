package com.rnd.numbers;

/**
 * @author pranab
 *
 */

/**

An Armstrong number is a number that is equal to the sum of the digits in a number
raised to the power of number of digits in the number.

As Example - If we take 371, it is an Armstrong number as the number of digits here is 3, so

371 = 3 pow 3 + 7 pow 3 + 1 pow 3 = 27 + 343 + 1 = 371

 */
public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int num = 371;
		if(ArmstrongNumber.isArmstrongNum(num)) {
			System.out.println(num +" is ArmstrongNumber");
		}else {
			System.out.println(num +" is not ArmstrongNumber");
		}
	}
	
	public static boolean isArmstrongNum(int number) {
		String temp = number+"";
		int numLength = temp.length();
		int tempNum = number;
		int sum = 0;
		while(tempNum != 0) {
			int reminder = tempNum%10;
			sum = sum + (int)Math.pow(reminder, numLength);
			tempNum = tempNum/10;
		}
		System.out.println("Sum is : "+sum);
		return (sum == number) ? true : false;
	}

}
