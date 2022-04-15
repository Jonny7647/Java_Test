package day07;

class Car {
	String color = "";
	Car(String color) {
		this.color = color;
	}
	
	String drive() {
		return color + "색 차가 지나갑니다";
	}
}
public class Test80 {

	public static void main(String[] args) {

	
		String[] cols = {"빨간", "노란", "파란", "초록", "검정"};
		
		
		Car [] cars = new Car[5];   // 차고
		for(int i = 0; i < cars.length; i++) {
			cars[i] = new Car(cols[i]);
		}
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i].drive());
		}
		

	}

}
