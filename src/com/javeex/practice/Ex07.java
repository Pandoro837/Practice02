package com.javeex.practice;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		
		int iNum01, iNum02;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		iNum01 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		iNum02 = sc.nextInt();
	
		if (iNum01 >= iNum02) {
			System.out.println("몫 : " + iNum01 / iNum02);
			System.out.println("나머지 : " + iNum01 % iNum02);
		}
		
		else {
			System.out.println("몫 : " + iNum02 / iNum01);
			System.out.println("나머지 : " + iNum02 % iNum01);
		}
		
		sc.close();
			
	}
	
}
