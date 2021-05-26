package com.javeex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int iAge;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		
		System.out.print("나이 : ");
		iAge = sc.nextInt();
		
		if (iAge >= 0) {
			if (iAge >= 19 && iAge < 65) {
				System.out.print("1번 그룹");
			}
			else {
				System.out.print("2번 그룹");
			}
		}
		
		System.out.println("입니다.");
		
		sc.close();
		
	}
	
}
