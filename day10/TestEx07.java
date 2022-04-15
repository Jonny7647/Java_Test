package day10;

public class TestEx07 {

	public static void main(String[] args) {

		
		try {
			//Exception e = new Exception();
			//NullPointerException e = new NullPointerException();
			RuntimeException e = new RuntimeException();
			throw e; 								// 고의로 에외 발생
			
		}catch(NullPointerException e) {
			System.out.println("NullPointerException 처리");
		}catch(RuntimeException e) {
			System.out.println("RuntimeException 처리");	
		}catch(Exception e) {						// 무조건 마지막줄에 있어야한다. 부모격
			System.out.println("모든 예외 처리");	
		}
			
		
	}

}
