package day02;

public class Test15 {

	public static void main(String[] args) {

		//대입연산자 : 대입을 해야만 변수의 값이 변경된다.
		
		int a = 10;
		
		System.out.println(a + 10);    // a = 20
		System.out.println(a);         // a = 10
		
		
		
		//복합 대입연산자 :  산술 + 대입 :  +=, -=, *=, /=, %=
		
		System.out.println(a += 10);   // a = 20, a = a+10, 연산 후에 결과 출력
		System.out.println(a);         // a = 20
		
		
		// int asdgadgsdg = 100;      // 변수명이 길고 복잡할 때 사용하면 편하다.
		// asdgadgsdg += 1;
		
		int b = 10;
		b += 1;                        // b = b + 1; 변수에 연산 및 대입을 한다
		System.out.println(b);         // b = 11  
		b -= 1;                        // b = b - 1;                       
		System.out.println(b);         // b = 10   
		b *= 1;                        // b = b * 1;                       
		System.out.println(b);         // b = 10   
	
	}

}
