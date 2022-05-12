package com.chainsys.unittest;
import com.chainsys.variables.Calculator;
/***
 * @author kart3128
 * @category To tests demo class, its field and method
 * date: Mar 25 2022 
 *
 */
public class CalculatorTester {
	/***
	 * Test static variable
	 */

	
	public static void add()
	{
		com.chainsys.variables.Calculator secondObject = new Calculator();
		System.out.println(secondObject.add(10, 20));
	}
	
	public static void multiply()
	{
		com.chainsys.variables.Calculator secondObject = new Calculator();
		System.out.println(secondObject.multiply(10, 20));
	}
	
	public static void divide()
	{
		com.chainsys.variables.Calculator secondObject = new Calculator();
		System.out.println(secondObject.divide(20, 2));
	}
	
	public static void subtract()
	{
		com.chainsys.variables.Calculator secondObject = new Calculator();
		System.out.println(secondObject.subtract(20, 5));
	}
}
