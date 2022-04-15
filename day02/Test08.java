package day02;

//#1.import 문
import java.util.Scanner;  

public class Test08 {

	public static void main(String[] args) {
		
		// #2. Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// #3. 입력받기
		System.out.println("이름을 입력하세요 : ");
		String abc = sc.nextLine();                        // 문자열 abc 입력받음
		System.out.println("이름은 " + abc + "입니다.");
		System.out.println("나이를 입력하세요 : ");
		String def = sc.nextLine();
		
		// 형변환 : 클래스인 String과 기본형 int는 서로 호환이 잘 안된다.
		//			그래서 String -> int로 형변환 할때는 특별한 틀래스를 사용해야 함

		

		// int age = Integer.parseInt(sc.nextLine());
		// System.out.println("내년 나이는 " + (age+1) + "입니다.");
		
		// 형변환
		int defInt = Integer.parseInt(def); // String 타입을 Int로 형변환 해주는 방식
		
		System.out.println("내년 나이는 " + (defInt+1) + "입니다.");

		
		//
		
		
		// #4. 객체닫기
		sc.close();

		
	}

}
