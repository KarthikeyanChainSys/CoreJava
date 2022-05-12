package com.chainsys.overload;

public class Kite {
	void fly(int distance)
	{
		System.out.println("Fly1" + distance);
	}
	void fly(double time, int speed)
	{
		System.out.println("Fly1" + time);
	}
	int fly(int time,int speed) {
		return time*speed;
	}
	void fall(String time)
	{
		System.out.println("Fall1" + time);
	}
	int fall(int distance)
	{
		System.out.println("Fall2" + distance);
		return distance;
	}
	void glide(int time)
	{
		System.out.println("Glide1" + time);
	}
	void glide(double time)
	{
		System.out.println("Glide2" + time);
	}
}
