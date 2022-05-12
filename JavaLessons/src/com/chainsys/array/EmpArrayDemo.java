package com.chainsys.array;

public class EmpArrayDemo {
	private static Employee empArray[]; 
	public static void createArrayofEmployees()
	{
		empArray=new Employee[10];
		int index=0;
		for(index=0;index<10;index++)
		{
			Employee emp=new Employee(index);
			emp.setName("Emp"+index);
			empArray[index]=emp;
		}
	}
	
	public static void displayEmployees() {
		if(empArray==null) {
			System.out.println("Employee is null");
			return;
		}
		System.out.println("No. of Employees" + empArray.length);
		for(Employee e1 : empArray)
		{
			System.out.println("ID=" + e1.getId() + "Name=" + e1.getName());
		}
	}
}
