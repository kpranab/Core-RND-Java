/**
 * 
 */
package com.cic.prep.java8;

import java.util.List;
import java.util.stream.Collectors;

import com.cic.prep.pojo.Employee;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class StreamsDemo {

	public static void main(String[] args) {

		List<Employee> employeesList = Employee.getEmployeesList();
		List<Employee> filteredList = employeesList.stream().filter(employee -> !"Pranab".equalsIgnoreCase(employee.getName())).collect(Collectors.toList());
		System.out.println("**************************** Stream filter ******************************\n");
		filteredList.forEach(System.out::println);
	}

}
