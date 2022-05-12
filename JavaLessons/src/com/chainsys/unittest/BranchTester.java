package com.chainsys.unittest;

import com.chainsys.Bank.BankEmployee;
import com.chainsys.Bank.Branch;
import com.chainsys.Bank.Customer;

public class BranchTester {
	
	public static void testCustomer()
	{
		Customer firstCustomer = new Customer(1);
		firstCustomer.setName("C1");
		firstCustomer.setAddress("CCC");
		firstCustomer.setPhone_number(1234512345);
		firstCustomer.setE_mail_address("C1@gmail.com");
		System.out.println(firstCustomer.getName());
		System.out.println(firstCustomer.getAddress());
		System.out.println(firstCustomer.getPhone_number());
		System.out.println(firstCustomer.getE_mail_address());
	}
	
	public static void testEmployee()
	{
		BankEmployee firstEmployee = new BankEmployee(1);
		firstEmployee.setName("E1");
		firstEmployee.setAddress("EEE");
		firstEmployee.setPhone_number(1234554321);
		firstEmployee.setE_mail_address("E1@gmail.com");
		System.out.println(firstEmployee.getName());
		System.out.println(firstEmployee.getAddress());
		System.out.println(firstEmployee.getPhone_number());
		System.out.println(firstEmployee.getE_mail_address());
	}

}
