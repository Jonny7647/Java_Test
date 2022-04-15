package day10;

public class TestEx05 {

	public static void main(String[] args) {

		System.out.println(1);
		
		try {
			System.out.println(2);
			System.out.println(0/0);	// 예외발생, catch로 넘어감 
			System.out.println(3);
		}catch(Exception e) {
			System.out.println(4);
		}finally {						//예외 여부와 상관없이 무조건 실행
			System.out.println(5);
		}
		System.out.println(6);
	}

}
