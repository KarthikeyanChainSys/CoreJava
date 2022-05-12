package com.chainsys.classandmethods;
/**
 * This is class that contains employee related data 
 *the person has id, name, city and salary properties
 * @author kart3128
 *created on : 25 march2022
 */
public class Employee {
	private final int empID;
	private String name;
	private String city;
	private long salary;
	public Employee(int id)
	{
		this.empID=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getEmpID() {
		return empID;
	}


}