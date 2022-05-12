package com.chainsys.interfaces;

public abstract class VehicleAbstract implements IVehicle{
	@Override
	public void start() {
		System.out.println("Vehicle.Start");
	}
}

