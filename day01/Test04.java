package day01;

public class Test04 {

	public static void main(String[] args) {
		
		//출력문 내 연산
		System.out.println(10+3);		  	// 13
		System.out.println("a"+"b"+"c");  	// abc
		System.out.println("A"+ 10);      	// A10
		System.out.println(10 + "A");       // 10A
		System.out.println(10 + "A" + 10);  // 10A10
		System.out.println(10 + 10 + "A");  // 20A
		System.out.println('A' + 10);  		// 75  (아스키코드 A = 65)
		
		
		
		//이스케이프 문자
		System.out.println("hello\n java");    // \n :  줄바꿈
		System.out.println("hello\t java");    // \t :  탭간격 맞춤
		System.out.println("hello \"java\"");  // \" \"  :  쌍따옴표 자체를 문자열로 출력
		System.out.println("hello \\ 'java\'"); // \' : 홀따옴표 자체를 문자열로 출력
		
		
		
		

	}

}
