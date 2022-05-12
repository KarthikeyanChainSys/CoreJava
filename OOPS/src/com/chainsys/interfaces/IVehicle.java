package com.chainsys.interfaces;

public interface IVehicle {
	//constant
		public final int MAXSPEED=150;	
		 abstract void echo();
		 abstract void start();
		 abstract void move();
		 abstract void stop();
}
