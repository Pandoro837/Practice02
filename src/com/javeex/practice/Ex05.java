package com.javeex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int iHeight, iWeight;
		float fStandard;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		
		System.out.print("키 : ");
		iHeight = sc.nextInt();
		
		System.out.print("몸무게 : ");
		iWeight = sc.nextInt();
		
		fStandard = (iHeight-100) * 0.9F;
		
		if (iWeight >= fStandard) {
			
			if (iWeight == fStandard) {
				System.out.print("표준");
			}
			else {
				System.out.print("과체중");
			}
			
		}
		
		else {
			System.out.print("저체중");
		}
		
		System.out.println("입니다.");
		System.out.println("표준체중 : " + fStandard);
		
		sc.close();

	}

}
