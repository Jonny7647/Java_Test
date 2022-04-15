package day02;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		// Scanner을 통해서 이름, 혈액형, 나이, 주소를 입력받고
		// 출력해보기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("이름 : " + name);
		
		
		System.out.println("혈액형을 입력하세요");
		String abo = sc.nextLine();
		System.out.println("혈액형 : " + abo);
		
		System.out.println("나이를 입력하세요");
		String age = sc.nextLine();
		System.out.println("나이 : " + age);
		
		
		System.out.println("주소를 입력하세요");
		String address = sc.nextLine();
		System.out.println("주소 : " + address);
		
		System.out.println("키를 입력하세요");
		String height = sc.nextLine();
		//System.out.println("키 :" + height + "cm");

		//형변환
		double dHeight = Double.parseDouble(height);
		System.out.println("키 :" + dHeight + "cm");

		sc.close();
		

		
		
	}

}
