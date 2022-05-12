package com.chainsys.variables;

public class Demo {
	// Static global variable
	public static int DataA;
	//Immutable global variable (non static)
	public final int DataB;
	//Constant
	public final static int DataC=300;
	//non static member field
	
	//Constructor
	/*
	 * Constructor: is a special method
	 * The name of the constructor and the name of the class will be same
	 * Constructor don't have return type
	 * Constructors can take parameters
	 */
	public Demo(int dataB)
	{
		/*Assigning value to the global read-only field (this.DataB)*/
		this.DataB=dataB;
	}
	/**
	 * static method can be called without an object
	 */
	public static void sayHello()
	{
		System.out.println("Hello Developer");
	}
	/**
	 * greetUser is a non static method
	 */
	public void greetUser()
	{
		System.out.println("Greeting USER");
	}

}