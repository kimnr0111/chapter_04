package com.javaex.ex01;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void draw() {
		System.out.println("Point(" + x + ", " + y + ")");
	}
	
	//equals 재정의
	public boolean equals(Object obj) {
		System.out.println("equals재정의");
		Point p = ((Point)obj);
		if(this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
		
	}
	

}
