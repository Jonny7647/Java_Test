package day07;

public class Test71 {

	// 클래스 변수
	static int x = 10;
	
	// 클래스 블럭  -> 프로그램 시작시 자동으로 실행됨. (재호출 절대 불가능)
	static {
		System.out.println("클래스 초기화 블럭");
		x = 200;
		
		//int xxx = 100;    // 지역변수, 일시적으로 사용 후 사라짐
	}
	
	// 인스턴스 변수
	int y = 20;

	// 인스턴스 블럭  -> 객체 생성시 자동으로 한번 실행된다.(재호출 절대 불가능)
	{
		System.out.println("인스턴스 초기화 블럭"); 
		x = 300;
		y = 500;
	}
	
	public static void main(String[] args) {

		System.out.println(x);  		 // x = 200 출력
		
		Test71 test = new Test71(); 	 // 인스턴스 객체 생성 -> 인스턴스 블럭 출력
		Test71 test1 = new Test71();  	
		
		System.out.println(test.x);  	// x = 300
		System.out.println(test1.y);	// y = 500
		

		
		
		
	}

}