package day02;

import java.util.Scanner;

class Test19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// * 연산자문제*
		// 문제1. 정수 두개를 입력받고, 몫과 나머지를 출력하세요.
		/*System.out.println("입력1 : ");       
		int i = Integer.parseInt(sc.nextLine());
		System.out.println("입력2 : ");       
		int j = Integer.parseInt(sc.nextLine());
		
		System.out.println("몫 : " + (i / j) + ", 나머지 : " + (i % j));
		*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 문제2. 일수(day)를 입력받고, 몇개월 몇일인지 출력하세요. (단, 한달은 30일)
		/*System.out.println("정수를 입력하세요 : ");       
		int day = Integer.parseInt(sc.nextLine());
		
		System.out.println((day / 30) + "개월 " + (day % 30) + "일");
		*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 문제3. 점수 3개를 입력받고, 총점과 평균을 출력하세요.
		/*System.out.println("점수1 입력 : ");       
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("점수2 입력 : ");       
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("점수3 입력 : ");       
		int c = Integer.parseInt(sc.nextLine());
		
		System.out.println("총점 : " + (a+b+c) + " 평균 : " + ((a+b+c)/3));
		*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// *if문 문제
		// 문제4. 숫자 하나를 입력받고, "음수"인지, "양수"인지 출력하세요.
		/*System.out.println("숫자를 입력하세요 : ");       
		int num = Integer.parseInt(sc.nextLine());
		
		if(num > 0) {
			System.out.println("양수");
		}else if(num < 0) {
			System.out.println("음수");
		}else {
					System.out.println("0 입니다");
		}
		*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 문제5. 1~99 사이 숫자를 입력받고, "짝수"인지, "홀수"인지 출력하세요.
		/*System.out.println("1~99 사이의 숫자를 입력하세요 : ");       
		int Num = Integer.parseInt(sc.nextLine());
		
		if(Num >= 1 && Num < 100) {
			if((Num % 2) == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
				
			}
		}else {
			System.out.println("1~99 사이의 숫자가 아닙니다");
		}
		*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 문제6. 정수 3개를 입력받고, 가장 큰 수를 출력하세요.
		/*System.out.println("정수를 입력하세요 : ");       
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("정수를 입력하세요 : ");       
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("정수를 입력하세요 : ");       
		int num3 = Integer.parseInt(sc.nextLine());
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("가장 큰 수는 " + num1 + " 입니다");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("가장 큰 수는 " + num2 + " 입니다");
		}else {
			System.out.println("가장 큰 수는 " + num3 + " 입니다");
		}
		*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 문제7. 2차원 평면에서 직사각형은 왼쪽 모서리와 오른쪽 하단 모서리 두점으로 표현한다.(왼쪽위가 0,0)
		//    	 (100,100)과 (200,200)의 두점으로 이루어진 사각형이 있을 때,
		//		 Scanner를 이용해 정수 x,y 값을 입력받고,
		// 		 점 (x,y)가 이 직사각형 안에 있는지 판단하는 프로그램을 만드세요.
		/*System.out.println("정수를 입력하세요 : ");       
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("정수를 입력하세요 : ");       
		int y = Integer.parseInt(sc.nextLine());
		
		if(x >= 100 && x <= 200) {
			if(y >= 100 && y <= 200) {
				System.out.println("점 (x,y)는 직사각형 안에 있습니다.");
			}else {
				System.out.println("점 (x,y)는 직사각형 안에 존재하지 않습니다.");
			}
		}else {
			System.out.println("점 (x,y)는 직사각형 안에 존재하지 않습니다.");
		}
		*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 문제8. 369게임. 1~99까지 정수를 입력받고,
		//		  정수에 3.6.9중 하나가 있는 경우 " 박수짝"을 출력
		//		  두개가 있는 경우 "박수짝짝"을 출력해보세요.
		// 문제 힌트 . String str = "hello"; 

		System.out.println("정수를 입력하세요 : ");    
		
		
		String str = sc.nextLine();             // 문자열 str 값을 abc로 지정
		
		char ch1 = str.charAt(0);         		// 0번 인덱스의 숫자를 가져옴
		//System.out.println(ch1);
		char ch2 = str.charAt(1);               // 1번 인덱스의 숫자를 가져옴
		//System.out.println(ch2);
		
		int len = str.length();          		
		//System.out.println(len);
		
		if ((ch1 == '3' || ch1 == '6' || ch1 == '9') && (ch2 == '3' || ch2 == '6' || ch2 == '9')) {
			System.out.println("박수짝짝");   
		}else if((ch1 == '3' || ch1 == '6' || ch1 == '9') || (ch2 == '3' || ch2 == '6' || ch2 == '9')) {
			System.out.println("박수짝");  
		}else if((len == 1) && (ch2 == '3' || ch2 == '6' || ch2 == '9')) {
			System.out.println("박수짝");  
		}else {
			System.out.println(str);
		}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	      // switch문제 
		
	      // 문제9. 정수를 입력받아 3~5는 "봄", 
	      //        6~8은 "여름", 9~11은 "가을", 12~2는 "겨울을 출력.
	      //        그 외 다른수는 "잘못입력" 출력. 
		
		/*System.out.println("정수를 입력하세요 : ");       
		int season = Integer.parseInt(sc.nextLine());
		
		switch(season) {
		case 1 : case 2 : case 12 : 
			System.out.println("겨울");
			break;
		case 3 : case 4 : case 5 :
			System.out.println("봄");
			break;
		case 6 : case 7 : case 8 : 
			System.out.println("여름");
			break;
		case 9 : case 10 : case 11 : 
			System.out.println("가을");
			break;
		}
		*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	      // 문제10. 성적을 입력받고 90~100 "수", 80~89 "우", 
	      //         70~79 "미", 60~69 "양", 그 이하는 "가" 출력 
	      
		/*System.out.println("점수를 입력하세요 : ");       
		int score = Integer.parseInt(sc.nextLine());
		
		switch(score / 10) {
		case 10 : case 9 : 
			System.out.println("수");
			break;
		case 8 : 
			System.out.println("우");
			break;
		case 7 : 
			System.out.println("미");
			break;
		case 6 : 
			System.out.println("양");
			break;
		default : 
			System.out.println("가");
		}
		*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	      // 문제11. 숫자 두개와 사칙연산 기호 중 하나를 입력받아,
	      //         입력받은 값들의 사칙연산 결과를 출력하세요.
		
		/*System.out.println("숫자를 입력하세요 : ");       
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("숫자를 입력하세요 : ");       
		int m = Integer.parseInt(sc.nextLine());
		System.out.println("사칙연산 기호를 입력하세요 : ");       
		String cal = sc.nextLine();
		
		switch(cal) {
		case "+" :
			System.out.println(n + " " + cal + " " + m + " = " + (n + m) + " 입니다.");
			break;
		case "-" :
			System.out.println(n + " " + cal + " " + m + " = " + (n - m) + " 입니다.");
			break;
		case "*" :
			System.out.println(n + " " + cal + " " + m + " = " + (n * m) + " 입니다.");
			break;
		case "/" :
			System.out.println(n + " " + cal + " " + m + " = " + (n / m) + " 입니다.");
			break;
		}
		
		*/
		sc.close();
	}

}
