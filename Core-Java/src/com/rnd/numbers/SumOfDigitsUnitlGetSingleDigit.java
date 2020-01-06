package com.rnd.numbers;

/**
 * @author pranab
 *
 */
public class SumOfDigitsUnitlGetSingleDigit {

	public static void main(String[] args) {
		System.out.println(SumOfDigitsUnitlGetSingleDigit.digSum(9));
	}
	
	public static int sumOfDigitsToSingleDigit(int number) {
		int sum = 0;
		while(number> 0 || number >9) {
			if(number == 0) {
				number = sum;
				sum = 0;
			}
			sum = sum + number%10;
			number = number/10;
		}
		return sum;
	}
	
	public static int digSum(int n) 
    { 
        if (n == 0)  
        return 0; 
        return (n % 9 == 0) ? 9 : (n % 9); 
    } 
}
