package com.rnd.numbers;

/**
 * @author pranab
 *
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
