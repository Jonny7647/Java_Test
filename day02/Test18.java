
package day02;

public class Test18 {

	public static void main(String[] args) {

		
		int a = 10;
		
		switch(a) {
		case 1 : 
			System.out.println("a는 1이다");    // 만약 a값이 1이면 case 1이 실행되고, 
			break;								
		case 2 : 
			System.out.println("a는 2이다");    // 만약 a값이 2이면 case 2가 실행되고,
			break;								
		case 10 : 
			System.out.println("a는 10이다");    // a값이 10 이므로 case 10이 실행.
			break; 								 // 생략가능
		}
		
		
		
		char ch = 'B';
		
		switch(ch) {
		case 'A' :    							
			System.out.println("A"); 			 // 만약 ch값이 'A'면 case A가 실행되고,
			break;								 
		case 'B' :  			 
			System.out.println("B");  			 // ch값이 'B'이므로 case B가 실행되고,
			break;								 // switch 함수 종료
		case 'C' : 
			System.out.println("C");
		}
		
		
		// 숫자 2개를 입력받고, 문자도 하나 입력받아 사칙연산 결과
		
		String aaa = "+";               // 문자열 aaa 값을 "+" 로 지정
		char aaaCH = aaa.charAt(0);     // aaaCH에 문자열 aaa의 0번 인덱스의 문자(+)를 대입
		System.out.println(aaaCH);		// + 출력
		
		// 문자열도 가능하다.
		String str = "hello";           // 문자열 str 값을 "hello" 로 지정   
		
		switch(str) {
		case "hello" : 							// str 값이 hello면 case "hello" 실행
			System.out.println("hellooooooo");	// hellooooooo 출력
			break;
		case "hhhhh" : 
			System.out.println("hhhhh");
		}
	}

}

