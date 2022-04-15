package day04;

public class Test47 {

	public static void main(String[] args) {

		// 랜덤 : 난수 : 임의의수
		// java.lang.Math : import 필요없이 바로 사용 가능.
	//	System.out.println(Math.random());
		
		
		
		//0 ~ 9 사이의 값
		
		for(int i = 0; i < 10; i++) {
			System.out.println( (int)(Math.random() * 10) );  // int로 형변환 (랜덤 1이하의 실수 출력) * 정수 한자리
		}
		
		
		//문제1.  1 ~ 10 사이 랜덤값 구하기
		System.out.println( (int)(Math.random() * 10) + 1 );
		

		
		// 문제1-1. 0 ~ 8 사이 랜덤값 구해서 출력
		System.out.println( (int)(Math.random() * 9));

		
		
		// 문제2.13 ~ 28 사이 랜덤값 구하기
		System.out.println( (int)(Math.random() * 16) + 13 );

		
	}

}
