package com.chainsys.Firsttest;

public class SeventhProgram {

	public static void main(String args[])
	{
		System.out.println("Enter the name :");
		java.util.Scanner s = new java.util.Scanner(System.in);
		String name = s.nextLine();
		s.close();
		int length=name.length();
		if(length>8)
		{
			String nameInUppercase = name.toUpperCase();
			nameInUppercase = nameInUppercase.trim();
			char[] nameAsCharacters = nameInUppercase.toCharArray();
			int asciiValue = 0;
			int finalResult = 0; 
			for(int index = 0;index<length;index++)
				{
					asciiValue = (int) nameAsCharacters[index];
					if(asciiValue < 65 || asciiValue > 90)
					{
						if(asciiValue != 32)
						{
							System.out.println("In Valid Character in Name: ");
							finalResult++;
							break;
						}
					}
				}
			if(finalResult==0)
			{
				System.out.println("Given Name is only alphabet :" + " " + name);
			}
		}
		else
		{
		System.out.println("name is not less than 8 characters");	
		}
	}
}
