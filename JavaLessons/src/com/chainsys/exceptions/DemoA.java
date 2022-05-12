package com.chainsys.exceptions;

import java.util.Scanner;

public class DemoA {
	public static void taskA()
	{
		System.out.println("Before Try");
		try {
				System.out.println("Inside try");
		} catch(Exception e) {
			System.out.println("Error");
		} finally {
			System.out.println("Inside finally");
		}
		System.out.println("After try");
	}
	
	public static void m4()
	{
		System.out.println("Before try");
		int x=0, y=0, z=0;
		String s1=null,s2=null;
		java.util.Scanner sc=null;
		try {
			sc=new Scanner(System.in);
			System.out.println("Inside try");
			System.out.println("Enter value for x");
			s1=sc.nextLine();
			System.out.println("Enter value for y");
			s2=sc.nextLine();
			x=Integer.parseInt(s1);
			y=Integer.parseInt(s2);
			z=x/y;
			System.out.println("Result" + z);
		}/*catch(Exception er)
		{
			System.out.println("Inside catch3" + er.getMessage());
			System.out.println("Error type" + er.getClass().getName());
		}*/
		catch(ArithmeticException er)
		{
			System.out.println("Inside catch1" + er.getMessage());
			System.out.println("Error type" + er.getClass().getName());
		}
		catch(NumberFormatException er)
		{
			System.out.println("Inside catch2" + er.getMessage());
			System.out.println("Error type" + er.getClass().getName());
		}
		catch(Exception er)
		{
			System.out.println("Inside catch3" + er.getMessage());
			System.out.println("Error type" + er.getClass().getName());
		}
		finally
		{
			System.out.println("Inside finally");
		}
	}

	
}
