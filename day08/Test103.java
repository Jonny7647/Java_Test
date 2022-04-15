package day08;

class Person {					 // 부모 클래스
	private int weight;
	int age;
	protected double height;
	public String name;
	
	public void setWeight(int weight) { 
		this.weight = weight; 
	}
	
	public int getWeight() {
		return weight ;
	}
}

class Student extends Person {	// 자식 클래스
	public void set() {			// weight, age, height, name set()
		age = 10;
		name = "피카츄";
		height = 100.44;
		//weight = 100;  		// private 이라 사용 불가능
		setWeight(100);
	}
}
public class Test103 {

	public static void main(String[] args) {

		Student s = new Student();
		s.set();
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println(s.height);
		System.out.println(s.getWeight());
	}

}
