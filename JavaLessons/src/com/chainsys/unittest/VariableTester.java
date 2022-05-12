package com.chainsys.unittest;

import com.chainsys.variables.Demo;

/***
 * @author kart3128
 * @category To tests demo class, its field and method
 * date: Mar 24 2022 
 *
 */
public class VariableTester {
	/***
	 * Test static variable
	 */
	
	public static void testGlobalVariable()
	{
		System.out.println("DataA: " + Demo.DataA);
		//System.out.println("DataB: " + Demo.DataB);
		System.out.println("DataC: " + Demo.DataC);
		Demo.DataA=2345;
		System.out.println("DataA: " + Demo.DataA);
		/**
		 * Modifying  value of the static field DataC
		 * <b>ERROE:</b> The final field
		 */
	}
	
	
	public static void testImmutableVariable()
	{
	/*Cannot make a static reference to the non static field Demo.DataB*/
	//Demo.DataB + 123;
		/**
		 * first create an object or the class
		 * pass an int value as an argument to the constructor
		 * access the immutable instance field using the object reference 
		 */
		Demo firstObject=new Demo(123);
		System.out.println(firstObject.DataB);
		/**
		 * Value assigned to an immutable field cannot be changed
		 * Value for the immutable field can be assigned only through the constructors
		 **/
		//firstObject.DataB=567;
	}
	/**
	 *Calling static method using class name
	 *Without creating an object
	 *created on : 25 March 2022 
	 */
	public static void testStaticMethod()
	{
		Demo.sayHello();
	}
	/**
	 * Calling non-static method using object reference
	 * Without creating an object, non static methods can not be called
	 * created on : 25 March 2022 
	 */
	
	public static  void testNonStaticMethod()
	{
		//ERROR
		//Demo.greetUser();
		Demo firstObject = new Demo(111);
		firstObject.greetUser();
	}
}
