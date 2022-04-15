package day09;

interface Test {
	public static final int NUM = 1;	// 상수
	public abstract void add();			// 추상메서드
	
	int x = 100;		// 상수
	int func();			// 추상메서드, public abstract 생략
}

interface Test2 {
	void func22();
}

class Inter implements Test, Test2 {

	@Override
	public void add() {
		System.out.println("imple~~");
	}

	@Override
	public int func() {
		return 0;
	}
	
	@Override
	public void func22() {
		System.out.println("func22222");
	}
	
}

public class Test119 {
	public static void main(String[] args) {

		//Test t = new Test();    // 인터페이스로 객체 생성 불가능
		Inter i = new Inter();
		i.add();
		i.func22();
		
		// 디형성
		// 인터페이스 타입의 변수에, 구현 클래스로 생성한 객체를 담을 수 있다. (부모역할)
		Test t = new Inter();
		Test2 tt = new Inter();
		t.add();
		tt.func22();
		
		
		
	}

}
