package com.tapumandal.basic;

public class Wheel {
	
	private int radious;
	private int width;
	private String company;
		
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getTheWheel() {
		return "Radious:"+this.radious+" Width:"+this.width+" Company:"+this.company;
	}
	
	
}
