package com.javaex.basics;

import java.util.Scanner;

public class Types {

	public static void main(String[] args) {
	//	integerTypes();
	//	floatTypes();
	//	booleanEx();
	//	charEx();
		constantEx();
	}
	// 이유 1. 변경되면 안되는 값을 보호할 때
	// 이유 2. 코드의 가독성이 높아진다.
	private static void constantEx() {
		float PI = 3.14159F;
		final int SPEED_LIMIT = 110;	//	상수 생성 -> 앞에다가 final
		
		System.out.println("PI : " + PI);
		System.out.println("SPEED LIMIT : " + SPEED_LIMIT);
		
		int speed = 105;
		// 과속 단속
		boolean overspeed = speed > SPEED_LIMIT;
		System.out.println("과속 ? " + overspeed);
		
		/*SPEED_LIMIT = 80; // 내부에서 고의로든 실수로든 변경되선 안되는 값 -> 상수 
		overspeed = speed > SPEED_LIMIT;
		System.out.println("과속 ? " + overspeed);*/
	}
	
	// 내부에 문자에 해당하는 부호 없는 정수 코드 저장 (2byte)
	private static void charEx() {
		char ch1 = 'A'; // 내부에는 정수형 코드 저장
		char ch2 = '한';
		char ch3 = 'B';
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println(ch1 + ch2); //65 + 54510 문자는 숫자일 뿐이다 ㄷ-ㄷ.. 그저 무스비
		
		// 문자열은 "" 로
		String str = "java";
		System.out.println(str);
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score > 80) {
			System.out.println(ch1);
		}else {
			System.out.println(ch3);
		}
		sc.close();
	}
	
	private static void booleanEx() {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1 -> " + b1);
		System.out.println("b2 -> " + b2);
		
		// 비교 연산, 논리 연산의 결과를 담을 수 있는 자료형 'ㅅ';
		int var1 = 7;
		int var2 = 5;
		
		// 대소를 구분해보자 'ㅅ';
		boolean result = var1 > var2; // var1이 var2보다 큰가?
		System.out.println(result);
		
		System.out.println(7 > 5 ? 1 : 2);
	}
	
	private static void floatTypes() {
		float floatVar = 3.12345f;
		double doubleVar = 3.12345;
		
		System.out.println("floatVar : " + floatVar);
		System.out.println("doubleVar : " + doubleVar);
		// 지수 표기법 m * 10의 n승 
		int intVar = 300000;
		floatVar = 3E5F; // 3.0 * 10 ^ 5
		doubleVar = 3E-5; // 3.0 * 10의 -5승 
		
		System.out.println(0.1 * 3);
		
	}
	private static void integerTypes() {
		//	byte(1) < short(2) < int(4) < long(8)
		//	float(4) < double(8)
		//	Declaration
		int intVar1;
		int intVar2;
		//	초기화
		intVar1 = 2021; // 4byte 허용량
		// intVar2 = 12345678901234; // 4byte 초과량 'ㅅ';
		
		System.out.println(intVar1);
		
		long longVar1;
		long longVar2;
		
		longVar1 = 2021;
		longVar2 = 12345678901234l; // 뒤에 소문자든 대문자든 l을 붙이자
		
		System.out.println("longVar1 : " + longVar1);
		System.out.println("longVar2 : " + longVar2);
		
		//	2진수, 8진수, 16진수 형태로 입력 가능
		int bin = 0b1101; //	2진수를 나타낼 때는 앞자리에 0b를 붙여줘야만 한다!
		int oct = 072; //	8진수를 나타낼 때는 앞자리에 0을 붙여줘야만 한다!
		int hex = 0xFF; //	16진수를 나타낼 때는 앞자리에 0x를 붙여줘야만 한다!
		
		System.out.println("0b1101 : " + bin);
		System.out.println("072 : " + oct);
		System.out.println("0xFF : " + hex);
		
		
	}

}
