package com.javaex.ex03;

public class StringApp2 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");

		a = a.concat(b);//문자열 결합
		System.out.println(a);
		System.out.println("====================");
		a = a.trim();//공백제거
		System.out.println(a);
		System.out.println("====================");
		a = a.replace("ab", "12");//문자 치환
		System.out.println(a);
		System.out.println("====================");
		String[] sArray = a.split(",");//문자를 기준으로 나눔
		for(int i=0;i<sArray.length;i++) {
			System.out.println(sArray[i]);
		}
		
		String s01 = "abc";
		String s02 = "def";
		
		if(s01.equals(s02)) {
			System.out.println("문자열이 같다.");
		} else {
			System.out.println("문자열이 다르다.");
		}
	}

}
