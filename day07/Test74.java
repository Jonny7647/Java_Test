package day07;

public class Test74 {
	
	double d;

	Test74() {
		System.out.println("생성자 호출");
		d = Math.random();
	}
	
	Test74(double a) {					// 입력값을 다르게 하여 오버로딩 사용
		d = a;
	}
	public static void main(String[] args) {

		Test74 test1 = new Test74();  	 
		Test74 test2 = new Test74(3.14); 
		
		System.out.println(test1.d);  	// 랜덤 숫자 출력
		System.out.println(test2.d);	// a값인 3.14 출력
		
	}

}
