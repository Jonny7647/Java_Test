package day03;

import java.util.Scanner;

public class Test26 {

	public static void main(String[] args) {

		// for문 문제
		
		//문제1. 10 ~ 30까지 출력
		
		for(int i = 10; i <= 30; i++) {
			System.out.println(i);
		}
		
		
////////////////////////////////////////////////////////////

		//문제2. 0 ~ 100까지 10단위로 출력
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i*10);
		}
		
		
////////////////////////////////////////////////////////////

		//문제3. 1 ~ 20까지 짝수만 출력
		
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
////////////////////////////////////////////////////////////

		//문제4. 1 ~ 100까지 홀수의 합을 출력
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		
////////////////////////////////////////////////////////////

		//문제5. 5 ~ 1까지 역순으로 출력
		for(int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		
////////////////////////////////////////////////////////////

		
		//문제6. 정수1개 입력받고, 1 부터 입력받은 수까지의 합을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = Integer.parseInt(sc.nextLine());
		int sum1 = 0;
		
		for(int i = 1; i <= num; i++) {
			sum1  += i;
		}
		System.out.println("sum : " + sum1);
		
		
	sc.close();
	}

}
