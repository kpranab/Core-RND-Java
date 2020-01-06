package com.rnd.numbers;

public class SwapNumber {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("Brfore Swap : a : "+a+" b : "+b );
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swap : a : "+a+" b : "+b );
	}

}
