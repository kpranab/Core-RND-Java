package com.rnd.numbers;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		System.out.println("Is Prime number : "+PrimeNumberCheck.isPrime(10));

		//Display prime numbers
		//Scanner scanner = new Scanner(System.in);
		int number = 50;//scanner.nextInt();
		for(int i =2; i<number;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
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
