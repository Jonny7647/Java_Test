package day06;

public class Test67 {

// 메서드 오버로딩
	
	// 가능 - 매개변수 갯수 차이
	int getSum(int a, int b) {
		return a + b;
	}
	int getSum(int a, int b, int c) {
		return a + b + c;
	}
	
	// 가능 - 타입 차이
	int getMul(int a, int b) {
		return a * b;
	}
	double getMul(int a, double b) {
		return a * b;
	}
	
	// 가능 - 타입의 순서 차이
	String getSum2(int a, String b) {
		return a + b;
	}
	String getSum2(String b, int a) {
		return a + b;
	}
	
////////////////////////////////////////////////////
	
	// 불가능 - 리턴 타입만 다른 경우
	/*
	int getSub(int a, int b) {
		return a - b;
	}
	
	double getSub(int a, int b) {
		return a - b;
	}
	*/
	
	//불가능 - 매개변수의 이름만 다른 경우
	/*
	int getDiv(int a, int b) {
		return a / b;
	}
	int getDiv(int c, int d) {
		return c / d;
	}
	*/

	public static void main(String[] args) {

	Test67 test = new Test67();
	System.out.println(test.getSum(10, 20));			// 가능 - 매개변수 갯수 차이
	
	System.out.println(test.getMul(10, 20));			// 가능 - 타입 차이
	
	System.out.println(test.getSum2(10," hello"));		// 가능 - 타입의 순서 차이
	System.out.println(test.getSum2("Nihao ", 20));
	
	// 메서드 오버로딩은 자바 컴파일러에 의해 판단되며,
	// 컴파일러가 이름이 같은 메서드들을 구분할 수 있으면 오버로딩 성공.
	// 컴파일러가 메서드 이름과 매개변수의 개수/타입 일치하는 매서드를 찾아냄
	}

}
