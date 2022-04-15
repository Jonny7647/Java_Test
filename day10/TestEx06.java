package day10;

public class TestEx06 {

	public static void main(String[] args) {
		/*
		try {
			// 예외를 강제로 발생시킨다.
			throw new RuntimeException();
			// System.out.println("hello"); // 예외발생해서 실행이 안됨.
		}catch(Exception e) {
			System.out.println("예외가 발생했습니다");
		}
		*/
		
		try {
			System.out.println("hello"); 
			Exception e = new Exception("고의로 예외를 발생시킴");	// 에러메세지 지정
			throw e;
		}catch(Exception e) {
			System.out.println(e.getMessage());	// 지정해둔 메세지를 따로 꺼낼수 있다
			//System.out.println(e);
			e.printStackTrace();				// 에러메세지 빨간색 + 에러위치 경로추적
			// try-catch로 예외처리를 안하면 콘솔에 뜨는 메세지들(try-catch시 안나옴)을
			// 이 메서드를 통해 다시 출력할 수있다.
		}
		
		
	}

}
