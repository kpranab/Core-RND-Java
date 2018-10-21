/**
 * 
 */
package com.rnd.thread;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class ThreadJoinTest {

	public static void main(String[] args) throws InterruptedException  {
		System.out.println(Thread.currentThread().getName()+" Start execution....");
		RunnableThread myThread = new RunnableThread();
		Thread thread1 = new Thread(myThread,"Thread 1");
		Thread thread2 = new Thread(myThread,"Thread 2");
		Thread thread3 = new Thread(myThread,"Thread 3");
		thread1.start();

		thread1.join();//Pause the current thread execution and start once die other thread will resume
		
		thread2.start();
		thread2.join(100);// lets waits for 1 sec or t2 to die which ever occurs first 
		
		thread3.start();
		thread2.join();
		thread3.join();
		
		System.out.println(Thread.currentThread().getName()+" End execution....");

		
	}
}

class RunnableThread implements Runnable{

	@Override
	public void run() {
		
		try {
			System.out.println(Thread.currentThread().getName()+" Start");
			Thread.sleep(400);
			System.out.println(Thread.currentThread().getName()+" End");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}