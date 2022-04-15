package day05;

import java.util.Scanner;

//import day04.Test40;

class Tv6 {
	static int x = 100;
	int a =10;
}

public class Test58 {
	//static int a = 10;

	public static void main(String[] args) {
		
		//Tv6 tv = new Tv6();
		
		//Test56 t = new Test56(); 
		
		//Test40 tt = new Test40(); 
		
		Scanner sc = new Scanner(System.in);
				
		
		/*
		 *  자바 JVM 5개 영역으로 나눠서 사용
		 *  Class Area(Method Area) : static이 붙은 애들이 저장되는 곳
		 *  stack : 지역변수 저장되는 곳.
		 *  Heap : new~~, 
		 *  Native Method Stack Area : C언어 관련 데이터 저장
		 *  PC register
		 */
		
		/*
		int a = 200;			 // 선언한 위치가 다르면 변수명이 같아도 상관없다.
		System.out.println(a);   	 // 지역변수 a출력  = 200
		
		System.out.println(Test58.a);   // 클래스변수 a출력 = 10
		*/
		// 우선순위 : 지역변수 > 인스턴스 > 클래스
		
		
		
		sc.close();
		
		
		
	}

}
