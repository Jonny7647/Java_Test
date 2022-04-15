package day06;

import java.util.Scanner;

// 계산기 클래스 : 정수 2개를 입력받아 결과를 리턴해주는 형태의  + - * / 메서드를 각각 출력
// 덧셈 sum, 뺄셈sub, 곱셉 mul, 나눗셈 div
class Cal{
	int sum(int a, int b) {
		int sum = a + b; 
		return sum;
	}
	int sub(int a, int b) {
		int sub = a - b;
		return sub;
	}
	int mul(int a, int b) {
		int mul = a * b;
		return mul;
	}
	double div(int a, int b) {
		if (b == 0){
			System.out.println("0으로 나눌수 없습니다");
			System.out.println();
		return 0;
		
		}else {
			double div = a / b;
			return div;
		}
	}
	
}


public class Test62 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 사칙연산 실행
		
		Cal c = new Cal();  	// 객체생성
		
		System.out.println("정수 2개를 입력해주세요!");
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());

		int result1 = c.sum(a, b);
		int result2 = c.sub(a, b);
		int result3 = c.mul(a, b);
		double result4 = c.div(a, b);
		System.out.println("두 수의 합은 : " + result1);
		System.out.println("두 수의 차는 : " + result2);
		System.out.println("두 수의 곱은 : " + result3);
		System.out.println("두 수의 나누기 몫은 : " + result4);
		
		
		

		
		
		sc.close();
	}

}
