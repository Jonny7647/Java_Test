package day02;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		
		// 점수를 입력받고, 90점 이상이면 "수"
		// 80점 이상이면 "우", 70점 이상이면 "미"
		// 그 이하는 "재시험" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");       
		int score = Integer.parseInt(sc.nextLine());
		 
		if(score >= 90) {
			System.out.println("수");
		}else if(score >= 80) {              // else if(score <90 && score >= 80) 
			System.out.println("우");
		}else if(score >= 70) {              // else if(score <80 && score >= 70) 
			System.out.println("미");
		}else {
			System.out.println("재시험");
		}
		
		sc.close();
		
	}

}
