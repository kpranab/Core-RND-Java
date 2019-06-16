/**
 * 
 */
package com.cic.prep.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Pranab Kumar Sahoo
 *
 */
public class Employee {

	private int id;
	private String name;
	private double salary;
	private String designation;
	private int age;

	public Employee(int id, String name, double salary, String designation, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.age = age;
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

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", age=" + age + "]";
	}

	public static List<Employee> getEmployeesList() {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(104, "Pranab", 70000, "Software Engineer",29));
		employeeList.add(new Employee(106, "Sony", 1000, "Heroin",15));
		employeeList.add(new Employee(105, "Pramod", 40000, "DevOps Engineer",27));
		employeeList.add(new Employee(102, "Digbijoy", 50000, "Manager",38));
		employeeList.add(new Employee(101, "Mamuni", 2000, "Student",16));
		employeeList.add(new Employee(103, "Chandan", 15000, "Student",13));

		return employeeList;

	}

	public static Map<Integer,Employee> getEmployeesMap(){
		Map<Integer,Employee> employeeMap = new HashMap<>();

		employeeMap.put(104, new Employee(104, "Pranab", 70000, "Software Engineer",29));
		employeeMap.put(106, new Employee(106, "Sony", 1000, "Heroin",15));
		employeeMap.put(105, new Employee(105, "Pramod", 40000, "DevOps Engineer",27));
		employeeMap.put(102, new Employee(102, "Digbijoy", 50000, "Manager",38));
		employeeMap.put(101, new Employee(101, "Mamuni", 2000, "Student",16));
		employeeMap.put(103, new Employee(103, "Chandan", 15000, "Student",13));

		return employeeMap;
	}
}
