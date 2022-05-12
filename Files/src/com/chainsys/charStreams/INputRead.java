package com.chainsys.charStreams;

import java.io.IOException;
import java.io.InputStreamReader;

public class INputRead {

	public static void main(String[] args) throws IOException {
		char c;
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("Enter characters, 'q' to quit.");
		do
		{
			c = (char) isr.read();
			System.out.println(c);
		}while(c != 'q');
	}
}
