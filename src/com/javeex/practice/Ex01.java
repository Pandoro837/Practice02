package com.javeex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int age = 15;
		
		//age 가 0살 초과이고 18살 미만이면 
		
		/*if (0 < age < 18) {
			java의 조건식 안에는 한개의 조건에 
			두개 이상의 비교연산자를 넣을 수 없다*/
		if (age > 0 && age < 18) {	
			// 논리 연산자로 두 조건을 묶어주어 참 거짓을 구분한다
			System.out.println("청소년입니다.");
		}

	}

}
