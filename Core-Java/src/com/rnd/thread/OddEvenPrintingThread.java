/**
 * 
 */
package com.rnd.thread;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class OddEvenPrintingThread implements Runnable {

	static int number = 1;
	static Object lock = new Object();
	int reminder;
	public OddEvenPrintingThread(int reminder) {
		this.reminder = reminder;
	}

	@Override
	public void run() {
		while (number< 10) {
			synchronized (lock) {
				while (number%2 != reminder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName()+" :: "+number);
				number++;
				lock.notify();
			}
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		OddEvenPrintingThread oddThread = new OddEvenPrintingThread(1);
		OddEvenPrintingThread evenThread = new OddEvenPrintingThread(0);
		
		Thread odd = new Thread(oddThread," Odd");
		Thread even = new Thread(evenThread,"Even");
		
		odd.start();
		even.start();
	}

}
