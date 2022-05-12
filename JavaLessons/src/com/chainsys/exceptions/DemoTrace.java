package com.chainsys.exceptions;

public class DemoTrace {
	public static void main(String[] args) {
		  DemoTrace.testM4();
	}
	public static void m1()
	{
		try {
			m2();
		}catch(Exception er)
		{
			System.out.println("getMessage" + er.getMessage());
			er.printStackTrace();
//			Throwable t1=er.getCause();
//			if(null!=t1)
//			{
//				Class c1 = t1.getClass();
//				System.out.println("Cause" + c1.getName());
//			}
//			else
//				System.out.println("Cause in NULL");
		}
		finally
		{
			System.out.println("Inside m1 finally");
		}
	}
	public static void m2() {
	try {
		m3();
	}catch(Exception er) {
		System.out.println("getMessage" + er.getMessage());
		er.printStackTrace();
	}
	finally
	{
		System.out.println("Inside m2 finally");
	}
	}
	public static void m3(){
	try{
		m4();
	}catch(Exception er) {
		System.out.println("getMessage" + er.getMessage());
		er.printStackTrace();
	}
	finally
	{
		System.out.println("Inside m3 finally");
	}
	}
	public static void m4() throws Exception
	{
//		int x=0,y=0,z=0;
//		x=100;
//		z=x/y;
//		System.out.println("Result" + z);
		Exception e1=new Exception("Error 1");
		Exception e2=new Exception("Error 2",e1);// Inner Exception, e1 is nested inside e2
		throw e2;
	}
	public static void testM4()
	{
		try
		{
			m4();
		}
		catch(Exception e)
		{
			System.out.println("Inside catch" + e.getMessage());
			Throwable t1=e.getCause();
			System.out.println("Cause" + t1.getMessage());
		}
	}
}
