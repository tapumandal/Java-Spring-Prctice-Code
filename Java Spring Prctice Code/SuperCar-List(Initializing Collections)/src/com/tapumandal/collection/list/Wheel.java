package com.tapumandal.collection.list;

public class Wheel {
	
	private int radious;
	private int width;
	private String position;
		
	public int getRadious() {
		return radious;
	}
	public void setRadious(int radious) {
		this.radious = radious;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	public String getTheWheel() {
		return "Radious:"+this.radious+" Width:"+this.width+" Position:"+this.position;
	}
	
	
}
