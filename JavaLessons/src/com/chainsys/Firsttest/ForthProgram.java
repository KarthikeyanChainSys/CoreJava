package com.chainsys.Firsttest;

public class ForthProgram {
	public static void main(String args[])
	{
		String s2="Tom and Jerry are good friends";
		String[] ch = s2.split(" ");
		int length=ch.length;
		System.out.println("Words count :" + length);
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print("\t"+ch[i]);
		}
	}
}
