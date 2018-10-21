/**
 * 
 */
package com.rnd.thread;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class BookWriter implements Runnable {

	private Book book;
	
	public BookWriter(Book book) {
		super();
		this.book = book;
	}

	@Override
	public void run() {

		synchronized (book) {
			System.out.println(Thread.currentThread().getName()+" Auther is starting Book "+book.getTitle());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			book.setCompleted(true);
			System.out.println("Book writing has been completed now");
			book.notifyAll();
			System.out.println("Notifay all reader....");
//			book.notify();
//			System.out.println("Notifay one reader....");
		}
	}

}
