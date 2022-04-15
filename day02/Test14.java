package day02;

public class Test14 {

	public static void main(String[] args) {

		// 비교연산자 : <, <=, >=, ==, != , 연산결과는 true/false 둘중 하나
		int a = 10;
		int b = 0;
		
		boolean result1 = a > b + 20;    // false
		boolean result2 = a >= b + 10;   // true
		boolean result3 = a == b + 10;   // true
		boolean result4 = a != b;        // true
				
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		//논리 연산자 : &&, ||
		// A && B : A와 B 둘다 참이어야 참.
		// A || B : A와 B 둘다 거짓이어야 거짓
		
		boolean result5 = a > b && a > 5;     
		System.out.println(result5);     // true
		
		boolean result6 = a < b || a < 5; 
		System.out.println(result6);     // false

		boolean result7 = a == 20 || a > b && a < 5;  // &&가 우선순위가 높아서 먼저 연산된다.
		System.out.println(result7);     // false
		
        //삼항연산자  조건식 ? 참일 때 값 : 거짓일 때 값;
        
		int res = a > 5 ? a : b;
		System.out.println("res : " + res);  // a는 5보다 크므로 참일 때 값이 출력
		char resch = a < b ? '0' : 'X';
		System.out.println(resch);           // a는 b보다 크므로 거짓일 때 값이 출력
		
		
	}

}
