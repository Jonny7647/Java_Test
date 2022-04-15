package day02;

import java.util.Scanner; 

public class Test13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//문제1.  숫자 2개를 입력받고, 사칙연산의 결과를 출력해보세요

		System.out.println("숫자를 입력하세요 : ");
		int aInt = Integer.parseInt(sc.nextLine());
		System.out.println("숫자를 입력하세요 : ");
		int bInt = Integer.parseInt(sc.nextLine());

		
		System.out.println("결과값은 " + (aInt+bInt) + "입니다.");
		System.out.println("결과값은 " + (aInt-bInt) + "입니다.");
		System.out.println("결과값은 " + (aInt*bInt) + "입니다.");
		System.out.println("결과값은 " + (aInt/(double)bInt) + "입니다.");
		
		//////////////////////////////////////////////////////////////////////
		
		//문제2.  초단위 정수를 입력받고, 몇분 몇초인지 출력해보세요
		
		System.out.println("초를 입력하세요 : ");
	
		int input = Integer.parseInt(sc.nextLine());
		
		System.out.println((input / 60)+"분" + (input % 60)+"초");
		
		//////////////////////////////////////////////////////////////////////
		
		//문제3.  초단위 정수를 입력받고, 몇시간 몇분 몇초인지 출력해보세요
		
		 System.out.println("초를 입력하세요 : ");
		 int Input = Integer.parseInt(sc.nextLine());
		 
		 int Hour   = Input / 3600;
		 int Min    = (Input % 3600) / 60;
		 int SecInt = (Input % 3600) % 60;
		 
	     System.out.println(Hour + "시간" + Min + "분" + SecInt + "초");
	     
		//////////////////////////////////////////////////////////////////////
		
		//문제4.  최소화폐매수 구하기
		/*        금액을 입력하며, 최소한의 화폐매수를 구해주는 프로그램
		  		  금액입력 : 67800(사용자가 숫자입력)
		 			5만원 1장
		 			1만원 1장
		 			5천원 1장
		 			1천원 2장
		 			5백원 1개
		 			1백원 1개 
		 */
		
		System.out.println("금액을 입력하세요 : ");	
		int money = Integer.parseInt(sc.nextLine());
		
		System.out.println("5만원 : " + (money / 50000) + "장");
		System.out.println("1만원 : " + ((money % 50000)/10000) + "장");
		System.out.println("5천원 : " + ((money % 10000)/5000) + "장");
		System.out.println("1천원 : " + ((money % 5000)/1000) + "장");
		System.out.println("5백원 : " + ((money % 1000)/500) + "개");
		System.out.println("1백원 : " + ((money % 500)/100) + "개");

		sc.close();
		
	}

}
