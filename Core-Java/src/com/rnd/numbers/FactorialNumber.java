package com.rnd.numbers;

/**
 * @author pranab
 *
 */
public class FactorialNumber {

	public static void main(String[] args) {
		System.out.println(FactorialNumber.calculateFactorial(5));
		System.out.println(FactorialNumber.calculateFactRec(5));
	}
	
	private static int calculateFactorial(int number) {
		int fact = 1;
		for(int i = number; i >= 1;i--) {
			fact = fact* i;
		}
		return fact;
	}
	
	private static int calculateFactRec(int number) {
		if(number == 1)
			return 1;
		else
			return number * calculateFactRec(number-1);
	}
}
