package day03;

public class Test31 {

	public static void main(String[] args) {

		//레퍼런스 치환(배열 공유)
		// 다수의 레퍼런스 변수가 하나의 배열 공간을 동시에 가르키는 형태
		
		int[] arr = {1, 2, 3, 4, 5};
		int[] myArr = arr;              // 두 개가 int[] 형으로 동일하므로 치환이 가능.
		
		
		 System.out.println(myArr[0]); // 0번째 값인 1이 출력
		
		for(int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]); 
		}
		
		
		
		
		
		
	}

}
