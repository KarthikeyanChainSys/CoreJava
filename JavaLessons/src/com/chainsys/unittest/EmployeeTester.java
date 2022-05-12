package com.chainsys.unittest;
import com.chainsys.classandmethods.Employee;

public class EmployeeTester {

	public static void testEmpName() {
		Employee firstEmployee = new Employee(1);
		firstEmployee.setName("karthi");
		System.out.println(firstEmployee.getName());
	}
	public static void testCity() {
		Employee firstEmployee = new Employee(1);
		firstEmployee.setCity("Cuddalore");
		System.out.println(firstEmployee.getCity());
	}
	public static void testSalary() {
		Employee firstEmployee = new Employee(1);
		firstEmployee.setSalary(100000);
		System.out.println(firstEmployee.getSalary());
	}
}
