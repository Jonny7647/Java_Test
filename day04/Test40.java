package day04;

import java.util.Scanner;

public class Test40 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//문제1-1 int형 방5개의 배열을 만들고, 10, 20, 30, 40, 50을 저장하고. 출력
		
		int [] arr = {10, 20, 30, 40, 50};
		int [] myArr = arr;    
		
		
		for(int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]); 
		}
		
//////////////////////////////////////////////////////////////////////////////////////
		
		//문제1-2.위 배열을 이용하여, 인덱스번호 1번과 3번안에 있는 데이터를 더한값을 출력
		
		System.out.println(myArr[1] + myArr[3]); 
		
//////////////////////////////////////////////////////////////////////////////////////
			
		//문제1-3 인덱스번호를 사용자로부터 입력받고, 해당 인덱스의 데이터를 출력
		
		System.out.println("인덱스번호를 입력하세요 ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println(arr[num]);
		
//////////////////////////////////////////////////////////////////////////////////////

		//문제1-4.배열안의 모든 요소를 다 더한 값을 출력
		
		int sum = 0;
		for( int i = 0; i < myArr.length; i++) {
			sum += myArr[i];
		}
		System.out.println(sum);
		 
//////////////////////////////////////////////////////////////////////////////////////

		//문제1-5.배열안에 있는 값 중 하나를 입력하면, 그 값이 위치한 인덱스 번호 출력.
		
		System.out.println("10 ~ 50 중 값을 입력하세요 ");
		int idx = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < myArr.length; i++) {
			if(idx == myArr[i]) {
			System.out.println("인덱스번호 : " + i);
			break;
			}
		}
		
//////////////////////////////////////////////////////////////////////////////////////

		//문제1-6 인덱스 번호 2번과 4번방의 값을 교환해보세요.
		
		int tmp = myArr[2];
		myArr[2] = myArr[4];
		myArr[4] = tmp;
		
		for(int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i] + "  ");
		}
		System.out.println();
		
//////////////////////////////////////////////////////////////////////////////////////

		//문제1-7.(심화)내림차순으로 정렬하세요
		
		// 버블 정렬
		/*
		for(int i = 0; i < myArr.length-1; i++) {
			for(int j = i; j < myArr.length; j++) {
				if(myArr[i] < myArr[j]) {    //myArr[i] > myArr[j] ==> 오름차순
					int tem = myArr[i];      // 임시 변수로 치환
					myArr[i] = myArr[j];	 // i값을 j로 대입
					myArr[j] = tem;  		 // j값에 tem값(치환되기전 i값) 대입 
				}
			}
		}
		*/
		
		// 선택 정렬
		
		for(int i = 0; i < myArr.length-1; i++) {
			int max = i;  // 가장 큰 값의 인덱스 번호를 들고다닐 변수
			for(int j = i; j < myArr.length; j++) {     //  j= i 인 이유는 가장 큰수가 제일 앞으로 오므로, 건드릴 필요가 없다
				if(myArr[max] < myArr[j]) {
					max = j;
				}
			} 			// max에 가장 큰 값의 인덱스 번호가 남아있다.
		 		// 찾아놓은 큰 값이랑 i번째 앞부분 값이랑 자리교환
		  
			int tmp1 = myArr[i];
			myArr[i] = myArr[max];
			myArr[max] = tmp1;
		}
		
		
		//출력해서 확인
		for(int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i] + "  ");
		}
		
		sc.close();
	}

}
