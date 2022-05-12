package com.chainsys.calcy;

public class TestCalculator {
	public static void main(String[] args) {
		ICalculator cal=new Operations();
		
		int result=cal.add(7, 3);
		System.out.println(result);
		result=cal.multiply(10, 4);
		System.out.println(result);
		result=cal.divide(15, 5);
		System.out.println(result);
	}
	
	
}
