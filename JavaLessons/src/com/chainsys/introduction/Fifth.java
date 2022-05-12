package com.chainsys.introduction;

public class Fifth {
	public static void main(String args[])
	{
		printTriangle();
	}
	
	
	public static void printNumbersOneToTen() {
		int count = 0;
		for(count=0;count<=10;count++)
		{
			System.out.println(count + " ");
		}	
	}
	
	
	public static void printOneToTen() {
		int count = 0;
		for(count=10;count>=1;count--)
		{
			System.out.println(count + " ");
		}
	}
	
	
	public static void printMatrix() {
		int countA = 0;
		for(countA=1;countA<=10;countA++)
		{
			for(int countB=1;countB<=10;countB++) {
				System.out.print(countB + " ");
			}
			
		}
	}
	
	
	public static void printTriangle() {
		int countA = 0;
		for(countA=1;countA<=10;countA++)
		{
			for(int countB=1;countB<=countA;countB++)
			{
			System.out.print(countB + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void printTriangleB() {
		int countA = 0;
		for(countA=1;countA<=10;countA++)
		{
			for(int countB=1;countB<countA;countB++) {
				System.out.print(".");
			}
			for(int countC=countA;countC>=1;countC--)
			{
				System.out.print(countC);
			}
			System.out.println();
		}
	}
	
	
	public static void printDiamond() {
		int countA = 0;
		for(countA=1;countA<=5;countA++)
		{
			for(int countB=5;countB>countA;countB--)
			{
				System.out.print("-");
			}
			for(int countC=countA;countC>=1;countC--)
			{
				System.out.print("-"+countC+"-");
			}
			for(int countD=2;countD<=countA;countD++)
			{
				System.out.print("-"+countD+"-");
			}
			System.out.println();	
		}
		for(countA=4;countA>=1;countA--)
		{
			for(int countB=4;countB>=countA;countB--)
			{
				System.out.print("-");
			}
			for(int countC=countA;countC>=1;countC--)
			{
			System.out.print("-"+countC+"-");	
			}
			for(int countD=2;countD<=countA;countD++)
			{
				System.out.print("-"+countD+"-");
			}
			System.out.println();
			}
	}		
		
		
		public static void printEven() {
			
			for(int i=1;i<=100;i++) {
				if(i%2==0)
				{
					System.out.println(i);
				}
			}
		}
	}
	
