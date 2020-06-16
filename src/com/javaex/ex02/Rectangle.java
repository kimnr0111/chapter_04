package com.javaex.ex02;

public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		Rectangle r = ((Rectangle)obj);
		if(this.width*this.height == r.width*r.height) {
			return true;
		} else {
			return false;
		}
	}

}
