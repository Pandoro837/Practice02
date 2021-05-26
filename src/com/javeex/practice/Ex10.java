package com.javeex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		int iNum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요.");
		
		System.out.print("사번 : ");
		iNum = sc.nextInt();
		
		if (iNum >= 0) {
			if(iNum % 3 == 0) {
				System.out.print("A");
			} else if(iNum % 3 == 1) {
				System.out.print("B");
			} else {
				System.out.print("C");
			}
			System.out.println("팀 입니다.");
		} else {
			System.out.println("잘못 입려하셨습니다.");
		}
		
		
		
		sc.close();
		
	}
	
}
