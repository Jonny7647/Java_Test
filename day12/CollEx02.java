package day12;

import java.util.ArrayList;
import java.util.Scanner;

/* ArrayList
	Scanner 클래스로 -1이 입력될때까지 양의 정수를 입력받아 ArrayList에 저장하고, 
	ArrayList를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하세요.
*/
public class CollEx02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		System.out.println("양의 정수를 입력하세요 >> ");

		while(true) {
			int num = Integer.parseInt(sc.nextLine());
			if(num == -1) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
			arr.add(num);
			}
		}
		
		for(int i = 0; i < arr.size();  i++) {		// length가 아닌 size()
			System.out.println(arr.get(i));
		}
		
		// 최대값 찾기
		int max = 0;
		for(int i = 0; i < arr.size();  i++) {
			if(arr.get(max) < arr.get(i)) {
				max = i;
			}
		}
		
		System.out.println("가장 큰 숫자는 : " + arr.get(max));
		
		sc.close();
	}
}
