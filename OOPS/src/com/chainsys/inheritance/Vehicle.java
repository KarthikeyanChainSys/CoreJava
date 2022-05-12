package com.chainsys.inheritance;

public class Vehicle
{
  public String Regno;
  
  public Vehicle()   
  {
  	  System.out.println("Vehicle Constructed "+this.hashCode());
  }
  
  public void move()   
  {
	  System.out.println("Vehicle.move");
  }
 }