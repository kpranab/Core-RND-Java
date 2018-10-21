/**
 * 
 */
package com.rnd.thread.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class ThreadPoolExecutorFileRead {

	public static void main(String[] args) {
		// ExecutorService executorService = Executors.newFixedThreadPool(5);
		ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		for (int i = 1; i <= 10; i++) {
			FetchDataFromFile fileData = new FetchDataFromFile("File " + i);
			System.out.println("New file has been added to read : " + fileData.getFileName());
			executorService.submit(fileData);
		}
		executorService.shutdown();
	}
}
