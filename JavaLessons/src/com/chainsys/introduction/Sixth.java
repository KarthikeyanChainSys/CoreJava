package com.chainsys.introduction;
import java.util.Scanner;
public class Sixth {
	public static void main(String args[])
	{
		checkUserName();
	}
	public static void checkUserName()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		String userName = sc.next();
		sc.close();
		System.out.println("Name is " + userName);
		char[] nameAsCharacters = userName.toCharArray();
		int lengthOfCharArray = nameAsCharacters.length;
		System.out.println("Length of your name is :" + lengthOfCharArray);
		for(int index=0;index<lengthOfCharArray;index++) 
		{
			System.out.println(index + " " + nameAsCharacters[index]);
		}
		System.out.println("Length of your name is : " + lengthOfCharArray);
		if(lengthOfCharArray < 3)
		{
			System.out.println("Name must have atleast 3 chars");
			return;
		}
		if(lengthOfCharArray > 15)
		{
			System.out.println("Name must Not have more than 15 chars");
			return;
		}
		String nameInUppercase = userName.toUpperCase();
		nameInUppercase = nameInUppercase.trim();
		char[] uppercaseCharArray = nameInUppercase.toCharArray();
		lengthOfCharArray = uppercaseCharArray.length;
		int asciiValue = 0;
		for(int index = 0;index<lengthOfCharArray;index++)
			{
				asciiValue = (int) uppercaseCharArray[index];
				System.out.println("ASCII : " + asciiValue);
				if(asciiValue < 65 || asciiValue > 90)
					if(asciiValue != 32)
					{
						System.out.println("In Valid Character in Name: ");
						return;
					}
			}
	}
	
	
	
	public static void findEvenNumbers() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 digit Number");
		long value = sc.nextLong();
		sc.close();
		long num = value;
		long reminder = 0;
		while(num>0)
		{
			reminder = num%10;
			if(reminder%2==0)
			{
				System.out.println(reminder);
			}
			num=num/10;
		}
	}
	
	
	
	public static void swap() 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the 1st number :");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number :");
		int b = sc.nextInt();
		sc.close();
		System.out.println("Before Swapping :" + a + " " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping :" + a + " " + b);
			
	}
}