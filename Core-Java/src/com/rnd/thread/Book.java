/**
 * 
 */
package com.rnd.thread;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class Book {

	public Book(String title) {
		super();
		this.title = title;
	}
	private String title;
	private boolean isCompleted;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
}
