package day05;

/*
	클래스 기본형 변수 : static 키워드, 클래스명.변수명
	클래스 참조형 변수 
	
	인스턴스 기본형 변수 : new로 객체생성, 참조변수명.변수명
	인스턴스 참조형 변수
	
	지역 기본형 변수 : 메서드 안에서만 생성됨. 메서드 종료시 사용 끝
	지역 참조형 변수
*/

class Tv3 {

	boolean power = false;	// 인스턴스 기본형 변수
	int ch = 1, vol = 0;	// 인스턴스 기본형 변수
}

public class Test56 {
	//클래스 영역					 클래스명.클래스 변수명
	static int a;			// 클래스 기본형 변수, Test56.a 
	static Test56 test;		// 클래스 참조형 변수, Test56.test
	static Tv3 tv;			// 클래스 참조형 변수, Test56.tv
	// static Tv3 tv = new Tv3();
	
	
	//인스턴스 변수						      참조변수명.인스턴스 변수명
	int x;	 		// 인스턴스 기본형 변수,  testtt.x
	Tv3 tv3; 		// 인스턴스 참조형 변수,  testtt.tv3
	Test56 test56;  	// 인스턴스 참조형, 자동으로 초기값 null
	//Test56 test56 = new Test56(); // 오류 : 자기 자신의 클래스로 인스턴스 객체 생성 불가능
					// 무한 로딩
	Test56 z = null;
	
	public static void main(String[] args) {
		
		System.out.println(Test56.a);   // 클래스변수 출력
		
		//System.out.println(new Test56().test56); 	//오류 : 자기 자신의 클래스로 인스턴스 객체 생성 불가능
		Test56 testtt = new Test56();			// 인스턴스 변수 z를 사용하기 위해 객체생성
		//testtt.test56 = new Test56();			// z가 객체 생성이 되지않아 안에 있는 x를 꺼낼 수가 없다.
		//System.out.println(testtt.z);			// null값이 출력되므로  z를 새로 만들어줘야 함.
		testtt.z = new Test56();		  	// z 객체 다시 생성
		System.out.println(testtt.z.x);    		// z안에 있는 int x 값을 꺼내와서 출력
		
	}

}
