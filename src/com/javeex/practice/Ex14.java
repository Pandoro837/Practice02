package com.javeex.practice;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		
		float fMoney;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해주세요.(단위/만원)");
		
		System.out.print("금액 : ");
		fMoney = sc.nextFloat();
		
		if (fMoney > 0) {
			if (fMoney < 1000) {
				fMoney = 0.09F * fMoney;
			} else if (fMoney < 4000) {
				fMoney = 0.09F * 1000 + 0.18F * (fMoney - 1000);
			} else if (fMoney < 8000) {
				fMoney = 0.09F * 1000 + 0.18F * 3000 + 0.27F * (fMoney - 4000);
			} else {
				fMoney = 0.09F * 1000 + 0.18F * 3000 + 0.27F * 4000 + 0.36F * (fMoney - 8000);
			}
			System.out.println("소득세는 " + fMoney + "만원 입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
		
	}
}
