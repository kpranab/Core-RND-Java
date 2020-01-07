package com.rnd.numbers;

public class FibonacciNumber {

	public static void main(String[] args) {
		FibonacciNumber.printFibonacci(10);
		System.out.println();
		int number = 10;
		for (int i = 0; i <=number; i++) {
			System.out.print(printFibonacciRec(i)+" ");
			
		}
	}
	
	private static void printFibonacci(int num) {
		int num1, num3 = 0;
		int num2 = 1;
		for (int i = 0; i <=num; i++) {
			System.out.print(num3+" ");
			num1 = num2;
			num2 = num3;
			num3 = num1+num2;
		}
	}
	
	private static int printFibonacciRec(int number) {
		if(number==0)
			return 0;
		if(number==1)
			return 1;
		return printFibonacciRec(number-1)+ printFibonacciRec(number-2);
	}
}
