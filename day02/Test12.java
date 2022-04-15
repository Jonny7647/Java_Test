package day02;

public class Test12 {

	public static void main(String[] args) {

		// 사칙연산 : + - * / %
		int a= 10 + 10;
		System.out.println(a);  // a = 20
		
		int b = 10 % 3;         // 나머지 값
		System.out.println(b);  // b = 1
		
		int c = 10 / 3;         // 몫
		System.out.println(c);  // c = 3
		
		//int d = 100000 * 100000;  // 오버플로우 발생
		long d = 100000 * 100000L;    // 숫자 둘중 하나를 L을 붙여서 long으로 변환해줘야함
		System.out.println(d); 
	
		
	}

}
