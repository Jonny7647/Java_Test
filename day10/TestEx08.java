package day10;

import java.io.IOException;

public class TestEx08 {

	 static void method1() throws Exception{
			 method2();	// 부르는 쪽에서 예외처리를 해야한다.

	 }
	
	 static void method2() throws NullPointerException, IOException {
		 // 기능구현을 했고, 실행하다, 예외발생했다.
		 throw new NullPointerException();
		 
	 }
	
	public static void main(String[] args) {

		
		try {
			 method1();	// 부르는 쪽에서 예외처리를 해야한다.
		}catch(Exception e) {
			e.printStackTrace();
		}	
		
		
	}

}

	 
