package day01;

public class Test03 {
	public static void main(String[] args) {
		
		//문자
		char ch = '\u0041';
		System.out.println(ch);
		
		
		//오버플로우
		byte bb = (byte)130;  // -128~127의 범위를 넘어가서 오버플로우 발생, 강제로 형변환
		System.out.println(bb);
		
		
		//int : 10진수, 8진수, 16진수, 2진수
		int i = 15;
		int j = 015;
		int k = 0x15;
		int l = 0b0101;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		
		//문자열
		String str = "안녕하세요";
		System.out.println(str);
		str = "으이구";
		System.out.println(str);
		str = "A";
		System.out.println(str);
		
		//접미사 
		float f = 3.14F; 
		double d = f;
		long ll = 100L;
		int iii = (int)ll;  //오버플로우 발생, 강제로 형변환
		
		System.out.println(f);
		System.out.println(d);
		System.out.println(ll);
		System.out.println(iii);
	}

}
