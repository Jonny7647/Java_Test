package day05;  

class TvEx {		 // 같은 패키지 안에 같은 class변수 불가능
	
	// 클래스 변수 변수
	static boolean power = false;  // 앞에 static이 붙어있으면 클래스 변수
	// 인스턴스 변수
	int vol = 0, ch = 1;
	
	// if() {}   // 클래스 안에 조건문 반복문 등 사용불가, 변수와 메서드만 사용가능
	
}


public class Test53 {
	// 클래스 메서드, static이 붙어있음.
	public static void main(String[] args) {
		
		// 클래스 변수 : 객체 생성 안하고 바로 생성 가능
		System.out.println(TvEx.power);   
		
		// 인스턴스 변수 : 객체 생성 후 사용가능
		TvEx tv = new TvEx();
		System.out.println(tv.vol);
		System.out.println(tv.ch);
		// System.out.println(tv.power);   // 이 코드만 봐서는 클래스변수인지 알아보기 힘듬
										   // 클래스명.power인 
										   // System.out.println(TvEx.power); 로 작성한다.
		
		//지역변수
		int abc = 10;			//기본형 지역변수
		/*
		for(int i = 0; i < 10; i++) {           // i는 for문안에서만 작동함, 지역변수
			System.out.println(i);
		}
		*/
		//지역변수
		System.out.println(abc);
		

		
		
	}

}
