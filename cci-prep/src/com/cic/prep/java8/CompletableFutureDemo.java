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

		CompletableFuture<Void> cf2 = CompletableFuture.runAsync(() ->{
			System.out.println("Hello runAsync");
		});
		System.out.println("Value -> "+cf2.get());

		CompletableFuture cf3 = CompletableFuture.supplyAsync(() ->{
			return "supplyAsync";
		});
		System.out.println("Value -> "+ cf3.get());

		CompletableFuture<String> cf4 = CompletableFuture.supplyAsync(() ->{
			return "Hello";
		}).thenApply(v -> v.toUpperCase());
		System.out.println("Value -> "+cf4.get());
	}
}
