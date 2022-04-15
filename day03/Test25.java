package day03;

public class Test25 {
	public static void main(String[] args) {

		 /*잘사용하지 않음 
		int a;
		for(a = 0; a < 10; a++) {         // for문안에서의 초기식이 유효함
			System.out.println(a);
		}
		System.out.println(a);
		*/
		
		/* 초기식 생략하는 방법 (잘 사용X) 
		int a = 0; 
		for( ; a < 10; a++) {             // 초기식 생략 가능
			System.out.println(a);
		}
		*/
		
		/*
		for(int i = 0; i < 3; i++) {      // 증감식에서 오류나서 무한으로 반복된다.
			System.out.println("hello");
		}
		*/
		
		/*
		for( ; ; ) {
			System.out.println("hahahahahahahah");  // 식을 생략하면 무한 반복
			if (조건) {
				break;
			}
		}
		*/
		
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				continue;			// 현재단계 실행안하고, 다음단계로 넘어간다.
			}
			System.out.println(i);
		}

		
	}
}
