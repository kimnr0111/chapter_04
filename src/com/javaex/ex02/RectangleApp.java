package com.javaex.ex02;

public class RectangleApp {

	public static void main(String[] args) {

		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(6, 4);
		Rectangle c = new Rectangle(12, 2);
		Rectangle d = new Rectangle(3, 8);
		
		//주소값 비교
		System.out.println(a == b);
		System.out.println(b == c);
		System.out.println(a == c);
		System.out.println("================");
		//실제값 비교
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));
		System.out.println(a.equals(d));

	}

}

