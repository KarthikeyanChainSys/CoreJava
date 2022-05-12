package com.chainsys.Firsttest;

public class ThirdProgram {
	public static void main(String args[])
	{
		System.out.println("Enter the Number : ");
		java.util.Scanner s = new java.util.Scanner(System.in);
		int number = s.nextInt();
		s.close();
		int temp=number;
		int arm=0;
		while(number>0)
		{
			int n = number%10;
			arm =arm+(n*n*n);
			number/=10;	
		}
		System.out.println(arm);
		if(arm==temp)
		{
			System.out.println("Same Number");
		}
		else
		{
			System.out.println("Different Number");
		}
	}
}
