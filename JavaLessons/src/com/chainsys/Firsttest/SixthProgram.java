package com.chainsys.Firsttest;

public class SixthProgram {
	public static void main(String args[])
	{
		System.out.println("Is it raining? ---Press 1");
		System.out.println("colder than 32 degrees ---Press 2");
		System.out.println("between 32 and 50 degrees ---Press 3");
		System.out.println("Above 50 ---Press any key");		
		java.util.Scanner s = new java.util.Scanner(System.in);
		int user = s.nextInt();
		s.close();
		switch(user)
		{
		case 1:
				System.out.println("get an umbrella");
				break;
				
		case 2:
				System.out.println(" bring a heavy jacket");
				break;
				
		case 3:
				System.out.println("bring a light jacket");
				break;
		default:
				System.out.println("no jacket at all");
		}
	}
}
