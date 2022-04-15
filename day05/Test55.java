package day05;


class Tv2{
	int a;			  // 인스턴스 기본형 변수
	boolean b;
	float f;
	double d;
	
	static int ab;	 	 // 클래스 변수
	
	String abc;      	 // 인스턴스 참조형 변수 (대문자로 시작)
	
	Tv t;			 // 인스턴스 참조형 변수, Tv는 Class라는 타입
	
	Test55 test;   	 	 // 인스턴스 참조형 변수, Test는 Class라는 타입
	
	//TvEx ttt;     	 // 인스턴스 참조형 변수
	//static TvEx ttt;  	 // 클래스 변수
	
	//static int x = y;  	 // 클래스 변수와 인스턴스 변수
	//int y = 20;		 // 서로 변수 종류가 달라서 오류가 난다.
				 // x가 만들어진 시점에는 y가 존재하지 않는다.
	static int x = 100;  	 // x를 먼저 생성해야한다.
	int y = 20;
	
}
	
public class Test55 {
	
	int abc;		// 인스턴스 기본형 변수
	String str; 		// 인스턴스 참조형 변수
	static int def; 	// 클래스 기본형 변수
	static Tv t;		// 클래스 참조형 변수
	
	static int a = 100;
	int i = 20;
	

	public static void main(String[] args) {

		System.out.println(Tv2.x);    	  // x =100
		Tv2 t = new Tv2(); 		  // 객체 생성
		System.out.println(t.y); 	  // y = 20
		

		Test55 tt = new Test55();	  // 객체 생성
		System.out.println(tt.i);	  // i = 20
		
		System.out.println(new Test55().i);  // 단발성으로 잠깐 사용
		
	}

}
