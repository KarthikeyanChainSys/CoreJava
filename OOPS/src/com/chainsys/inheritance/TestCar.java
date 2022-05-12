package com.chainsys.inheritance;

public class TestCar {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.Regno="TN10X1234";
		c1.move();
		
		Vehicle v1=new Vehicle();
		v1.Regno="TN22X5678";
		v1.move();
		
		Vehicle innova=new Vehicle();
		Vehicle m800=new Vehicle();
		Vehicle ae3=new Vehicle();
		Vehicle fer=new Vehicle();
	}
}
/*"TN22X5679"
"TN22X5677"
"TN22X5676"
"TN22X5675"*/