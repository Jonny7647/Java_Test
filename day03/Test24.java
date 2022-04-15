package day03;

public class Test24 {

	public static void main(String[] args) {

		
	for(int i = 0; i < 5; i++) {
		System.out.println("hello");
	}
	
	// for문 안에서 만들어진 변수는 밖에서 사용불가. 
	// 변수 i는 for문 안에서만 유효함.

	for(int j = 0; j < 5; j++) {
		System.out.println(j);
	}
	
	
	}

}
