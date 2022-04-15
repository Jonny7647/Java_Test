package day02;

public class Test10 {

	public static void main(String[] args) {

		// 증감연산자 : ++, --
		// 전위형 : 먼저 연산
		// 후위형 : 가장 나중에 연산
		// 단독으로 사용되면 전/후 상관없다.
		

		int a = 10;
		
		System.out.println(a);	 // a = 10
		++a; 					 // a값에 1이 더해지고 출력
		System.out.println(a);   // a = 11
		a++;					 // a가 출력되고 1 더해진다
		System.out.println(a);   // a = 12
		--a; 					 // a값에 1을 빼고 출력
		System.out.println(a);   // a = 11
		a--;					 // a가 출력되고 1을 뺀다
		System.out.println(a);   // a = 10
		
		System.out.println(++a);  // a = 11, a에 1을 더하고 출력을 한다.
		System.out.println(a++);  // a = 11, 출력을 먼저 하고 a에 1을 더한다.
	}

}
