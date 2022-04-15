package day06;

/*
 	char[] 배열을 전달받아 출력하는 printCharArray() 메서드와
 	배열속의 ' ' 공배문자를 ',' 쉼표로 대치하는 replaceSpace() 메서드를 작성해라.
  	(편의를 위해  Test68 클래스 안에 static 메서드로 작성해라.)
 */


public class Test68 {
	
	static void printCharArray(char [] ch) {		// 타입이 맞는게 중요,  변수명은 같아도 틀려도 상관없음
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}

		
	static void replaceSpace(char [] a) {			// 타입이 맞는게 중요,  변수명은 같아도 틀려도 상관없음
		for(int i = 0; i < a.length; i++) {
			if(a[i] == ' ') {
				a[i] = ',';
			}
		}
	}
	
	public static void main(String[] args) {
		
		char[] c = {'I', ' ', 'a', 'm', ' ', 'a' , ' ', 'b', 'o', 'y' };
		
		printCharArray(c);	// I am a boy
		replaceSpace(c);	// ' ' 를  ',' 로 대체
		printCharArray(c);	// I, am, a, boy
		
	}

}
