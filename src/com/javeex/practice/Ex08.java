package com.javeex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		int iNum01, iNum02, iNum03;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 세개 입력해주세요.");
		
		System.out.print("숫자 1 : ");
		iNum01 = sc.nextInt();
		
		System.out.print("숫자 2 : ");
		iNum02 = sc.nextInt();
		
		System.out.print("숫자 3 : ");
		iNum03 = sc.nextInt();
		
		
		System.out.print("가장 작은 수는 ");
		if (iNum01 < iNum02 && iNum01 < iNum03) {
			System.out.println(iNum01 + "입니다.");
		} else if (iNum02 < iNum01 && iNum02 < iNum03) {
			System.out.println(iNum02 + "입니다.");
		}  else if (iNum03 < iNum01 && iNum03 < iNum02) {
			System.out.println(iNum03 + "입니다.");
		} else {
			System.out.println(iNum01 + "입니다.");
		}
		
		sc.close();
		
	}
	
}
