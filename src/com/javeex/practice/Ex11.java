package com.javeex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		String sAlphabet;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 한 글자(소문자)를 입력하세요.");
		
		System.out.print("알파벳 : ");
		sAlphabet = sc.nextLine();
		
		switch (sAlphabet){
			
			case "a":
					System.out.println("모음입니다.");
					break;
				
			case "e":
					System.out.println("모음입니다.");
					break;
					
			case "i":
				System.out.println("모음입니다.");
				break;
			
			case "o":
				System.out.println("모음입니다.");
				break;
				
			case "u":
				System.out.println("모음입니다.");
				break;
				
			default:
				System.out.println("자음입니다.");
				break;
		}
		
		sc.close();

	}

}
