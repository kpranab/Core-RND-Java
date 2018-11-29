package com.rnd.java8;

/**
 * @author Muna
 *
 */
public class ThreadSample {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Start Thread Old Way");
				
			}
		}).start();
		
	//Using Lambda	
		new Thread(()->System.out.println("Start Thread in New Way")).start();
	}
}
