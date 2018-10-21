/**
 * 
 */
package com.rnd.java8;

import java.util.function.Function;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class FinctionInterfaceDemo {

	public static void main(String[] args) {
		Function<String, Integer> length = str -> str.length();

		System.out.println("Length of string 'Hello World' is : " + length.apply("Hello World"));

	}
}
