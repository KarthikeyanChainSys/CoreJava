package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class TestEmployeeDao {
	public static void testGetAllEmployees()
	{
		List<Employee> allEmployees = EmployeeDao.getAllEmployees();
		Iterator<Employee> empIterator = allEmployees.iterator();
		while(empIterator.hasNext())
		{
			Employee emp = empIterator.next();
			System.out.println(emp.getEmp_id() + " " + emp.getFirst_name() + " " + emp.getSalary());
		}
	}
	
	public static void testGetEmployeeById()
	{
		Employee emp = EmployeeDao.getEmployeeByID(150);
		System.out.println(emp.getEmp_id() + " " + emp.getFirst_name() + " " + emp.getSalary());
	}
	
	public static void testInsertEmployee()
	{
		Employee newemp = new Employee();
		newemp.setEmp_id(500);
		newemp.setFirst_name("Gopi");
		newemp.setLast_name("nathan");
		newemp.setEmail("gopi@gmail.com");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		newemp.setHire_date(newDate);
		newemp.setJob_id("IT_PROG");
		newemp.setSalary(100000);
		int result = EmployeeDao.insertEmployee(newemp);
		System.out.println(result);
	}
	
	public static void testUpdateEmployee()
	{
		Employee oldemp = EmployeeDao.getEmployeeByID(300);
		System.out.println(oldemp.getEmp_id() + " " + oldemp.getFirst_name() + " " + oldemp.getSalary());
		oldemp.setFirst_name("James");
		oldemp.setLast_name("Jerry");
		oldemp.setEmail("Jerry@gmail.com");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		oldemp.setHire_date(newDate);
		oldemp.setJob_id("IT_PROG");
		oldemp.setSalary(100000);
		int result = EmployeeDao.updateEmployee(oldemp);
		System.out.println(result);
	}
	
	public static void testUpdateFirstName()
	{
		int result = EmployeeDao.updateEmployeeFirstName(102, "gopi");
		System.out.println(result +" row updated!");
	}
	
	public static void testDeleteEmployee()
	{
		int result = EmployeeDao.deleteEmployee(150);
		System.out.println(result);
	}
}
