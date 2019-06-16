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
	}

}
