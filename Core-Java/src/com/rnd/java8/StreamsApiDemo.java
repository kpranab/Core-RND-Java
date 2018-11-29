/**
 * 
 */
package com.rnd.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class StreamsApiDemo {

	
	public static void main(String[] args) {
		 
		List<Person> personList = Arrays.asList(new Person("Alex", 23),new Person("Bob", 13), new Person("Chris", 43));
		
		personList.stream().min(Comparator.comparing(Person :: getAge)).ifPresent(youngest -> System.out.println(youngest));
		
		personList.stream().max(Comparator.comparing(Person::getAge)).ifPresent(oldest -> System.out.println(oldest));
		
		//Sorting using lambda expression
		Collections.sort(personList,(objct1,object2)->objct1.getName().compareTo(object2.getName()));
		
		int[] numbers = {23,12,45,2,67};

		int minimum = IntStream.of(numbers).min().getAsInt();
		System.out.println("Min = " + minimum);
		int maximum = IntStream.of(numbers).max().getAsInt();
		System.out.println("Max = " + maximum);
		
//		IntStream.of(numbers).sorted().forEach(System.out::println);
		
		
		Stream<String> streamCountries = Stream.of("Germany", "England","China", "Denmark", "Brazil");
//		streamCountries.forEach(s->System.out.println(s));
//		streamCountries.forEach(System.out :: println);
		
//		streamCountries.forEach(System.out :: println);
//		streamCountries.filter(s->s.startsWith("E")).forEach(System.out::println);
		
		List<String> collect = streamCountries.collect(Collectors.toList());
		System.out.println(collect);
	}
}
