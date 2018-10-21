/**
 * 
 */
package com.rnd.thread;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class BookReadWriteCommunication {

	public static void main(String[] args) {
		Book book = new Book("Artificial Inteligency");
		
		BookReader kevinReader = new BookReader(book);
		BookReader johnReader = new BookReader(book);
		
		Thread kevinThread = new Thread(kevinReader,"Kevin");
		Thread johnThread = new Thread(johnReader,"John");
		
		kevinThread.start();
		johnThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		BookWriter pranbWriter = new BookWriter(book);
		Thread pranabThread = new Thread(pranbWriter,"Pranab");
		pranabThread.start();
	}
}
