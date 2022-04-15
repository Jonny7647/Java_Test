package day05;

class Tv5 {
	boolean power = false;
	int ch =1,  vol = 0;
}


public class Test57 {

	Tv5 tv;
	Test57 test;
	
	/*
	int x;
	Test57 test;  // 인스턴스 참조형 변수  -> 객체 생성 필요
		      // class 타입으로 변수 생성 -> Test57 class안에 있으므로.
	*/
	public static void main(String[] args) {
		
		Test57 i = new Test57();
		System.out.println(i.test);        // null 출력
		if(i.test != null) {
			System.out.println(i.test.tv);   // tv의 주소 출력
		}else {
			i.test = new Test57();
			System.out.println(i.test.tv);
		}
		
		/*
		Test57 a = new Test57();     
		System.out.println(a.test);     // null이 출력
		
		a.test = new Test57();
		System.out.println(a.test.x);   
		*/
	}
	
}
