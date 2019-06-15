/**
 * 
 */
package com.cic.prep.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cic.prep.pojo.Employee;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class LambdaComparator {

	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployees();
		System.out.println("********************* Employee List Before sort *****************************\n");
		employeeList.forEach(System.out::println);
		System.out.println("\n______________________Sort by name before Java8_____________________________\n");
		Collections.sort(employeeList,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		employeeList.forEach(emp -> System.out.println(emp));
	}
}
