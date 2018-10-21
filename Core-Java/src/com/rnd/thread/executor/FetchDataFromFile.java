/**
 * 
 */
package com.rnd.thread.executor;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class FetchDataFromFile implements Runnable {

	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public FetchDataFromFile(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void run() {

		System.out.println("Fetching data from " + fileName + " by " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
			System.out.println("Read successfully " + fileName + " by " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
