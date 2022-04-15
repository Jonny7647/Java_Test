package day03;

public class Test28 {

	public static void main(String[] args) {

		//배열 선언, 생성
		
		int [] arr;   		//배열 선언
		arr = new int[3];	//배열 생성
		
		//선언+ 생성 ,  가장 많이 사용하는 형태.
		//int [] arr2 = new int [5];
		
		//값 저장
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// 출력 확인
		System.out.println(arr);           // 배열의 주소, 58ceff1
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("-----------------------");
		
		for(int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------");
		
		System.out.println(arr);           //배열의 주소, 58ceff1
		
		
		// int num = arr;    // 주소를 정수형 변수에 저장 불가능
		// String num = arr; // 주소를 문자열 변수에 저장 불가능
		int num = arr[0];
		System.out.println(num);
		
		System.out.println(arr.length);   // 방의 갯수 확인 : 3

		
		System.out.println("-----------------------");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i] = (i+1)*10;
		}
		System.out.println("-----------------------");
		
		
		
		
	}

}
