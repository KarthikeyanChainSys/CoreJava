package com.chainsys.collections;

public class TestEmp {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String args[])
	{
		Emp firstEmp = new Emp(111,"Karthi");
		Emp secondEmp = new Emp(222,"Tommy");
		System.out.println(firstEmp.hashCode());
		System.out.println(secondEmp.hashCode());
		boolean result = firstEmp.equals(secondEmp);
		System.out.println(result);
		result = firstEmp.equals(firstEmp);
		System.out.println(result);
		result = firstEmp.equals("Hello");
		System.out.println(result);
	}
}
