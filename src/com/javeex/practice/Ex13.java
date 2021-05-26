package com.javeex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		float fNum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		System.out.print("숫자 : ");
		fNum = sc.nextFloat();
		
		if (fNum > 0) {
			fNum = (7 * fNum) + 2;
		} else {
			fNum = (fNum * fNum * fNum) - (9 * fNum) + 2;
		}
		
		System.out.println("계산 결과는 " + fNum + "입니다.");
		
		sc.close();

	}

}
