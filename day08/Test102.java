package day08;
// 상속을 이용하여 다음 클래스들을 간결한 구조호 재작성해보세요.
class Pen {
	private int amount; // 남은 양
	public int getAmount() { return amount; }
	public void setAmount(int amount) { this.amount = amount; }
}
class SharpPencil extends Pen{
	private int width; 	// 펜 굵기
}
class BallPen extends Pen { // amount, color
	private String color; 
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
}
class FountainPen extends BallPen {
	public void refill(int n) { setAmount(n); }
}

/*
class SharpPencil{		
	private int width;
	private int amount;
	public int getAmount() { return amount ;}
	public void setAmount(int amount) { this.amount = amount; }
}
 
class BallPen {
	private int amount;
	private String color;
	public int getAmount() { return amount; }
	public void setAmount (int amount) { this.amount = amount; }
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
}

class FountainPen {
	private int amount;
	private String color;
	public int getAmount() { return amount; }
	public void setAmount (int amount) { this.amount = amount; }
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
	public void refill(int n) { amount = n; }
}
*/

public class Test102 {

	public static void main(String[] args) {
		
		Object obj = new Object(); 
		

	}

}
