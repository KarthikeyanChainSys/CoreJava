package com.chainsys.variables;
/**
 * 
 * @author kart3128
 *created on : 25 March 2022
 */

public class Bank {

	public static int currentBalance;
	public static String customerName;
	public static int accountNumber;
	
	public static void deposit(int Amount)
	{
		currentBalance = currentBalance + Amount;
	}
	
	public static int withdraw(int Amount)
	{
		currentBalance = currentBalance - Amount;
		return Amount;
	}
	public static void openAccount(String Name, int AccountNumber)
	{
		customerName = Name;
		accountNumber = AccountNumber;
	}
	
}
