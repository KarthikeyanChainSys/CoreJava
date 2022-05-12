package com.chainsys.introduction;

public class Second {
	public static void main(String args[]) {
	taskA();
	taskB();
	System.out.println("End...");
	}
	public static void taskA()
	{
		int x = 100;
		int y = 200;
		int z = x + y;
		System.out.println("Result = " + z);	
	}
	
	public static void taskB()
	{
		int x = 100;
		int y = 200;
		int z = x * y;
		System.out.println("Result = " + z);	
	}
}