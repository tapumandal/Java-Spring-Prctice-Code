package com.tapumandal.collection.list;

import java.util.List;

public class Chassis {
	
	private List<Wheel> wheels;
	
	
	public List<Wheel> getWheel() {
		return wheels;
	}




	public void setWheel(List<Wheel> wheel) {
		this.wheels = wheel;
	}




	public void theChassis(){
		System.out.println("Building A chassis");
		
		for(Wheel wheel : wheels) {
			System.out.println("Wheel Radious : "+wheel.getRadious());
			System.out.println("Wheel Width : "+wheel.getWidth());
			System.out.println("Wheel Position : "+wheel.getPosition());
		}
		
		System.out.println("DONE!!!");
	}
	

}
