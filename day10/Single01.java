package day10;

class SingleT {
	
	static int a = 10;		// 공용변수
	int b = 20;				// 한군데
	
	// SingleT instance = new SinggleT();	// 무한로딩에 빠진다
	private static SingleT instance = new SingleT();	
	private SingleT() { }
	public static SingleT getInstance() {
		System.out.println( "getInstance :" + instance );
		return instance;
	}
	
	void func() {
		System.out.println("싱글턴");
	}
}
public class Single01 {

	public static void main(String[] args) {

		
	//SingleT s = new SingleT();		// private 타입이라 불가능함.
	SingleT s = SingleT. getInstance();	
	SingleT ss = SingleT. getInstance();	
	//System.out.println(s);
	//System.out.println(ss);
	
	System.out.println(SingleT.a);
	//System.out.println(s.a);
	System.out.println(s.b);
	System.out.println(ss.b);
	
	s.b = 1000;
	
	System.out.println(s.b);
	System.out.println(ss.b);
	
	
	s.func();
	}

}
