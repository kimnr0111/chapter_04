package com.javaex.ex01;

public class PointApp {

	public static void main(String[] args) {
		
		/*
		Point p = new Point(2, 3);
		System.out.println(p.getX());
		p.draw();
		
		//부모클래스에 있는 것들을 가져와 사용 가능
		System.out.println(p.getClass());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p.equals(p));
		*/
		
		
		//Object equals() 사용
		Point p01 = new Point(2, 3);
		Point p02 = new Point(2, 3);
		Point p03 = p01;
		
		System.out.println("===주소값==============");
		System.out.println(p01 == p02);
		System.out.println(p03 == p01);
		
		System.out.println("===실제값==============");
		System.out.println(p01.equals(p02));
	}

}
