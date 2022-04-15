package day06;

class TestB {
	// 입력x, 리턴x
	void hello() {  
		System.out.println("hello~~");
		System.out.println("hello~~");
		System.out.println("hello~~");
	}
	
/////////////////////////////////////////////////////////////////
	// 입력x, 리턴o
	int getTen() {	 		// 10을 리턴해주므로 int형
		System.out.println("10을 돌려준다");
		return 10;  		 // 정수를 리턴
	}
	
/////////////////////////////////////////////////////////////////
	//입력o, 리턴x	
	void printName(String name) {					   // 입력값 문자열
		System.out.println(name + "님 안녕하세요! ");  // name은 지역변수,
	}												   // 매게변수도 지역변수다
	
/////////////////////////////////////////////////////////////////
	//입력o, 리턴o
	int sum(int a, int b) {
		int sum = a + b;
		return sum;
		// return = a + b;    // 한줄로 줄이기 가능
 	}
}

public class Test61 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작!");
		
		TestB b = new TestB();  	// 객체생성
		
/////////////////////////////////////////////////////////////////
		
		b.hello();  // 호출 (메서드야 실행해!)
		
		System.out.println("메서드 실행 되었는가");
		
/////////////////////////////////////////////////////////////////
		
		//return; 생략,  -> void 타입
		
		
		int result = b.getTen();   // 입력값 없어서 빈괄호, 
								   // 변수의 타입, 리턴값 타입이 int형
		System.out.println("result : " + result);
		
/////////////////////////////////////////////////////////////////
		
		b.printName("피카츄");     // 문자열
		
/////////////////////////////////////////////////////////////////
		
		int result2 = b.sum(10, 20);
		
		System.out.println(result2);
		
		
	}

}
