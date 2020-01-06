package com.rnd.numbers;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		System.out.println("Is Prime number : "+PrimeNumberCheck.isPrime(10));
	}
	
	public static boolean isPrime(int number) {
		boolean isPrime = true;
		for (int i = 2; i < number/2; i++) {
			if(number%i==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
