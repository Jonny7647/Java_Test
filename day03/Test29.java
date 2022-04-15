package day03;

public class Test29 {

	public static void main(String[] args) {

		double[] dArr = new double[5];
		dArr[0] = 1.234;
		dArr[1] = 3;
		System.out.println(dArr[1]);
		
		
		float[] fArr = new float[3];
		fArr[0] = 3.14F;               // 4바이트를 넘기때문에 접미사 F를 붙여준다.
		
		char[] chArr = new char[5];
		chArr[0] = 'a';
		
		String[] strArr = new String[3];
		strArr[0] = "으이구";
		System.out.println(strArr[0]);
		
		int [] score = {10,20,30,40,50};
		//int [] score = new int[] {10,20,30,40,50};  //원래의 이런 모양이지만 new int[]가 생략된다.
		
		System.out.println(score[0]);      // 방의 첫번째 값이 출력된다. score = 10
		
		//System.out.println(score[5]);      // 방은 0 ~ 4번까지 존재, 방의 범위를 벗어나서 오류발생.
											 // ArrayIndexOutOfBoundsException Error
		
		// 문제. 최대값과 최소값을 구해보세요
		int [] arr = {79, 85, 12, 120, 4, 95};

		int max = arr[0];  		// 최대값, 최소값을 들고 있을 변수 생성, 
		int min = arr[0];       // 초기값은 배열 첫번째 값으로 초기화.
		
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max + ", 최소값 : " + min);

	}

}
