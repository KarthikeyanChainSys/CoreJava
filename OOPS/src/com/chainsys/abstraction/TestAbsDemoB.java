package com.chainsys.abstraction;

public class TestAbsDemoB {
	public static void main(String args[])
	{
		testDemoB();
		//testDemoA();
	}
	
	public static void testDemoA()
	{
		
	}
	
	public static void testDemoB()
	{
		// abstract class can not be instantiated
//		AbsDemoB objectDemob=new AbsDemoB();
		AbsDemoB objectDemob=new DemoBChild();
		objectDemob.echo();
	}
}
