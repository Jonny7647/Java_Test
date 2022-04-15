package day06;

class TestA {
	int a;		 		   // 인스턴스 변수 -> 객체생성 후 사용가능
	static int b;  		   // 클래스 변수
	Test60 t;			   // 인스턴스 변수
	static String abc;     // 클래스 변수
	
	// TestA atest = new TestA();  // 인스턴스 변수에 자기 자신타입으로 객체생성 불가능
	
	void test() {
		//int def;           // 지역변수
		//static int st;;  // 불가능. 클래스변수는 메서드 안에 사용할수 없다.
	}
	
}
public class Test60 {

	public static void main(String[] args) {

		TestA aaa = new TestA();
		System.out.println(aaa.a);
		System.out.println(TestA.b);  // 클래스 변수는 바로 호출
	
	}

}
