package day05;

// #1. 클래스 정의
class Tv {   				// public Class 불가능. 메인메서드가 아님.
	boolean power = false;  // Tv는 on/off 2가지
	int vol = 0, ch = 1;    // 볼륨은 0 , 1번 채널, 초기값	
}


public class Test52 {		// public 을 쓸 수있는 것은 메인메서드가 있는 클래스만 사용가능하다.
	// 변수
	int abc = 123;
	// 메서드
	public static void main(String[] args) {
		
		Test52 test = new Test52();    // Test52 또한 class이기 때문에 객체 생성이 가능하다.
		System.out.println(test.abc);
		
		//String str = new String();
		

		// #2. 객체생성
		Tv t = new Tv();
		System.out.println(t.power);
		System.out.println(t.vol);
		System.out.println(t.ch);
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		//클래스명 @객체고유번호 (일렬번호)
		System.out.println("==========================");
		
		t1.ch = 10;
		t2.ch = 20;
		System.out.println(t1.ch);
		System.out.println(t2.ch);
		
		
		// 같은 타입끼리 대입 가능.
		t1 = t2;    // 같은 Tv타입이다.
		t2 = t1;
		
			// 불가능 (다른타입)
			// t1= t2.ch;
			// t1= tw.power;
		
			// 가능(같은타입)
			t1.ch = t2.ch;
			t2.power = t3.power;
			//boolean play = t3.power;
	}

}
