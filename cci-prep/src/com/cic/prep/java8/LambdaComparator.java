/**
 * 
 */
package com.cic.prep.java8;

import java.util.List;

import com.cic.prep.pojo.Employee;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class LambdaComparator {

	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployees();
		System.out.println(employeeList);
	}
}
