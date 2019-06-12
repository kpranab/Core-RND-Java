/**
 * 
 */
package com.cic.prep.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class Employee {

	private int id;
	private String name;
	private double salary;
	private String designation;

	public Employee(int id, String name, double salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}

	public static List<Employee> getEmployees() {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(101, "Pranab", 70000, "Software Engineer"));
		employeeList.add(new Employee(102, "Pramod", 40000, "DevOps Engineer"));
		employeeList.add(new Employee(103, "Digbijoy", 50000, "Manager"));
		employeeList.add(new Employee(104, "Mamuni", 2000, "Student"));
		employeeList.add(new Employee(105, "Sony", 1000, "Heroin"));
		employeeList.add(new Employee(106, "Chandan", 15000, "Farmer"));

		return employeeList;

	}
}
