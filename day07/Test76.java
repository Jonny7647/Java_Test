package day07;

class Circle {
	int radius;			// 반지름
	
	void set(int r) {	// 반지름을 세팅해주는 매서드
		radius = r;
	}
	double getArea() {	// 원의 너비를 구해주는 매서드
		return radius * radius * 3.14;
	}
}

public class Test76 {

	public static void main(String[] args) {
		
		Circle pizza = new Circle();
		pizza.set(15);
		
		System.out.println(pizza.getArea());
		

	}

}
