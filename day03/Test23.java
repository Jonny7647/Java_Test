package day03;

public class Test23 {

	public static void main(String[] args) {

		int num = 0;
		
		do {
			System.out.println("hello");    // 무조건 한번 실행됨
			num++;
		} while(num < 3);                   // 식이 참이면 다시 do로 돌아감
		
////////////////////////////////////////////////////////////////		
		
		int i = 12;
		
		do {
			System.out.println("test");
		} while (i-- > 10);
		

		
	}
}