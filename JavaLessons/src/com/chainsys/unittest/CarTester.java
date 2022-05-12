package com.chainsys.unittest;

import com.chainsys.variables.Car;

public class CarTester {
	public static void testregNo() {
		Car firstCar = new Car("TN 20S 3456");
		firstCar.setColor("Red");
		firstCar.setFuel("petrol");
		firstCar.setYearOfPurchase(2022);
		System.out.println(firstCar.getRegNo());
		System.out.println(firstCar.getColor());
		System.out.println(firstCar.getFuel());
		System.out.println(firstCar.getYearOfPurchase());
	}
}