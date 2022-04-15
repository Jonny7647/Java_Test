package day07;

class Sample {
	
	public int a;		  // 모든 클래스
	
	private int b;  	 // Sample 클래스 안에서만 접근 가능
	
	int c;				 // 동일 패키지내
	
	protected int d;     // 같은 클래스, 자식클래스
}

public class Test82 {

	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.a = 100;
		
		// s.b = 200;   // 오류, 클래스가 다르다.
		
	    s.c = 300;
	    
	    s.d = 400;		
		

	}

}
