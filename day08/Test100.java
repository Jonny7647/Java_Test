package day08;

// final
// #1.
/*
final class Super {
}

class Sub extends Super {  // Super에 final이 붙어있어서 상속 불가
} 
*/


// #2. 
class Super {
	final void add() {
		System.out.println("hahaha"); 
	}
}
class Sub extends Super {
// 오버라이딩 불가
/* void add() {
	System.out.println("hahaha"); 
	}
*/
}
public class Test100 {

	final static int x = 10;  // 클래스 상수
	final int y = 20;         // 인스턴스 상수
	
	public static void main(String[] args) {
		
	final int z = 30;		  // 지역 상수
	//x = 100; 	 // 불가능
	//y = 200;	 // 불가능
	//z = 300;   // 불가능, 상수는 한번 초기화되면 값 변경X
	}

}

class Sup {
	//이미 명시적으로 초기화가 된 상수는 값 변경이 안된다.
	/*
	 * final int x =10;
	sup(int x) {
		this.x = x;
	}
	*/
	
	// 예를 들어, 객체 생성시 외부에서 던져주는 값을 받아
	// 상수로 사용하고 싶을 때
	final int x;
	Sup(int x) {
		this.x = x;
	}
}