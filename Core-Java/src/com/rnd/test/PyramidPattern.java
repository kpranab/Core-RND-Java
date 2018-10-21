/**
 * 
 */
package com.rnd.test;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class PyramidPattern {
	
	public static void main(String[] args) {
		//printStar(5);
		
		//printStar180(5);
		
		//printTriangle(5);
		
		//printInvertedHalfPyramid(5);
		
		printFloydsTryAngle(5);
	}
	
	private static void printFloydsTryAngle(int n){
		int number =1;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(number+" ");
				++number;
			}
			System.out.println();
		}
	}
	
	private static void printInvertedHalfPyramid(int n){
		for(int i=n;i>=0;--i){
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	private static void printTriangle(int n){
		int k = 2*n-2;
		for(int i=1;i<=n;i++){
			
			//Print space
			for(int j = 1;j<k;j++){
				System.out.print(" ");
			}
			//Decrement k
			k = k-1;
			//Print *
			for(int j =1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void printStar180(int n ){
		int k = 2*n-2;//for space
		for (int i = 0; i < n; i++) {
			//Print Space
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			//Decrement k after each loop
			k = k-2;
			
			//Print *
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	private static void printStar(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
}
