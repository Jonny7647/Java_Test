package day12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
	HashMap을 이용하여 학생이름과 자바 점수를 기록하는 관리 프로그램을 만드세요. 
	아래 프로그램 메뉴에서 각 번호로 서비스를 선택하고, 6번을 입력받으면 프로그램 종료. 
	*** 자바 성적 관리 프로그램 ***
	1. 전체 조회
	2. 등록
	3. 수정
	4. 삭제
	5. 전체 평균
	6. 프로그램 종료 
	
*/
public class CollEx04 {
	
	static void menu() {
		System.out.println("**자바 성적 관리 프로그램**");
		System.out.println("1. 전체 조회");
		System.out.println("2. 등록");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("5. 전체 평균");
		System.out.println("6. 프로그램 종료");
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		System.out.println("기록 관리 프로그램 시작!");
		
		menu();
		
		while(true) {
			System.out.println("서비스 선택 (1~6) >> ");
			int num = Integer.parseInt(sc.nextLine());
			if ( num == 1 ) {
				if ( h.size() == 0 ) {
					System.out.println("등록된 학생이 없습니다.");
				} else {
					System.out.println(h);
					System.out.println("조회완료!");
				}	
			}else if ( num == 2 ) {
				System.out.println("학생 이름 >> ");
				String name = sc.nextLine();
				System.out.println("자바 점수 >>");
				int score = Integer.parseInt(sc.nextLine());
				h.put(name, score);
				System.out.println("등록완료!");
			}else if ( num == 3 ) {
				System.out.println("학생 이름 >>");
				String name = sc.nextLine();
				System.out.println("수정할 점수 >>");
				int score = Integer.parseInt(sc.nextLine());
				h.put(name, score);
				System.out.println("수정완료!");
			}else if ( num == 4 ) {
				System.out.println("삭제할 학생 이름 >>");
				String name = sc.nextLine();
				h.remove(name);
				System.out.println("삭제완료!");
			}else if ( num == 5 ) {
				Collection<Integer> col = h.values();
				Iterator<Integer> it = col.iterator();
				int sum = 0;

				while(it.hasNext()) {
					int val = it.next();
					sum += val;
				}

				double avg = sum / h.size();
				System.out.println("전체 평균 : " + avg);
			}else if ( num == 6 ) {
				System.out.println("프로그램 종료!");
				break;
			}else System.out.println("잘못입력!!");
			
		}
		
		sc.close();
	}
}