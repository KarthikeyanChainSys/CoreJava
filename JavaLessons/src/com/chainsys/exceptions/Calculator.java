package com.chainsys.exceptions;

import java.util.Scanner;

public class Calculator {
	public int divide(int pValueA, int pValueB)
	{
		return pValueA/pValueB;
	}
	
	public static void testDivide(){
		Calculator calculator = null;
		int args1 = 100;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number less than 100");
		int args2 = scanner.nextInt();
		int result=0;
		System.out.println("Before");
		calculator = new Calculator();
		result = calculator.divide(args1, args2);
		System.out.println("Result" + result);
		System.out.println("After");
		scanner.close();
	}
	
	public static void testDivideWithTry() {
		/**
		 * Before Try: use for local variable declaration
		 * don't instantiate the variables here
		 */
		Calculator calculator = null;
		int args1 = 100, args2=0, result=0;
		Scanner scanner=null;
		System.out.println("Before Try");
		try {
			int localwithinTry=123;
			System.out.println("Inside try");
			scanner = new Scanner(System.in);
			System.out.println("Enter a number less than 100");
			args2 = scanner.nextInt();
			calculator = new Calculator();
			result = calculator.divide(args1, args2);
			System.out.println("Result" + result);
			System.out.println(localwithinTry);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println();
		}
		finally {
			System.out.println("Inside finally");
			scanner.close();
		}
		System.out.println("After Try-catch-finally");
	}
	
	public static void tryCatch()
	{
		System.out.println("Before try");
		try {
				System.out.println("Inside try");
		}
		catch(Exception e)
		{
			System.out.println("Inside catch" + e.getMessage());
		}
		System.out.println("After-Try-Catch");
	}
	
	public static void tryFinally()
	{
		System.out.println("Before Try");
		try {
			System.out.println("Inside Try");
		}
		finally
		{
			System.out.println("Inside finally");
		}
		System.out.println("After-Catch-Finally");
	}

	public static void multipleTry()
	{
		int x = 0;
		int y = 0;
		System.out.println("Before Try1");
		Scanner sc=null;
		try {
			sc=new Scanner(System.in);
		}catch(Exception e)
		{
			System.out.println("Error while creating Scanner" + e.getMessage());
			return;
		}
		System.out.println("After Finally 1");
		System.out.println("Before Try 2");
		try { // try 2
			System.out.println("Inside try2");
			System.out.println("Enter value for x");
			x=sc.nextInt();
		}catch(Exception e)
		{
			System.out.println("Inside catch - Invalid value for x" + e.getMessage());
			return;
		}// end of try 2
		System.out.println("After Finally 2");
		System.out.println("Before Try 3");
		try { // try 3
				System.out.println("Inside Try 3");
				System.out.println("Enter value for y");
				y=sc.nextInt();
		}catch(Exception e)
		{
			System.out.println("Inside catch - Invalid value for y" + e.getMessage());
			return;
		}
		finally
		{
			System.out.println("Inside inally 3");
			sc.close();
		}// end of try 3
		System.out.println("After finally 3");
		try {// try 4
			int z=x/y;
			System.out.println("z=" + z);
		}catch(Exception e)
		{
			System.out.println("Error in block 4:" + e.getMessage());
		}// end of try 4
		System.out.println("After try 4");
	}
	
	
}
