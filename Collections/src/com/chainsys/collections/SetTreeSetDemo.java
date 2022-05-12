package com.chainsys.collections;

import java.util.Iterator;
import java.util.TreeSet;

class SetTreeSetDemo {
	public static void main(String args[])
	{
		demoA();
	}
	
	public static void demoA()
	{
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Cut");
		ts.add("Fun");
		ts.add("Assam");
		ts.add("Ball");
		ts.add("Dog");
		ts.add("Aag");
		ts.add("Event");
		//ts.add(null);
		ts.add("delhi");
		ts.add("carrot");
		ts.add("ball");
		ts.add("apple");
		ts.add("boy");
		ts.add("egg");
		ts.add("pool");
		System.out.println("Size :"+ts.size());
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}