package day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashTest02 {

	public static void main(String[] args) {
		
		// 영한 사전만들기
		// HashMap을 이용하여 10개의 단어를 영어, 한글의 쌍으로 저장하고,
		// 입력받은 영어의 한글뜻을 출력해주는 프로그램을 만들어 보세요.
		// 10개 단어는 미리 지정해놓고,
		// exit를 입력할 때까지 계속 검색할 수있게 만드세요.
		// 찾는 단어가 없으면 "찾는 단어가 없습니다.."라는 메세지 출력
		
		// 객체생성
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> h = new HashMap<String, String>();
		
		// 요소 저장
		h.put("dog", "강아지");
		h.put("cat", "고양이");
		h.put("cow", "소");
		h.put("pig", "돼지");
		h.put("sheep", "양");
		h.put("horse", "말");
		h.put("bird", "새");
		h.put("mouse", "쥐");
		h.put("rabbit", "토끼");
		h.put("tiger", "호랑이");
		
		while(true) {
			System.out.println("동물이름을 입력하세요");
			String eng = sc.nextLine();
			if(eng.equals("exit" )) {
				System.out.println("프로그램 종료");
				break;
			}
			
			String kor = h.get(eng);
			if(kor == null) {
				System.out.println("찾는단어가 없습니다.");
			}else {
				System.out.println(kor);
			}
		}
		sc.close();
	}

}
