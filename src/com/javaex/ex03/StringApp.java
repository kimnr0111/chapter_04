package com.javaex.ex03;

public class StringApp {

	public static void main(String[] args) {

		String s01 = new String("hi");
		String s02 = new String("hi");
		
		System.out.println(s01 == s02); //주소가 다르다.
		
		System.out.println(s01.hashCode()); //해시코드는 주소라고 생각하면 x
		System.out.println(s02.hashCode());

		System.out.println("============================");
		
		String s03 = "hello";
		String s04 = "hello";
		
		System.out.println(s03 == s04); //주소가 같다.
		
		System.out.println(s03.hashCode());
		System.out.println(s04.hashCode());
	}

}
