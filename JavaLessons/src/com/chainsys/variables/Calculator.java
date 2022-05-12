package com.chainsys.variables;
/**
 * 
 * @author kart3128
 *created on : 25 March 2022
 */
public class Calculator {
/**
 * Add method: takes 2 integer values using the following parameters,
 * and will add the values. The result of totaling will be returned back to the caller
 * This a static method object reference is not required.
 * @param param1 of type int 
 * @param param2 of type int
 * @return type int
 */
	
	public int add(int param1, int param2)
	{
		int result = param1 + param2;
		return result;
	}
	
	/**
	 * multiply method: takes 2 integer values using the following parameters,
	 *  and will add the values. The product result will be returned back to the caller
	 * This a static method object reference is not required.
	 * @param param1 of type int 
	 * @param param2 of type int
	 * @return type int
	 */
	
	public int multiply(int param1, int param2)
	{
		int result = param1 * param2;
		return result;
	}
	
	/**
	 * subtract method: takes 2 integer values using the following parameters,
	 *  and will add the values. The remaining result will be returned back to the caller
	 * This a static method object reference is not required.
	 * @param param1 of type int 
	 * @param param2 of type int
	 * @return type int
	 */
	
	public int subtract(int param1, int param2)
	{
		int result = param1 - param2;
		return result;
	}

	/**
	 * divide method: takes 2 integer values using the following parameters,
	 *  and will add the values. The result will be returned back to the caller
	 * This a static method object reference is not required.
	 * @param param1 of type int 
	 * @param param2 of type int
	 * @return type int
	 */

	public int divide(int param1, int param2)
	{
		int result = param1 / param2;
		return result;
	}
}
