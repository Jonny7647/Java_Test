package day05;

class TvTest{
	
	//멤버 변수들은 초기화를 안해주면, 기본값을 자동으로 채워준다.

	static int x;   // 클래스변수
	
	int y;		// 인스턴스 기본형 변수
	String str;     // 인스턴스 참조형 변수 (대문자로 시작)
	char c;		// 인스턴스 기본형 변수  		

}


public class Test54 {

	public static void main(String[] args) {
		
		System.out.println(TvTest.x);   // 클래스 변수는 자동으로 기본값이 채워진다.
						// 기본형은 초기값 : 0
		
		TvTest t = new TvTest();
		System.out.println(t.y);	// 인스턴스 변수도 자동으로 기본값이 채워진다. 
						// 기본형은 초기값 : 0
		
		System.out.println(t.str);      // 참조형은 자동 초기값 : null
		
		System.out.println(t.c);        // 아무 값도 나오지 않는다. 
						// char = "";
		
		// 지역변수 : 초기화를 하지 않으면 출력이 안나온다.
		//int a;
		//System.out.println(a);    	// 사용이 불가능
		
		//String ss;
		//System.out.println(ss);
		

	}

}
