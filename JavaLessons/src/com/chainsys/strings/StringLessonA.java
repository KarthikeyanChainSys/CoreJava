package com.chainsys.strings;

public class StringLessonA {
	private static String thirdString;
	private static int firstNumber;
	private static int secondNumber;
	private static int thirdNumber;
	private static String s1;
	private static int length;

	public static void lessonOne()
	{
		//String is an array of characters
		String firstString = "Chainsys";
		System.out.println(firstString);
		char dataOne[] = {'C','h','a','i','n'};
		String secondString = new String(dataOne);
		System.out.println(secondString);
		String thirdString = new String(new char[]{'C','h','a','i','n'});
		System.out.println(thirdString);
	}
	
	public static void lessonTwo()
	{
		String firstString = "Hello";
		String secondString = "Hello";
		thirdString = "Hello";
		firstNumber = 100;
		secondNumber = 100;
		thirdNumber = 100;
		System.out.println(firstString +" "+ secondString);
		firstString = "Welcome";
		System.out.println(firstString +" "+ secondString);
	}
	
	public static void creatingStringInaForLoop()
	{
		for(int count=0;count<10;count++)
		{
			s1 = "Hello";
		}
	}
	
	public static void stringToCharArray()
	{
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a word");;
		String firstString = scanner.nextLine();
		scanner.close();
		int stringlength = firstString.length();
		System.out.println("Length"+stringlength);
		char[] data=firstString.toCharArray();
		int dataarraylength=data.length;
		System.out.println("Length"+dataarraylength);
	}

	public static void stringToUpperLower()
	{
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a word");
		String firstString = scanner.nextLine();
		scanner.close();
		System.out.println(firstString);
		String stringInUppercase=firstString.toUpperCase();
		System.out.println("toUpperCase="+stringInUppercase);
		
		System.out.println("s1="+firstString);
		String stringInLowercase=firstString.toLowerCase();
		System.out.println("toLowerCase="+stringInLowercase);
		System.out.println("s1="+firstString);
		// substring
		// from the 4th char till end
		String substring=firstString.substring(3);
		System.out.println(substring);
		// from 3rd char to 6th char (i.e excluding 7th char)
		// from index 2 to index 5
		substring=firstString.substring(2,6);
		System.out.println(substring);
		// replace
		String replacedstring = firstString.replace('a', 'e');
		System.out.println(replacedstring);
		// equals
		boolean flag1 = firstString.equals(stringInUppercase);// false
		System.out.println(flag1);
		// equalsIgnorCase
		boolean flag = firstString.equalsIgnoreCase(stringInUppercase);// true
		System.out.println(flag);
	}	

	public static void testStringTrim()
	{
		String secondString="	Hope		it		rain		";
		System.out.println("Before Trim: "+secondString.length());
		secondString=secondString.trim();
		System.out.println("After Trim: "+secondString.length());
	}
	
	public static void testSplit()
	{
		String firstString = "	Tom and Jerry are good friends	";
		String trimmedString = firstString.trim();
		String[] data = trimmedString.split("");
		int count = data.length;
		System.out.println("Word Count"+ " "+ count);
		for(int index=0;index<count;index++)
		{
			System.out.println(data[index]);
		}
	}

	public static void testSplitDays()
	{
		String weekdays = "Mon;Tue;Wed;Thu;Fri;Sat;Sun";
		String[] data = weekdays.split(";");
		int count = data.length;
		System.out.println("Days Count"+ " "+ count);
		for(int index=0;index<count;index++)
		{
			System.out.println(data[index]);
		}
	}

	public static void reverse()
	{
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence="";
		try {
			sentence = scanner.nextLine();	
		} finally {
			scanner.close();
		}
		char[] ch = sentence.toCharArray();
		length = sentence.length();
		for(int i = ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
		System.out.println(sentence);
	}

	public static void verifyString(String s1)// verify and print
	{
		if(null==s1)
		{
			System.out.println("String is Null");
			return;
		}
		else
			System.out.println("String is Not Null: "+s1);
		
		if(!s1.isEmpty())
			System.out.println("String Not Empty: " + s1);
		else
			System.out.println("String is Empty");
	}
}