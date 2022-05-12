package com.chainsys.unittest;
import com.chainsys.variables.Bank;

public class BankTester {
	public static void testDeposit()
	{
		System.out.println("Before Balance :" + Bank.currentBalance);
		Bank.deposit(5000);
		System.out.println("After Balance :" + Bank.currentBalance);
		
	}
	
	public static void testWithdraw() 
	{
		System.out.println("Before Balance :" + Bank.currentBalance);
		int withdraw = Bank.withdraw(1000);
		System.out.println("Withdraw amount is " + withdraw);
		System.out.println("After Balance :" + Bank.currentBalance);
	}
	
	public static void openAccount()
	{
	System.out.println("Customer Name and Account Number");
	Bank.openAccount("karthikeyan",1234567890);	
	System.out.println(Bank.customerName + " " + Bank.accountNumber);
	}
	
	
}
