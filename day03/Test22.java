package day03;

import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//문제1. 0 ~ 10 까지 출력해보세요.
		/*
		int a = 0;
		
		while (a<=10) {
			System.out.println(a);
			a++;
		}
		*/
////////////////////////////////////////////////////////////
		
		//문제2. 1 ~ 15 까지 출력해보세요.
		/*
		int b = 1;
		
		while (b <= 15) {
			System.out.println(b);
			b++;
		}
		*/
////////////////////////////////////////////////////////////
		
		//문제3. 0 ~ 100까지 10단위로 출력해보세요.
		/*
		int c = 0;
		
		while (c <= 10) {
			System.out.println(c*10);
			c++;
		}
		*/
////////////////////////////////////////////////////////////
		
		//문제4. 1 ~ 20까지 홀수만 출력해보세요.
		/*
		int d = 1;
		
		while (d <= 20) {
			if(d%2 == 1) {               // 홀수 구하는 방법
				System.out.println(d);
			}
			d++;
		}
		*/
		
////////////////////////////////////////////////////////////
			
		//문제5. 1 ~ 10까지의 합을 출력해보세요
		/*
		int i = 1;
		int sum = 0;
		
		while (i <= 10) {
			sum = sum + i;       // sum +=  i; 같은 형식이다.
			i++;
		}
		System.out.println(sum);
		*/
		
////////////////////////////////////////////////////////////

		//문제6. 1 ~ 50까지의 짝수의 합을 출력해보세요
		/*
		int j = 1;
		int sum2 = 0;
		
		while (j <= 50) {
			if(j%2 == 0) {			 // 짝수 구하는 방법
				sum2 = sum2 + j;     // sum2 +=  j;
			}
			j++;
		}
		System.out.println(sum2);
		*/
////////////////////////////////////////////////////////////

		/*문제7 주문프로그램
		 	*** Jonny 카페 메뉴 ***
		 	1. 아메리카노 : 1500원
		 	2. 카페라떼 : 3000원
		 	3. 카푸치노 : 3500원
		 	4. 카라멜마끼야또 : 4000원
		 	5. 샌드위치 : 6000원
		 	6. 종료
		 	단계1.  메뉴를 출력하고, 메뉴 번호로 주문을 받는다.
		 			종료를 선택할때까지 주문받을 수 있고, 종료 선택시 주문 총 금액 출력. 종료
		 	단계2. int money = 20000; 내 돈에서 주문금액 차감, 돈이 부족하면 주문 못하게 하고, 
		 		   총액 출력시 전액도 출력.
		 	*/	  
 
		//Scanner sc = new Scanner(System.in);
		/*
		int tot = 0;       //주문한 금액을 누적해서 가지고 있을 변수 미리 만들기
		while(true) {
			System.out.println("================================");
			System.out.println("*** Jonny 카페 메뉴 *** \n"
				 +	"1. 아메리카노     : 1500원\n"
			 	 +	"2. 카페라떼       : 3000원\n"
			 	 +	"3. 카푸치노       : 3500원\n"
				 +	"4. 카라멜마끼야또 : 4000원\n"
			 	 +	"5. 샌드위치       : 6000원\n"
			 	 +	"6. 종료");
				
			System.out.println("================================");
			System.out.println("원하시는 메뉴 번호를 눌러주세요");
			int menu = Integer.parseInt(sc.nextLine());
		
			if(menu == 1) {
				System.out.println("아메리카노를 주문하셨습니다.");
				tot += 2500; 
			}else if(menu == 2) {
				System.out.println("카페라떼를 주문하셨습니다.");
				tot += 3000;
			}else if(menu == 3) {
				System.out.println("카푸치노를 주문하셨습니다.");
				tot += 3500;
			}else if(menu == 4) {
				System.out.println("카라멜마끼야또를 주문하셨습니다.");
				tot += 4000;
			}else if(menu == 5) {
				System.out.println("샌드위치를 주문하셨습니다.");
				tot += 6000;
			}else if(menu == 6) { 		// 종료 시점 
				System.out.println("주문 총액 : " + tot + "원");
				break; 			//  while문 빠져나가라 => 강제 종료! 
			}else {
				System.out.println("잘못된 메뉴번호 입력하셨습니다. 다시 눌러주세요.");
			}
		}
		System.out.println("주문 감사합니다.");
		*/
////////////////////////////////////////////////////////////
			
		//문제8. -1이 입력될 때 까지 정수를 계속 입력받아, 합과 평균을 구하여 출력해보세요

		
		int input = 0;
		int sum = 0;
		//double avg = 0;

		
		while (true) {
			System.out.println("숫자를 입력해 주세요>>");
			input = Integer.parseInt(sc.nextLine());
			sum = sum + input;
	
			if (input == -1); {
				break;
			}
		}
		System.out.println(sum);
		
	
		
////////////////////////////////////////////////////////////
		
		//문제9. 문자열을 입력받아 출력하되, exit를 입력받으면 종료되는 프로그램
		//       힌트 : String 문자열 비교는 String의 가능 중 .equals()메서드를 이용
		// 		 String str = "abc";
		// 		 System.out.println(str.equals("abc"));

		sc.close();
		
	}		
	
}
