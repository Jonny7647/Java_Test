package day03;

import java.util.Scanner;

public class Test27 {

	public static void main(String[] args) {

		// 중첩 반복문, 2중 for문
		
		for(int i = 0; i <=3; i++) {
			for(int j = 0; j <= 3; j++) {
				System.out.println(i + " " + j);
			}
		}
		 
		
///////////////////////////////////////////////////////////
		
		// 문제1. 구구단 2단 출력
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("2" + " x " + i + " = " + (2 * i));
		}
		
///////////////////////////////////////////////////////////
		
		// 문제2. 구구단의 단수를 입력받아, 해당 단을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 구구단 단수를 입력하세요");
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		
///////////////////////////////////////////////////////////
		
		// 문제3. 구구단 전체 출력
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("**** " + i + "단 ****");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
		
///////////////////////////////////////////////////////////
		
		// 문제3-1 구구단 전체 출력
		// 1단			2단			3단
		//1*1=1		   2*1=2	   3*1=3
		// ...
		// 7단			8단			9단
		//7*1=7		   8*1=8	   9*1=9
		//...
		
		for(int k = 1; k <=3; k++) {
			System.out.print("   "  +  k  + "단\t" + "\t");	
		}
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.print(j + " x " + i + " = " + (i * j));
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int k = 4; k <=6; k++) {
			System.out.print("   "  +  k  + "단\t" + "\t");	
		}
		System.out.println();
		
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 4; j <= 6; j++) {
				System.out.print(j + " x " + i + " = " + (i * j));
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int k = 7; k <=9; k++) {
			System.out.print("   "  +  k  + "단\t" + "\t");	
		}
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 7; j <= 9; j++) {
				System.out.print(j + " x " + i + " = " + (i * j));
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
///////////////////////////////////////////////////////////
		
		// 문제4. 별찍기
		/*
		 	* 
		   * *
		  * * *
		 * * * *
	   */ 
		
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
