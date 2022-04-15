package day09;

// 매개변수의 다형성
class Product {
	int price;					// 제품 가격
	int bonusPoint;				// 포인트 점수
	Product (int price) {
		this.price = price;
		bonusPoint = (int)(price/10);	// 보너스는 가격의 10%
	}
}

class Tv extends Product {	// price, bonus, Object
	Tv() {
		super(100);
	}
	@Override
	public String toString() {
		return "LG Tv";
	}
}
/*
class Tv {
	int price;
	int bonusPoint;
	Tv (int price) {
		this.price = price;
	}
}
*/
class Computer extends Product {
	Computer() {
		super(200);
	}
	@Override
	public String toString() {
		return "Samsung Computer";
	}
}
/*
class Computer {
	int price;
	int bonusPoint;
	Computer (int price) {
		this.price = price;
	}
}
*/

class Buyer {				// 고객
	int money = 1000;		// 지갑
	int bonusPoint = 0;		// 고객 포인트
//	void buy(Tv tv) {		
	void buy(Product p) {	// product p; 매개변수의 다형성
		if(money < p.price) {
			System.out.println("돈이 모자랍니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		//System.out.println(p + "를 구입하셨습니다");
		System.out.println(p.toString() + "를 구입하셨습니다");
	}
}
public class Test114 {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		b.buy(tv);
		b.buy(com);
	
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다");
		System.out.println("현재 포인트는 " + b.bonusPoint + "입니다");
		
		
	}

}
