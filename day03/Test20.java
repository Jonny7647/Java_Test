package day03;

public class Test20 {

	public static void main(String[] args) {

		// while 문
		
		int a = 0;								// 초기식
		
		while(a < 5) {							// 조건식
			System.out.println("안녕하세요!");
			a++;								// 증감식, 안적으면 무한반복 됨.
		}
		
		// 0 ~ 5까지 출력하기
		
		int i = 0;
		
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
	}

}
