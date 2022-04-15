package day03;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 무한 반복, 3을 입력하면 종료.
		while(true) {
			System.out.print("정수입력 : ");
			int num = Integer.parseInt(sc.nextLine());
			System.out.println(num);
			
			if(num == 3) {			// 종료시점
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}
