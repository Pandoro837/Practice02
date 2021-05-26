package com.javeex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		String sSymbol;
		float fNum01, fNum02, fResult;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력될 내용을 입력하세요.");
		
		System.out.print("기호 : ");
		sSymbol = sc.nextLine();
		
		System.out.print("숫자 1 : ");
		fNum01 = sc.nextFloat();
		
		System.out.print("숫자 2 : ");
		fNum02 = sc.nextFloat();
		
		switch (sSymbol) {
		
			case "+" :
				fResult = fNum01 + fNum02;
				System.out.println("결과는 : " + fResult);
				break;
			case "-" :
				fResult = fNum01 - fNum02;
				System.out.println("결과는 : " + fResult);
				break;
			case "*" :
				fResult = fNum01 * fNum02;
				System.out.println("결과는 : " + fResult);
				break;
			case "/" :
				if (fNum02 == 0) {
					System.out.println("계산할 수 없습니다.");
				} else {
				fResult = fNum01 / fNum02;
				System.out.println("결과는 : " + fResult);
				}
				break;
			default:
				System.out.println("계산할 수 없는 기호입니다.");
				break;
		}
		
		
		sc.close();
		
	}
	
}
