package day08;

// 상속
class Super1 {
	static int a = 100;
	int x = 10;
}

class Sub1 extends Super1 {	// x, y를 갖고있다
	int y = 20;
}

public class Test101 {

	public static void main(String[] args) {

	Sub1 s = new Sub1();
	System.out.println(s.x);
	System.out.println(s.y);
	System.out.println(s);
	
	System.out.println(Super1.a);
	System.out.println(Sub1.a);
	}

}
