package com.javeex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		int iNum01, iNum02;

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자 : ");
		iNum01 = sc.nextInt();

		System.out.print("두번째 숫자 : ");
		iNum02 = sc.nextInt();

		if (iNum01 >= iNum02) {

			System.out.print(iNum02 + "는(은) " + iNum01 + "의 약수");

			if (iNum01 % iNum02 == 0) {
				System.out.println("입니다.");
			} else {
				System.out.println("가 아닙니다.");
			}

		} else {
			System.out.print(iNum01 + "는(은) " + iNum02 + "의 약수");
			
			if (iNum02 % iNum01 == 0) {
				System.out.println("입니다.");
			} else {
				System.out.println("가 아닙니다.");
			}
		}

		sc.close();

	}

}
