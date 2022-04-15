package day04;

public class Test41 {

	public static void main(String[] args) {

		//다차원 정방배열
		int [][] arr = new int [2][3];
		
		arr [0][0] = 100;     //      [0]  [1]  [2]
		arr [0][1] = 200;     // [0]  100  200  300
		arr [0][2] = 300;     // [1]  400  500  600
		arr [1][0] = 400;
		arr [1][1] = 500;
		arr [1][2] = 600;
		
		
		// 선언 + 초기화
		int [][] arr2 = { 
						{10, 20, 30}, 
						{40, 50, 60}  };
		
		System.out.println(arr2[0][0]);     // 10
		System.out.println(arr2[0][1]);     // 20
		System.out.println(arr2[1][1]);     // 50
		
		System.out.println("====================================");
		
		System.out.println(arr2.length);	// 행의 갯수 : 2
		System.out.println(arr2[0].length); // 열의 갯수 : 3
		System.out.println(arr2.length * arr2[0].length); // 방의 전체 갯수 : 6
		
		System.out.println("====================================");
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[0].length; j++) {
				System.out.println(arr2[i][j]);            // 10, 20, 30, 40, 50, 60 출력
			}
		}
		
		System.out.println("====================================");
		
		//다차원 가변(비정방) 배열
		int [][] arr3 = new int [2][];
		
		arr3 [0] = new int [2];  // 첫 행에 들어가는 1차원 배열 생성 , 첫번째 행은 2칸
		arr3 [1] = new int [3];  // 두번째 행에 들어가는 1차원 배열 생성 , 두번째 행은 3칸
		
		arr3 [0][0] = 1;
		arr3 [0][1] = 2; 
		arr3 [1][0] = 3;
		arr3 [1][1] = 4;
		arr3 [1][2] = 5;
		
		int [][] arr4 = {
				{10, 20},
				{30, 40, 50} };
		
		System.out.println(arr4.length);       // 행의 갯수 : 2
		System.out.println(arr4[0].length);    // 첫번째 행의 갯수 : 2
		System.out.println(arr4[1].length);    // 두번째 행의 갯수 : 3
		
		System.out.println("====================================");
		
		for(int i = 0; i < arr4.length; i++) {
			for(int j = 0; j < arr4[i].length; j++) {     // 가변배열은 arr4[0].length이 아닌 arr4[i].length
				System.out.println(arr4[i][j]);           // 10, 20, 30, 40 출력
			}
		}
		
		
	}

}
