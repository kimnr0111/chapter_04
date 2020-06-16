package com.javaex.ex04;

public class WrapperApp {

	public static void main(String[] args) {
		
		Integer i = new Integer(10); //int i = 10;
		System.out.println(i);
		
		Integer i01 = new Integer(2);
		Integer i02 = new Integer(5);
		Integer result = i01 + i02;
		System.out.println(result);
		
		Integer result02 = new Integer(2) + new Integer(5);
		System.out.println(result02);
		
		Integer i03 = 4;
		System.out.println("====================");
		
		Integer i04 = 10; //박싱
		
		Integer i05 = new Integer(100);
		int i06 = i05; //언박싱
		System.out.println(i06);
		
		System.out.println("====================");
		
		Integer i10 = new Integer(100);
		
		int i11 = i10.parseInt("1234"); //문자를 숫자로 변환
		System.out.println(i11+1);
		
		int i12 = Integer.parseInt("1234"); //효율적
		System.out.println(i12+1);

		String s100 = new String("555");
		String s101 = s100.valueOf(100);
		System.out.println(s101 + 1);
	}

}
