package day07;

// 캡슐화 활용
class Person2 {
	private int age = 1;
	
	public void setAge(int age) {
		if(age > 0 && age <150) {
			this.age = age;
		}else {
			System.out.println("나이가 이상합니다");
		}
	}
	public int getAge() {
		return age;
	}

}
public class Test84 {

	public static void main(String[] args) {
		
		Person2 p = new Person2();
		
		p.setAge(20);

		System.out.println(p.getAge());

	}

}
