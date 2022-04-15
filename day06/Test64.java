package day06;

class Circle {
	int radius = 30;
}

public class Test64 {

	
	static void plus(int num) {
		num = num + 1;			// num += 1;
	}
	
	static void bigPizza(Circle pizza) {
		pizza.radius++;
	}
	
	static void increase(int[] arr) {
		for( int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
	}
	
	public static void main(String[] args) {
		// 편의상 객체생성없이 바로 사용가능하도록 static 메서드를 만든다.
		
		// 기본형
		int num = 10;   // 기본형 지역변수
		plus(num);		// 같은 static 타입이라서 바로 호출이 가능하다.
		System.out.println(num);
		
		// 참조형
		Circle pizza = new Circle();  // 객체생성
		bigPizza(pizza);		      // 지역변수는 이름이 같다고 동일한 변수가 아니다
		System.out.println(pizza.radius);
		
		// 배열
		int [] arr = {1, 2, 3, 4, 5};
		increase(arr);
		for( int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

}
