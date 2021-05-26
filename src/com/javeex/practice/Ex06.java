package com.javeex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		int iNum01, iNum02;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 두개 입력해주세요.");
		
		System.out.print("숫자 1 : ");
		iNum01 = sc.nextInt();
		
		System.out.print("숫자 2 : ");
		iNum02 = sc.nextInt();
		
		if (iNum01 > iNum02) {
			System.out.println("큰 수 : " + iNum01 + "   " + "작은 수 : " + iNum02 + "입니다.");
		} else if (iNum01 == iNum02) {
			System.out.println("같은 수 입니다.");
		} else {
			System.out.println("큰 수 : " + iNum02 + "   " + "작은 수 : " + iNum01 + "입니다.");
		}
		
		sc.close();
		
	}
	
}
