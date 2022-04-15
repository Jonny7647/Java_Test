package day02;

public class Test16 {

	public static void main(String[] args) {
		
		int i = 20;
		if(i > 10) {                                // 조건식 참
			System.out.println("i는 10보다 크다");  // 조건이 참이므로 결과값 출력
		}
		
		System.out.println("실행 끝");
		
		
		int a = 20;
		boolean b = true;							
		if(b) {                                	    // 조건식 참
			System.out.println("a는 10보다 크다");  // 조건이 참이므로 결과값 출력
		}
		System.out.println("실행 끝");
		
		
		if(a-10 > 10) { 							// 조건식 거짓
			System.out.println("hello"); 			// 조건이 거짓이므로 결과값 출력 안됨
		}
		
		
		// 점수가 60점 이상이면 "합격", 아니면 "불합격" 출력

		int score = 70;
		
		if(score >= 60) {                      		// 조건식 참
			System.out.println("합격"); 			// 조건이 참이므로 결과값(합격) 출력
		}
		else {
			System.out.println("불합격");
		}
		
	}

}
