/**
 * 
 */
package com.rnd.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class PredicateInterfaceDemo {

	public static void main(String[] args) {
		// Creating predicate
		Predicate<Integer> lesserthan = i -> (i > 0);

		// Calling Predicate method
		System.out.println(lesserthan.test(10));

		// Predicate Chaining

		Predicate<Integer> greaterThanTen = (i) -> i > 10;

		// Creating predicate
		Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
		boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
		System.out.println(result);// true

		// Calling Predicate method
		boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
		System.out.println(result2);// false

		pred(10, (i) -> i > 7);

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);

		//Predicate with ArrayList removeIf
		list.removeIf(num -> num % 2 == 0);
		System.out.println(list);

		//Predicate with filter
		
		Predicate<Integer> negative = n -> (n < 0);
		List<Integer> numbers = Arrays.asList(10, 20, 30, -10, -20, -30);
		long negativeCount = numbers.stream().filter(negative).count();
		System.out.println("Count of negative numbers in list numbers = " + negativeCount);

	}

	// Predicate in to function
	static void pred(int number, Predicate<Integer> predicate) {
		if (predicate.test(number)) {
			System.out.println("Number " + number);
		}
	}
}
