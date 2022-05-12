package com.chainsys.unittest;

import com.chainsys.variables.Book;

public class BookTester {
	public static void testauthorName()
	{
		Book firstBook = new Book("Karthi");
		firstBook.setBookName("Red");
		firstBook.setPublisher("keyan");
		firstBook.setYear(2022);
		System.out.println(firstBook.getAuthorName());
		System.out.println(firstBook.getBookName());
		System.out.println(firstBook.getPublisher());
		System.out.println(firstBook.getYear());
	}
	
}
