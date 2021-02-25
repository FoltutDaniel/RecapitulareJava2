package com.zeke.recapitulare2.robot;

public class Robot {
	private int x;
	public Robot() {
		// TODO Auto-generated constructor stub
		this.x = 1;
	}
	
	public void change(int k) {
		this.x = k;
	}
	@Override
	public String toString() {
		
		return "The robot's position is "+ this.x;
	}
	public int getX() {
		return x;
	}
}
