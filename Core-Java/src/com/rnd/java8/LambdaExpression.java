/**
 * 
 */
package com.rnd.java8;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class LambdaExpression {
	
	
	public static void main(String[] args) {
		MyLabdaFinctionalInterface msg = ()->{System.out.println("Hello");};
		msg.hello();
		
		MyCalCulator calculator = (x, y) ->  x+y;
		
		
		
		int add = calculator.add(10, 20);
		
		int sub = calculator.sub(30, 10);
		
		System.out.println(add + "  "+sub);
		

		FindFactorial factorial = (number) ->{
			int fact =1;
			for (int i = 1; i <=number; i++) {
				fact = i* fact;
			}
			return fact;
		};

		System.out.println("Facorial "+factorial.facorial(5));
	}

	
	
}

interface MyLabdaFinctionalInterface{
	void hello();
}

interface MyCalCulator{
	int add(int x , int y);
	
	default int sub(int x ,int y){
		return x-y;
	}
}

interface FindFactorial{
	int facorial(int x);
}
