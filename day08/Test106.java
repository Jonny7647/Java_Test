package day08;

class Super2 {
	void func1() {
		System.out.println("super");
	}
	void f1() {
		System.out.println("super haha");
	}
}

class Sub2 extends Super2 {		// func() + object
	
	@Override // 어노테이션
	void func1() {
		// super.func1(); 				// 부모 출력
		System.out.println("subsub");   // 자식 출력
	}
	
	@Override // 어노테이션
	void f1() {				
		super.func1();					// 부모의 fuc1() 메서드 호출
		System.out.println("sub haha");  
	}
	
	
}

public class Test106 {

	public static void main(String[] args) {

		Sub2 sub = new Sub2();
		sub.f1();
	}

}
