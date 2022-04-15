package day02;

public class Test11 {

	public static void main(String[] args) {

		//결과를 먼저 주석으로 작성해보고 실행하기를 권장
		// 문제1. 
		int i = 5, j =5;
		System.out.println(i++);  // i = 5, i가 출력되고 1 증가
		System.out.println(++j);  // j = 6, j가 1 증가되고 출력
		System.out.println("j=" + i + ", j=" + j);  // i=5, j=6
		
		// 문제2
		int k = 10;
		System.out.println(k++); // k = 10, k가 출력되고 증가한다 : k=11
		System.out.println(++k); // k = 12, k가 증가하고 출력된다 : k=12
		++k;					 // k = 13, k가 증가하고 출력된다 : k=13
		System.out.println(++k); // k = 14, k가 증가하고 출력된다 : k=14
		System.out.println(k++); // k = 14, k가 출력되고 증가한다 : k=15
		System.out.println(k);   // k = 15
		
		
		// 문제3
		int a = 10;
		int b = 10;       
						   // r =  a+b,        a=10, b=10
		int r = ++a + ++b; // r = 11+11 = 22,  a=11, b=11
		r = ++a + b++;	   // r = 12+11 = 23,  a=12, b=12
		r = ++a + a;	   // r = 13+13 = 26,  a=13, b=12 
		r = ++a + a++;     // r=  14+14 = 28,  a=15, b=12
		r = ++a + ++a;     // r=  16+17 = 33,  a=17  b=12
		System.out.println(r);  // r = 33
		
	}

}
