package com.rnd.core;

import java.util.Arrays;

/**
 * @author Muna
 *
 */
public class CoreTest {

	public static void main(String[] args) {
		//System.out.println(factorial(5));
		//System.out.println(factRec(5));
		
		//fibonacci(5);
		
		System.out.println(isPalendrom("madam"));
	}

	/**
	 * 
	 */
	private static boolean isPalendrom(String str) {
		for(int i = 0, j= str.length()-1;i<str.length()/2;i++,j--){
			if(str.charAt(i)!= str.charAt(j)){
				return false;
			}
		}
		return true;
	}
	
	private static void fibonacci(int number){
		int n1 = 0;
		int n2 = 1;
		
		System.out.print(n1 + " "+ n2);
		for(int i=2; i<=number;i++){
			int n3 = n1+n2;
			System.out.print(" "+n3);
			n1 =n2;
			n2 = n3;
		}
	}
	
	private static int factorial(int number){
		int fact = 1;
		while(number > 0){
			fact *= number--;
		}
		return fact;
	}
	
	private static int factRec(int number){
		if(number == 0)
			return 1;
		return number* factRec(number-1);
	}

}
