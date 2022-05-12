package com.chainsys.strings;

public class StringBuilderDemo {
	public static void testA()
	{
		String firstString="Hello how are you today. Is the weather hot or cold.";
		StringBuilder stringbuilder=new StringBuilder();
		System.out.println("length = " + stringbuilder.length());
		System.out.println("capacity = " + stringbuilder.capacity());
		stringbuilder.append(firstString);
		System.out.println("buffer = " + stringbuilder);
		System.out.println("length = " + stringbuilder.length());
		System.out.println("capacity = " + stringbuilder.capacity());
		
		firstString="Wish it rains this week";
		stringbuilder.append(firstString);
		System.out.println("buffer = " + stringbuilder);
		System.out.println("length = " + stringbuilder.length());
		System.out.println("capacity = " + stringbuilder.capacity());
		
		// reduce capacity to length
		stringbuilder.trimToSize();
		System.out.println("length = " + stringbuilder.length());
		System.out.println("capacity = " + stringbuilder.capacity());
		
		stringbuilder.replace(3, 8, "-This is a Test-");
		System.out.println("replace = " + stringbuilder);
		
		stringbuilder.insert(10, "-This is August-");
		System.out.println("insert = " + stringbuilder);
		System.out.println("length = " + stringbuilder.length());
		System.out.println("capacity = " + stringbuilder.capacity());
		
		stringbuilder.delete(5, 20);
		System.out.println("delete = " + stringbuilder);
		System.out.println("length = " + stringbuilder.length());
		System.out.println("capacity = " + stringbuilder.capacity());
		
		stringbuilder.ensureCapacity(250);
		System.out.println("length = " + stringbuilder.length());
		System.out.println("capacity = " + stringbuilder.capacity());
	}
}
