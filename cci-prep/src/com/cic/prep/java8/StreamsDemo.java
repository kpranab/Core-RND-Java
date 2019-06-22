/**
 * 
 */
package com.cic.prep.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

import com.cic.prep.pojo.Employee;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class StreamsDemo {

	public static void main(String[] args) {

		List<Employee> employeesList = Employee.getEmployeesList();
		List<Employee> filteredList = employeesList.stream().filter(employee -> !"Pranab".equalsIgnoreCase(employee.getName())).collect(Collectors.toList());
		System.out.println("**************************** Stream filter ****************************************\n");
		filteredList.forEach(System.out::println);

		System.out.println("\n**************************** Stream filter with findAny.orElse(null) **************\n");
		Employee filteredEmp = employeesList.stream().filter(emp -> "Pramod".equalsIgnoreCase(emp.getName())).findAny().orElse(null);
		System.out.println(filteredEmp);

		System.out.println("\n**************************** Stream filter for multiple condition with findAny.orElse(null) **************\n");
		Employee filteredEmp1 = employeesList.stream().filter(emp -> "Pramod".equalsIgnoreCase(emp.getName()) && 27 == emp.getAge()).findAny().orElse(null);
		System.out.println(filteredEmp1);

		System.out.println("\n**************************** Stream to String ************************************\n");
		String empName = employeesList.stream().filter(emp -> 15 == emp.getAge()).map(Employee::getName).findAny().orElse("");
		System.out.println("Emp Name : "+empName);

		System.out.println("\n**************************** Stream of Employee obj to Employee name list **********\n");
		List<String> empNameList = employeesList.stream().map(Employee::getName).collect(Collectors.toList());
		empNameList.forEach(name -> System.out.println(name));

		System.out.println("\n**************************** Stream with map ********************************\n");
		List<String> alphaList = Arrays.asList("a","b","c","d","e");
		System.out.println(alphaList);
		List<String> resultAlphaList = alphaList.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(resultAlphaList);

		System.out.println("\n**************************** Stream with map apply to any data type **************\n");
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println(numList);
		List<Integer> resultNumList = numList.stream().map(n -> n*2).collect(Collectors.toList());
		System.out.println(resultNumList);

		System.out.println("\n*************************** Stream with Collectors groupBy *********************\n");
		System.out.println("\n--------------------------- Program to count number of repeation ---------------\n");
		List<String> items = Arrays.asList("apple", "orange", "banana", "pomogranate", "orange", "banana", "orange");
		Map<String, Long> itemCountMap = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(itemCountMap);

		System.out.println("\n************************** Stream with sort map by Key *************************\n");
		Map<String,Long> sortedByKeyMap = itemCountMap.entrySet().stream()
				.sorted(comparingByKey())
				.collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,LinkedHashMap::new));
		System.out.println(sortedByKeyMap);

		System.out.println("\n************************** Stream with sort map by Value *************************\n");
		LinkedHashMap<String, Long> sortedByValueMap = itemCountMap.entrySet().stream()
		.sorted(comparingByValue())
		.collect(toMap(e -> e.getKey(), e-> e.getValue(), (e1,e2) -> e2, LinkedHashMap::new));
		System.out.println(sortedByValueMap);

		System.out.println("\n************************* filter null values from a stream ***********************\n");
		Stream<String> language = Stream.of("java", "python", "scala", null, "R", ".Net", null, "ruby");
		List<String> result = language.collect(Collectors.toList());
		result.forEach(e -> System.out.println(e));
	}

}
