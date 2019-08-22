package com.cic.prep.java8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class CompletableFutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> cf = new CompletableFuture<>();
		cf.complete("Hello CompletableFuture");
		System.out.println(cf.get());

		CompletableFuture<String> cf1 = CompletableFuture.completedFuture("Hello");
		if(cf1.isDone()){
			System.out.println("Value -> "+cf1.get());
		}
	}
}
